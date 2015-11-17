public class Car{
  private String makeModel;
  private double position;
  private double totalDist;
  private boolean isBroken;
  private static int numCars = 0;

  public Car(){
    this.makeModel="";
    this.position = 0;
    this.totalDist=0;
    this.isBroken=false;
    numCars++;
  }
  public Car(String makeModel, double pos, double dist, boolean broke){
    this.makeModel=makeModel;
    this.position=pos;
    this.totalDist=dist;
    this.isBroken=broke;
    numCars++;
  }
  public Car(String makeModel, double pos){
    this.makeModel=makeModel;
    this.position=pos;
    this.totalDist=0;
    this.isBroken=false;
    numCars++;
  }
  public void printAllInfo(){
    System.out.println("makeModel: "+ makeModel);
    System.out.println("position: "+ position);
    System.out.println("totalDist: "+ totalDist);
    System.out.println("isBroken: "+ isBroken);
  }
  public double getPosition(){
    return position;
  }
  public String getModel(){
    return makeModel;
  }
  public double getTotalDistance(){
    return totalDist;
  }
  public boolean getIsBroken(){
    return isBroken;
  }
  public double getNumCars(){
    return numCars;
  }
  public void drive(double howMuch){
    if (this.isBroken)
      throw new IllegalArgumentException("This car of id "+this.numCars+ " is broken");
    position += howMuch;
    totalDist += Math.abs(howMuch);
  }
}
