package ict301.solid.ocp;

public class Main {
    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);

        System.out.println("Rectangle area: " +
            calculator.calculateArea(rectangle));

        System.out.println("Circle area: " +
            calculator.calculateArea(circle));
    }
}
