package with;

public interface ItemVisitor {
    void visit(PhysicalProduct physicalProduct);
    void visit(DigitalProduct digitalProduct);
    void visit(GiftCardProduct giftCardProduct);
}
