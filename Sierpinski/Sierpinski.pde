void setup() {
   background(255);
   size(800,800);
   smooth();
   //fill(0,0,0);
   //noFill();
   //triangle(0,height, width/2, height-(int)(tan(radians(60))*width/2), width, height);
   //Triangle b = new Triangle(width/2, height/2, 200);
   //b.drawTriangle();
   fractal(0,height, width/2, height-(int)(tan(radians(60))*width/2), width, height, 2);
   //fractal(0,0, width/2, height-(int)(tan(radians(60))*width/2), width, height, 2);
}

// keep draw() here to continue looping while waiting for keys
void draw() {
}

void fractal(int x1, int y1, int x2, int y2, int x3, int y3, int n) {
  if(n>0){
    float w = (x3-x1);
    float h = tan(radians(60))*w/2;
    noFill();
    System.out.println(h);
    triangle(x1, y1, x2, y2, x3, y3);
    //triangle(x1, y1, (int)(x1+w) , y1, (int)(w/2), (int)(h));
    //fractal(x1, y1, (int)(w/2), (int)(h-(tan(radians(60))*w/2)), (int)(w/2), (int)h, n-1);
    fractal();
  }
}
class Triangle{
  int x, y;
  float h, w;
  public Triangle(int a, int b, float w){
    this.x=a;
    this.y=b;
    this.w=w;
    this.h=(tan(radians(60))*this.w/2);
  }
  public void drawTriangle(){
    noFill();
    triangle(this.x, this.y, (int)(this.w/2), (int)(this.w/2), this.w, this.x);
  }
}