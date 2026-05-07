package with;

public class PhysicalProduct implements Item{
    private String name;
    private double price;
    private double shippingCost;

    public PhysicalProduct(String name, double price) {
        this.name = name;
        this.price = price;
        shippingCost = 100.0;
    }

    @Override
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
