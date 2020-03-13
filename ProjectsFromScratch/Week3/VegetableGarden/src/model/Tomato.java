package model;

public class Tomato extends Vegetable {

    public Tomato(){
        super("Tomato", VegType.SEED);
        setInstructions("grow then pick tomato in late summer");
    }

    //EFFECTS: prints "feed tomato"
    public void feed(){
        System.out.println("feed tomato");
    }

    //EFFECTS: prints "water tomato"
    public void water(){
        System.out.println("water tomato");
    }

    //EFFECTS: print "harvest tomato"
    public void harvest(){
        System.out.println("harvest tomato");
    }

}
