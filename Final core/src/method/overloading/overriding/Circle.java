package method.overloading.overriding;

// son
public class Circle extends Shape{
	@Override
	void draw() {
		// super.draw();
		System.out.println("Drawing a Circle");
	}
}
