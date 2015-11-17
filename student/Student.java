import java.util.Scanner;
public class Student{
  String name, mathClass, address;
  int id;
  double gpa;
  public Student(String name, String mathClass, int id, double gpa, String address){
    this.name = name;
    this.mathClass=mathClass;
    this.id = id;
    this.gpa = gpa;
    this.address = address;
  }
  public Student(){
    Scanner hs = new Scanner(System.in);
    System.out.println("Name: ");
    name = hs.nextLine();
    System.out.println("Class: ");
    mathClass=hs.nextLine();
    System.out.println("Address: ");
    address = hs.nextLine();
    gpa = 0.0;
    id = 1;
  }
  public void printStudentInfo(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("GPA: "+gpa);
    System.out.println("Math class: "+mathClass);
    System.out.println("Address: "+address);
  }
  public void updateGPA(double x){
    gpa = x;
  }
  public String graduationStatus(){
    return (gpa<1)?"Not graduating":"Graduating";
  }
  public void changeMathClass(String newClass){
    mathClass = newClass;
  }
}
