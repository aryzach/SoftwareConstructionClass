package tests;

import model.Order;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrderTest {
    Order testOrder;

    @Before
    public void setup(){
        testOrder = new Order(1,"test name", 'A');
    }

    @Test
    public void testGetStatus(){
        assertEquals(testOrder.getStatus(), "incomplete");
    }

    @Test
    public void testSetStatusToComplete(){
        testOrder.setStatusToComplete();
        assertEquals(testOrder.getStatus(), "complete");
    }

    @Test
    public void testSetInstructionsStatusIncomplete(){
        testOrder.setInstructions("do it");
        assertEquals(testOrder.getInstructions(), "do it");
    }

    @Test
    public void testSetInstructionsStatusComplete(){
        testOrder.setStatusToComplete();
        testOrder.setInstructions("do it");
        assertEquals(testOrder.getInstructions(), null);
    }

    @Test
    public void testSetPrice(){
        assertEquals(testOrder.getPrice(), 1.0);
    }





}
