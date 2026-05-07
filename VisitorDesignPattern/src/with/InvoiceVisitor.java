package with;

public class InvoiceVisitor implements ItemVisitor{
    @Override
    public void visit(PhysicalProduct physicalProduct) {
        System.out.println("Building the invoice for the physical product");
        System.out.println(physicalProduct.getName());
    }

    @Override
    public void visit(DigitalProduct digitalProduct) {
        System.out.println("Printing the invoice for the digital Product");
        System.out.println(digitalProduct.getName());
    }

    @Override
    public void visit(GiftCardProduct giftCardProduct) {
        System.out.println("Printing the invoice for the GiftCardProduct");
        System.out.println(giftCardProduct.getCode());
    }
}
