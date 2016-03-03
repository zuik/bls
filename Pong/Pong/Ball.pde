public class Ball extends Sprite implements Movable{
  int radius;
  private int v_x, v_y;
  public Ball(int x, int y, int r, int xspeed, int yspeed, int rand) {
    super(x+rand, y+rand);
    this.v_x = xspeed;
    this.v_y = yspeed;
    this.radius = r;
  }
  public void move() {
    this.x += v_x;
    this.y += v_y;
  }  
/*  public int getRadius() {
    return this.radius;
  } */
  public void flipX() {
    this.v_x *= (-1);
  }
  public void flipY() {
    this.v_y *= (-1);
  }
  public void resetBall(int w, int h){
    this.x = (int) random(w);
    this.y = (int) random(h);
  }
  public boolean wallHit(int wallWidth, int wallHeight){
    if( (this.x - this.radius) <= 0 || (wallWidth - (this.x + this.radius)) <= 0 ){
      this.flipX();
      return true;
     // this.x = 200;
     // this.y = 200;
    }
    if( (this.y - this.radius) <= 0 || (wallHeight - (this.y + this.radius)) <= 0){
      this.flipY();
      return false;
    }
    return false;
  }
  public void Display() {
    fill(255,0,0);
    ellipse(this.x, this.y, this.radius*2, this.radius*2);
  }
}