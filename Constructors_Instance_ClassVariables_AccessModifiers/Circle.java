package  Constructors_Instance_ClassVariables_AccessModifiers;
class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining to parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
