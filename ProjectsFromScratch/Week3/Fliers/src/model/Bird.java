package model;

public class Bird implements Flyer {
    @Override
    public void takeoff() {
        System.out.println("takeoff bird");
    }

    @Override
    public void fly() {
        System.out.println("fly bird");
    }

    @Override
    public void land() {
        System.out.println("land bird");
    }
}
