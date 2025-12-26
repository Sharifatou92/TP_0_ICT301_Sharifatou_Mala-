package ict301.solid.isp;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // Robot does not eat
        throw new UnsupportedOperationException();
    }
}
