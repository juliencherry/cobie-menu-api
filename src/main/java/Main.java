import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		MenuScraper scraper = new MenuScraper();

		try {
			List<MenuItem> todaysMenu = scraper.getTodaysMenu();
			System.out.println(todaysMenu);
		} catch (IOException e) {
			System.out.println("Couldn’t get today’s menu :(");
		}
	}
}