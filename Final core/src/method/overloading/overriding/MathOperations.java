package method.overloading.overriding;

// Method Overloading (Compile-time Polymorphism)
public class MathOperations {

	// Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
    
}
