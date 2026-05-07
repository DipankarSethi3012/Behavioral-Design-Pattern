package without;

import java.util.ArrayList;
import java.util.List;

public class Without {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();
        items.add(new PhysicalProduct());
        items.add(new DigitalProduct());
        items.add(new GiftCardProduct());
        double cost = 0;
        for(Object item : items) {
            if(item instanceof PhysicalProduct) {
                PhysicalProduct product = (PhysicalProduct)item;
//                System.out.println("Calling the invoice method for the physical product");
                product.printInvoice();
                cost += product.calculateShippingCost();
            } else if (item instanceof DigitalProduct) {
                DigitalProduct product = (DigitalProduct)item;
                product.printInvoice();
                //No shipping cost for digital product
            } else if (item instanceof GiftCardProduct){
                GiftCardProduct product = (GiftCardProduct)item;
                product.printInvoice();
                cost += product.calculateShippingCost();
            } else {
                throw new RuntimeException("No Such Item Found" + item);
            }
        }

        System.out.println("Total Shipping cost: " + cost);
    }
}
//Issues in the code
//Using Object in the production code is bad practice
//The classes (PhysicalProduct, GiftCardProduct) doesn't follow the SRP because the business logic
//and actions that should be separate in the different classes
//Client side is violation the Open Closed Principle
//Product Classes are tightly coupled to specific behavior, adding new functionalities require to modify the product code