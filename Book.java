// Gustavo Barbosa da Silva CB3010627

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		String string = "Book[name=" + name + ", authors={";
		for (Author author : authors) {
			string += author.toString();
		}
		string += "}, price=" + price + ", qty=" + qty + "]";

		return string;
	}

	public String getAuthorNames() {
		String names = "";
		for (Author author : authors) {
			names += author.getName() + ",";
		}

		return names;
	}
}
