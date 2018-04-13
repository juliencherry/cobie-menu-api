package cobie;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class MenuController {

	@RequestMapping(value = "/menu/today", method = RequestMethod.GET, produces = "application/json")
	public String menu() {
		MenuScraper scraper = new MenuScraper();
		Gson gson = new Gson();

		try {
			return gson.toJson(scraper.getTodaysMenu());
		} catch (IOException e) {
			return "{\"response\": \"500\"}";
		}
	}
}