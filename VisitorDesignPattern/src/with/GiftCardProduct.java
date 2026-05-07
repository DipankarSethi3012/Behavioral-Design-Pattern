package with;

public class GiftCardProduct implements Item{
    private String code;
    private double size;
    private double shippingCost;


    public GiftCardProduct(String code, double name) {
        this.code = code;
        this.size = name;
        shippingCost = 100.0;
    }


    @Override
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.visit(this);
    }

    public String getCode() {
        return code;
    }

    public double getSize() {
        return size;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
