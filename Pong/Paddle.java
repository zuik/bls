public class Paddle extends Sprite {
	private int w,h;
	private int moveSpeed;
	public Paddle(int x, int y, int w, int h, int speed) {
		super(x, y);
		this.w = w;
		this.h = h;
		this.moveSpeed = speed;
	}
	public void moveUp() {
		y -= moveSpeed;
	}
	public void moveDown() {
		y += moveSpeed;
	}	
	public int getWidth() {
		return w;
	}
	public int getHeight() {
		return h;
	}
	public void changeWidth(int w){
		this.w = w;
	}
	public void changeHeight(int h){
		this.h = h;
	}
	public void Display() {
		fill(0, 255, 0);
		rect(x, y, w, h);
	}
}