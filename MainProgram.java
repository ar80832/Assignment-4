import java.util.*;
import java.util.Scanner;
import Person;
import Employee;
import Student;
import Persons; 

class MainProgram {

  public enterNewPerson(){
    Person p = new Person();
    p.getData();
    Scanner reader = new Scanner(System.in);
    System.out.println("Is the new person a student? Enter Y if yes.");
    String isStudent = reader.nextLine();
    if(isStudent.equalsIgnoreCase("Y")){
      Student s = new Student();
      s.getData();
      Persons.add(s);
    }
    else{
      System.out.println("Is the new person a employee? Enter Y if yes.");
      String isEmployee = reader.nextLine();
      if(isEmployee.equalsIgnoreCase("Y")){
        Employee e = new Employee();
        e.getData();
        Persons.add(e);
    }
    }

  }

  public static void main(String[] args) {
    System.out.println("Enter option from list below:");
    System.out.println("  1) Display complete directory");
    System.out.println("  2) Enter new person");
    System.out.println("  3) Search for person");
    System.out.println("  4) Modify Person information");
    System.out.println("  5) Delete a record");
    System.out.println("  Q) Quit");
    Scanner reader = new Scanner(System.in);
    String userRequest = reader.nextLine();
    userRequest = userRequest.toUpperCase();

    if (userRequest.equals("1")) {
      print personRecords;
    }
    else if (userRequest.equals("2")) {
      MainProgram.enterNewPerson();
    }
    else if (userRequest.equals("3")) {
      System.out.println(Persons.search(s));
    }
    else if (userRequest.equals("4")) {
      Scanner readRequest = new Scanner(System.in);
      String modifyRequest = readRequest.nextLine();
      Person.search(modifyRequest);
      Scanner readConfirmation = new Scanner(System.in);
      System.out.println("Is this the record you want to modify? Y for yes.");
      String confirmRequest = readConfirmation.nextLine();
      if (confirmRequest.equalsIgnoreCase("Y")){
        modifyRequest.getData();
      }
    }
    else if (userRequest.equals("5")) {
      Scanner readRequest = new Scanner(System.in);
      int deleteRequest = readRequest.nextInt();
      Persons.delete(deleteRequest);

    }
    else if (userRequest.equals("Q")) {
      System.out.println("Have a good day.");
    }
    else {
      System.out.println("That is not a valid option. Please try again.");
    }
      



      }

  public void recordsTest() {
    Persons.delete(3);
    Persons.enterNewPerson();
  }

  
}
