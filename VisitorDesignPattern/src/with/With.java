package with;

import java.util.ArrayList;
import java.util.List;

public class With {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new PhysicalProduct("iphone", 100000.00));
        cart.add(new DigitalProduct("Kaggle", 2000.00));
        cart.add(new GiftCardProduct("Infra-500", 200.023));

        InvoiceVisitor invoiceVisitor = new InvoiceVisitor();
        ShippingCostVisitor shippingCostVisitor = new ShippingCostVisitor();

        for(Item item : cart) {
            item.accept(invoiceVisitor);
            item.accept(shippingCostVisitor);
        }

    }
}
