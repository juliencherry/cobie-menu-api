public class MenuItem {

	private String title;
	private String price;
	private String description;

	public MenuItem(String title, String price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public String toString() {
		return this.title + ": " + this.price + "\n" + this.description + "\n";
	}
}
