package tests;

import model.Tomato;
import org.junit.Before;

public class TomatoTest extends VegetableTest {

    @Before
    public void setup(){
        testVegetable = new Tomato();
    }
}
