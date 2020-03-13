package test;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class CoinTest {

    Coin c;

    @Before
    public void setup() {
        c = new Coin();
    }

    @Test
    public void testConstructor(){
        assertTrue(c.checkStatus() == 0);
    }

    @Test
    public void testCheckStatus(){
        //flip coin
        c.flip();
        //check status !null
        assertNotNull(c.checkStatus());
    }
    @Test
    public void testFlip(){
        //create list object of type int and length 10
        ArrayList<Integer> flips = new ArrayList<Integer>();
        //flip coin
        c.flip();
        //store flip
        flips.add(c.getStatus());
        //flip coin 9 more times and store value
        for(int i = 0; i<9; i++){
            c.flip();
            flips.add(c.getStatus());
        }
        //check sum of flips != 10
        Integer sum = 0;
        for(int value : flips){
            sum += value;
        }
        assertTrue(sum < 10);
        assertTrue(sum>0);
    }

}
