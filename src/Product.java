public abstract class Product {
    protected String name;
    protected double price;
    protected String id;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getInfo();
}
