package model;

public class Carrot extends Vegetable {

    public Carrot(){
        super("Carrot", VegType.ROOT);
        setInstructions("grow carrot");
    }

    //EFFECTS: prints "feed carrot"
    public void feed(){
        System.out.println("feed carrot");
    }

    //EFFECTS: prints "water carrot"
    public void water(){
        System.out.println("water carrot");
    }

    //EFFECTS: print "harvest carrot"
    public void harvest(){
        System.out.println("harvest carrot");
    }
}
