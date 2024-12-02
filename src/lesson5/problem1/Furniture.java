package lesson5.problem1;

public class Furniture extends Product{
    private String material;
    private double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.shippingCost = shippingCost;
        this.material = material;
    }

    @Override
    public double getPrice(){
        double originalPrice = super.getPrice();
        return originalPrice + shippingCost;
    }

    @Override
    public String toString() {
        return "Product Name: "+super.productName+"\nPrice: "+getPrice()+"\nMaterial: "+material+"\nShipping: "+shippingCost;
    }
}
