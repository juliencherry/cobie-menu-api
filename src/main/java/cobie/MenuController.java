package cobie;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class MenuController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String menu() {
		MenuScraper scraper = new MenuScraper();

		try {
			return scraper.getTodaysMenu().toString();
		} catch (IOException e) {
			// oh no!
		}
		return "500";
	}
}