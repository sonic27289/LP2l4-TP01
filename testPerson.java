// Gustavo Barbosa da Silva CB3010627

public class testPerson {
  public static void main(String[] args) throws Exception {

    Person person = new Person("Mateus", "Avenida Guarapiranga");

    System.out.println("Author: " + person.getName());
    System.out.println("Adress: " + person.getAdress());

    person.setAdress("Avenida Guarapiranga");
    System.out.println(person.toString());
  }
}