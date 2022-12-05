import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Employee extends Person{
  

  private String name;
  private String address;
  private String phone;
  private String department;

  public Employee(String newName, String address, String phone, String department) {
    super(newName, address, phone);
    this.newName = newName;
    this.address = address;
    this.phone = phone;
    this.department = department;
  }

  public Employee(String name) {
    super(name);
    this.newName = "shawn";
    this.phone = "999-999-9999";
    this.address = "none";
    this.department = "CICS";
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public void getData() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter expected graduation year               : ");
    department = reader.nextLine();
    reader.close();
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", department=" + department
        + "]";
  }

  public static void main(String[] args) {

  }
}
