import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import Person;
import Employee;
import Student; 


class Persons {
  

  public List<Person> getInternalList() {
    List<Person> personRecords = new LinkedList<Person>();
    int numberOfRecords = personRecords.size();

    return personRecords;
  }

  public Persons() {
    List<Person> personRecords = new LinkedList<>();
    int numberOfRecords = personRecords.size();
  }
  
  public Persons search(String name) {
    boolean nameFound = false;
    for (int i = 0; i < personRecords.size(); i++) {
      String nameSearched = personRecords.getName(i);
      if (nameSearched.equalsIgnoreCase(name)) {
        nameFound = true;
        int j = i;
      }
    }
    if (nameFound == true) {
      return personRecords(j);
    }
    else {
      return none;
    }

  }

  public static void add(Person p) {
    personRecords.append(p);
  }

  public static void add(Employee p) {
    personRecords.append(p);
  }

  public static void add(Student p) {
    personRecords.append(p);
  }

  public static int getSize() {
    return personRecords.size();
  }
  
  public static void delete(int i) {
    personRecords.remove(i);
  }
  

  public static void main(String[] args) {


  }
}
