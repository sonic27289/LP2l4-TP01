// Gustavo Barbosa da Silva CB3010627

public class testStudent {
  public static void main(String[] args) throws Exception {

    Student student = new Student("Desenvolvedor Front-End", "Avenida Santo Amaro", "JavaScript", 2021, 2.0);

    System.out.println("Name: " + student.getName());
    System.out.println("Adress: " + student.getAdress());
    System.out.println("Program: " + student.getProgram());
    System.out.println("Year: " + student.getYear());
    System.out.println("Fee: " + student.getFee());

    student.setProgram("javascript");
    student.setYear(2021);
    student.setFee(2.0);

    System.out.println(student.toString());
  }
}