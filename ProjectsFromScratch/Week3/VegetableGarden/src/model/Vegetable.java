package model;

public abstract class Vegetable implements Growable{

    String name;
    VegType type;
    String instructions;


    public Vegetable(String name, VegType type){
        this.name = name;
        this.type = type;
    }

    //getters

    public String getName(){return "";}
    public String getInstructions(){return "";}
    public VegType getType(){return type;}

    //setters
    public void setName(String name){}
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }


}
