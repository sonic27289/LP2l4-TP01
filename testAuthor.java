// Gustavo Barbosa da Silva CB3010627

public class testAuthor {
	public static void main(String[] args) {
		Author author = new Author("Gustavo", "gustavo@email.com", 'm');
		String toString = author.toString();
		System.out.println(toString);

		author.setEmail("sonic@gmail.com");

		String nomeAutor = author.getName();
		String emailAutor = author.getEmail();
		char generoAutor = author.getGender();

		System.out.printf("nome=%s, email=%s, gender=%c\n", nomeAutor, emailAutor, generoAutor);
	}
}
