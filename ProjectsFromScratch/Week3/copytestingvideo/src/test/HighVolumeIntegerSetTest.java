package test;

import model.HighVolumeIntegerSet;
import model.IntegerSet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class HighVolumeIntegerSetTest {
    private IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new HighVolumeIntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check that number is not in set
        checkSetEmptyDoesntContain(3);

        //insert that number into the set
        testSet.insert(3);

        //check that the number is in the set once
        checkSetContainsOnce(3);
    }

    @Test
    public void testInsertAtHighVolume(){
        for(int i = 0; i < 50000; i++){
            testSet.insert(i);
            assertTrue(testSet.contains(i));
            assertEquals(testSet.size(), i+1);
        }
    }

    @Test
    public void testInsertAlreadyThere(){
        //check that number is not in set
        checkSetEmptyDoesntContain(3);

        //insert that number into the set
        testSet.insert(3);

        //check that the number is in the set once
        checkSetContainsOnce(3);

        //insert that number into the set
        testSet.insert(3);

        //check that the number is in the set once
        checkSetContainsOnce(3);
    }

    private void checkSetEmptyDoesntContain(int num) {
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(num));
    }


    private void checkSetContainsOnce(int num) {
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(num));
    }
}
