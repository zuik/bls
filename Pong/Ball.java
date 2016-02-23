public class Ball extends Sprite implements Movable{
	private int radius;
	private int v_x, v_y;
	public Ball(int x, int y, int r, int xspeed, int yspeed) {
		super(x, y);
		this.v_x = xspeed;
		this.v_y = yspeed;
		this.radius = r;
	}
	public void move() {

	}	
	public int getRadius() {
		return this.radius;
	}
	public void flipX() {
		this.v_x *= (-1);
	}
	public void flipY() {
		this.v_y *= (-1);
	}
	public void Display() {
		fill(255,0,0);
		ellipse(this.x, this.y, this.radius, this.radius);
	}
}