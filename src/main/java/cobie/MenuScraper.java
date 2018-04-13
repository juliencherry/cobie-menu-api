package cobie;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuScraper {

	public List<MenuItem> getTodaysMenu() throws IOException {
		Document document;
		document = Jsoup.connect("http://www.cobie.de/speisekarte?wmode=transparenartt").get();

		Element foodCarousel = document.body().selectFirst(".foodCarousel");
		Elements days = foodCarousel.select("> div");
		Element today = days.first();
		Elements items = today.select("> div");

		List<MenuItem> menuItems = new ArrayList<MenuItem>();
		for (Element item : items) {
			String title = item.selectFirst(".cobie-product-name").text();
			String price = item.selectFirst(".price").text();
			String description = item.selectFirst(".cobie-product-description").text();
			menuItems.add(new MenuItem(title, price, description));
		}

		return menuItems;
	}
}
