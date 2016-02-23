public class Ball extends Sprite implements Movable{
  int radius;
  private int v_x, v_y;
  public Ball(int x, int y, int r, int xspeed, int yspeed) {
    super(x, y);
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
  public void wallHit(int wallWidth, int wallHeight){
    if( (this.x - this.radius) <= 0 || (wallWidth - (this.x + this.radius)) <= 0 )
      this.flipX();
    if( (this.y - this.radius) <= 0 || (wallHeight - (this.y + this.radius)) <= 0)
      this.flipY();
  }
  public void Display() {
    fill(255,0,0);
    ellipse(this.x, this.y, this.radius*2, this.radius*2);
  }
}