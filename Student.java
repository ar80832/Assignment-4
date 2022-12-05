import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Student extends Person{
  private String name;
  private String address;
  private String phone;
  private int year;

  public Student(String newName, String address, String phone, int year) {
    super(newName, address, phone);
    this.newName = newName;
    this.address = address;
    this.phone = phone;
    this.year = year;
  }

  public Student(String name) {
    super(name);
    this.newName = "ella";
    this.phone = "777-777-7777";
    this.address = "none";
    this.year = 2022;
  }

  public void setGraduationYear(int year) {
    this.year = year;
  }

  public int getGraduationYear() {
    return year;
  }

  public void getData() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter expected graduation year               : ");
    year = reader.nextInt();
    reader.close();
  }
  
  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", expected Grad Year=" + year + "]";
  }

  public static void main(String[] args) {

  }

}
