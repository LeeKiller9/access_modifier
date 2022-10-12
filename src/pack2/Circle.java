package pack2;


public class Circle {
    final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea () {
        return PI * Math.pow(this.radius,2);
    }
}
