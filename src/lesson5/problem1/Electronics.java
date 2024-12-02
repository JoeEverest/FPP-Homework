package lesson5.problem1;

public class Electronics extends Product{
    private int warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice(){
        double originalPrice = super.getPrice();
        return originalPrice + warrantyCost;
    }

    @Override
    public String toString() {
        return "Product Name: "+super.productName+"\nPrice: "+getPrice()+"\nWarranty (months): "+warranty+"\nWarranty Cost: "+warrantyCost;
    }
}
