package model;

public class Lettuce extends Vegetable{

    public Lettuce(){
        super("Lettuce", VegType.LEAF);
        setInstructions("grow then pick lettuce");
    }

    //EFFECTS: prints "feed lettuce"
    public void feed(){
        System.out.println("feed lettuce");
    }

    //EFFECTS: prints "water lettuce"
    public void water(){
        System.out.println("water lettuce");
    }

    //EFFECTS: print "harvest lettuce"
    public void harvest(){
        System.out.println("harvest lettuce");
    }
}
