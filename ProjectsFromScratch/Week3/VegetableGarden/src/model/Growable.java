package model;

public interface Growable {

    //MODIFY: this?
    //EFFECTS: feeds the growable (maybe feed, water, and harvest just prints something out)
    void feed();

    //MODIFY: this?
    //EFFECTS: give water to this plant
    void water();

    //EFFECTS: returns the instructions
    String getInstructions();

    //REQUIRE: growable is harvest-able
    //MODIFY: this?
    //EFFECTS: harvests the growable
    void harvest();

}
