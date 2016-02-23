public abstract class Sprite{	
	int x,y;
	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void Display();
}

public interface Movable {
	void move();
}