package model;

import java.util.Random;

public class Coin {

    private Integer status;

    public Coin(){
        status = 0;
    }

    // REQUIRE: none
    // MODIFY: this
    // EFFECT: randomize the status of this
    public void flip(){
        Random ran = new Random();
        boolean b = ran.nextBoolean();
        if(b){
            this.status = 0;
        }
        else{
            this.status = 1;
        }
    }

    // REQUIRE: none
    // MODIFY: none
    // EFFECT: return the status of this
    public Integer checkStatus(){
        return status;
    }

    //getters
    public int getStatus(){
        return status;
    }
}
