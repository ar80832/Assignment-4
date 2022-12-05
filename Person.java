import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

class Person {
  private String name;
  private String address;
  private String phone;

  public Person(String newName, String address, String phone) {
    this.newName = newName;
    this.address = address;
    this.phone = phone;
  }

  public Person(String name) {
    this.newName = "brian";
    this.address = "none";
    this.phone = "555-555-5555";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() { 
    return phone;
  }

  public String getAddress() {
    return age;
  }

  public void setAddress(int age) {
    this.age = age;
  }

  public void getData() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter name                          : ");
    name = reader.nextLine();
    System.out.println("Enter address                          : ");
    address = reader.nextLine();
    System.out.println("Enter phone number                          : ");
    phone = reader.nextLine();
    reader.close();
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
  }

  public static void main(String[] holder) {
    
  }

}
