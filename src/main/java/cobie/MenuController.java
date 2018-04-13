package cobie;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MenuController {

	@RequestMapping(value = "/menu/today", method = RequestMethod.GET, produces = "application/json")
	public String menu(HttpServletResponse response) {
		MenuScraper scraper = new MenuScraper();
		Gson gson = new Gson();

		try {
			return gson.toJson(scraper.getTodaysMenu());
		} catch (IOException e) {
			response.setStatus(500);
			return "{\"response\": \"Could not get today’s menu from Cobie H2O\"}";
		}
	}
}