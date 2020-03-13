package tests;

import model.Lettuce;
import org.junit.Before;

public class LettuceTest extends VegetableTest {

    @Before
    public void setup(){
        testVegetable = new Lettuce();
    }
}
