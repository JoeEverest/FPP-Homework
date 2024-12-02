package lesson5.problem1;

public class Clothing extends Product{
    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand =  brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice(){
        double originalPrice = super.getPrice();
        return originalPrice - (originalPrice*discountPercentage/100);
    }

    @Override
    public String toString() {
        return "Product Name: "+super.productName+"\nPrice: "+getPrice()+"\nBrand: "+brand+"\nDiscount: "+discountPercentage+"%";
    }
}
