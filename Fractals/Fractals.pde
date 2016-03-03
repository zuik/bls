import java.util.*;
Vector seed;
int BRANCH = 4;
int DEPTH = 8;
void setup(){
  size(800, 800);
  seed = new Vector(10, height, 600, -90);
  fractal(seed, DEPTH);
}
void draw(){
 // background(255);
}
void fractal(Vector v, int n){
  if (n>0){
    line(v.x, v.y, v.getEndPointX(), v.getEndPointY());
    for (int i=0; i<BRANCH; i++){
      Vector w = new Vector(v.x, v.y, v.r, v.theta);
      w.r = random((float) (0.1*w.r), (float)(0.9*w.r));
      w.x = w.getEndPointX();
      w.y = w.getEndPointY();
      w.theta += random(15,90);
      fractal(w, n-1);
    }
  }
  if (n==0){
    System.out.println("Finished build branch");
  }
}
class Vector{
  int x, y;
  double r, theta;
  public Vector(int a, int b, double r, double theta){
    //a and b is the (x,y) at the base of the vector
    this.x = a;
    this.y = b;
    this.r = r;
    this.theta = theta;
  }
    int getEndPointX() { 
    return (int)(x + r*cos(radians((float)theta)));
  }
  
  int getEndPointY() {
    return (int)(y + r*sin(radians((float)theta)));
  }
  public void drawLine(){
    line(x, y, (float)(x+r*Math.cos(theta)), (float) (y+r*Math.sin(theta)));
  }
}