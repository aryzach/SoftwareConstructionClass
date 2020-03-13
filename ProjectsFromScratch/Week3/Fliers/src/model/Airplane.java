package model;

public abstract class Airplane implements Flyer, Café {
    @Override
    public void serveDrinks() {
        System.out.println("serve drinks");
    }

    @Override
    public void serveSnacks() {
        System.out.println("serve snacks");
    }

    @Override
    public void takeoff() {
        System.out.println("takeoff");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void land() {
        System.out.println("land");
    }

    public abstract void dothis();
}
