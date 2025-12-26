package ict301.solid.lsp;

public class Main {

    static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Expected area = 20, got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        testRectangle(rectangle);

        Rectangle square = new Square();
        testRectangle(square); // comportement incorrect
    }
}
