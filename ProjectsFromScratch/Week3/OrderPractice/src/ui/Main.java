package ui;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();

        Order firstOrder = new Order(5,"me", 'A');
        Order secondOrder = new Order(6,"you", 'B');
        Order thirdOrder = new Order(7,"other person", 'C');
        allOrders.add(firstOrder);
        allOrders.add(secondOrder);
        allOrders.add(thirdOrder);

        secondOrder.setStatusToComplete();

        firstOrder.setInstructions("cook");
        secondOrder.setInstructions("cook this too");

        for(Order order : allOrders){
            order.isOrderComplete();
        }
    }

}
