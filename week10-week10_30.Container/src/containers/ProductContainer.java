package containers;

public class ProductContainer extends Container {
    private String name;
    public ProductContainer(String name,double tilavuus) {
        super(tilavuus);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName()+": "+super.toString();
    }
}
