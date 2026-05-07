package with;

public class DigitalProduct implements Item {
    private String name;
    private double price;

    public DigitalProduct(String name, double price) {
        this.name = name;
        this.price = price;

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
}
