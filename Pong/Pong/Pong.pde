import java.util.*;
Paddle a, a2;
Ball b;
void setup() {
  size(800, 600);
  a = new Paddle(20, 20, 30, 120, 5);
  a2 = new Paddle(width-20-30, 20, 30, 120, 5);
  b = new Ball(400, 300, 40, 5, 5);
}
void draw() {
  background(255);
  a.Display();
  a2.Display();
  b.Display();
  a.move();
  a2.move();
  b.move();
  b.wallHit(width, height);
  if (b.x <= a.x+a.w+b.radius && a.h >= Math.abs(a.y - b.y)){
    b.flipX();
  }
  System.out.println((b.x + b.radius) + "|" + a2.x);
  if ( (b.x) + b.radius == a2.x  && a2.h >= Math.abs(a2.y - b.y)){
    b.flipX();
  }
}