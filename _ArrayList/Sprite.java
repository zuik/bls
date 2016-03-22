public abstract class Sprite {
	public method f();
}
class Paddle extends Sprite {
	public Paddle(){
	}
	public void f(){
		System.out.print("Hello");
	}
}
class Stuff{
	public static void main(String[] agrs){
		Paddle a = new Paddle();
		a.f();
	}
}