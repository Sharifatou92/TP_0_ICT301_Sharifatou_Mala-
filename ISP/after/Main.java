package ict301.solid.isp;

public class Main {
    public static void main(String[] args) {

        Workable human = new Human();
        human.work();

        Feedable feeder = new Human();
        feeder.eat();

        Workable robot = new Robot();
        robot.work();
    }
}
