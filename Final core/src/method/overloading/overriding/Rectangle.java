package method.overloading.overriding;

// Son
public class Rectangle extends Shape{
	@Override
	void draw() {
		super.draw();
		System.out.println("Drawing a Rectangle");
	}
}
