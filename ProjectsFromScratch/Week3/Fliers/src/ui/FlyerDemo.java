package ui;

import model.Airplane;
import model.Bird;
import model.Café;
import model.PrivatePlane;

public class FlyerDemo {
    public static void main(String[] args) {
        Bird birdie = new Bird();
        Airplane planie = new Airplane();
        Café caféPlane = new Airplane();

        birdie.fly();
        caféPlane.serveDrinks();

        FlyerDemo fd = new FlyerDemo();
        fd.firstPartOfFlight(planie);
        fd.lunchService(caféPlane);
        fd.lunchService(planie);

        PrivatePlane pp = new PrivatePlane();
        pp.fly();
        pp.bringWarmTowels();

        Airplane pap = new PrivatePlane();
        pap.serveSnacks();
        pp.serveSnacks();
        pap.dothis();



    }

    public void lunchService(Café c){
        c.serveDrinks();
        c.serveSnacks();
    }

    public void firstPartOfFlight(Airplane a){
        a.takeoff();
        a.serveDrinks();
    }
}
