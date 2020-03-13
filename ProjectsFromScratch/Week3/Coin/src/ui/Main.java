package ui;

import model.Coin;

public class Main {

    public static void main(String[] args){
        Coin c = new Coin();
        for(int i=0; i<10; i++) {
            c.flip();
            System.out.println(c.checkStatus());
        }
    }
}
