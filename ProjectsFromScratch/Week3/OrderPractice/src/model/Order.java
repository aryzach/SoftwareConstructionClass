package model;

public class Order {

    //fields
    private int ticketNumber;
    private String customerName;
    private String status;
    private String instructions;
    private char comboID;
    private double price;

    public Order(int ticketNumber, String customerName, char comboID){
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.comboID = comboID;
        this.status = "incomplete";
        setPrice();
    }

    //getters
    //EFFECTS: returns status
    //!!!
    public String getStatus(){
        return status;
    }

    //EFFECTS: returns instructions
    public String getInstructions(){
        return instructions;
    }

    public double getPrice(){
        return price;
    }

    //setters
    //MODIFY: this
    //EFFECTS: set status to complete
    public void setStatusToComplete(){
        this.status = "complete";
    }

    //REQUIRE: this.status to be "incomplete"
    //MODIFY: this
    //EFFECTS: if status is incomplete, set instructions to the given string
    //!!!
    public void setInstructions(String instructions){
        if(status == "incomplete"){
            this.instructions = instructions;
        }

    }

    //REQUIRE: comboID to be valid comboID
    //MODIFY: this
    //EFFECTS: set the price of this to reflect the price of the combo ordered
    //!!!
    private void setPrice(){
        if(this.comboID == 'A'){this.price = 1.0;}
        else if(this.comboID == 'B'){this.price = 2.0;}
        else if(this.comboID == 'C'){this.price = 3.0;}
        else{this.price = 4.0;}
    }

    //other functions
    //REQUIRE: status should be complete
    //EFFECTS: print receipt in the form customerName, comboID, price to st.out
    //!!!
    private void printCustomerReceipt(){
        System.out.println(customerName+comboID+price);
    }

    //REQUIRE: status should be incomplete
    //EFFECTS: print ticket in form ticketNumber, customerName, instructions, comboID to st.out
    //!!!
    private void printKitchenTicket(){
        System.out.println(ticketNumber+customerName+instructions+comboID);
    }

    //EFFECTS: if status is complete, print customer receipt, else, print kitchen ticket
    //!!!
    public void isOrderComplete(){
        if(status == "incomplete"){printKitchenTicket();}
        else if(status == "complete"){printCustomerReceipt();}
        else{System.out.println("status error");}
    }


}
