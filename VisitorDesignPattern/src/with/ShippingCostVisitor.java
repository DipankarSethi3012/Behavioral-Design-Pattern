package with;

public class ShippingCostVisitor implements ItemVisitor{

    @Override
    public void visit(PhysicalProduct physicalProduct) {
        System.out.println("shipping cost for Physical Product");
        System.out.println(physicalProduct.getName() + " " + physicalProduct.getPrice() + " " + physicalProduct.getShippingCost());
    }

    @Override
    public void visit(DigitalProduct digitalProduct) {
        System.out.println("Shipping cost for digital Product");
        System.out.println(digitalProduct.getName() + " " + digitalProduct.getPrice());
    }

    @Override
    public void visit(GiftCardProduct giftCardProduct) {
        System.out.println("Shipping cost for GiftCardProduct");
        System.out.println(giftCardProduct.getCode() + " " + giftCardProduct.getShippingCost() + " " + giftCardProduct.getSize());
    }
}
