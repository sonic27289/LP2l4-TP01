// Gustavo Barbosa da Silva CB3010627

public class testStaff {

  public static void main(String[] args) throws Exception {

    Staff staff = new Staff("Tiago", "Avenida Atlantica", "Emilio", 100.0);
    System.out.println("Name: " + staff.getName());
    System.out.println("Adress: " + staff.getAdress());
    System.out.println("School: " + staff.getSchool());
    System.out.println("Pay: " + staff.getPay());

    staff.setSchool("Emilio");
    staff.setPay(100.0);

    System.out.println(staff.toString());

  }
}