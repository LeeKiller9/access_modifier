package pack1;
import pack2.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(2.0);
        System.out.println("Radius: " + myCircle.getRadius() + " -- Color: " + myCircle.getColor());
    }
}
