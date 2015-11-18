public class CarTester{
  public static void main(String[] agh){
    Car a = new Car("Hondda", 0.0, 50.0, false);
    Car b = new Car("American", 0.0, 0.0, true);
    //b.drive(6.0);
    a.printAllInfo();
    b.printAllInfo();
    System.out.println(b.getNumCars());
    a.drive(5.0);
  }
}
