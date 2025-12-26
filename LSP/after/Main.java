package ict301.solid.lsp;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(5);

        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Square area = " + square.getArea());
    }
}
