public class Student{
  String name, mathClass;
  int id;
  double gpa;
  public void printStudentInfo(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("GPA: "+gpa);
    System.out.println("Math class: "+mathClass);
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