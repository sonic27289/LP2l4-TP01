// Gustavo Barbosa da Silva CB3010627

public class testBook {
	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("pamone", "pamone@gmail.com", 'm');
		authors[1] = new Author("kiki", "kiki@gmail.com", 'f');

		Book book = new Book("Java para Monstros", authors, 19.99, 99);
		System.out.println(book.toString());
	}
}
