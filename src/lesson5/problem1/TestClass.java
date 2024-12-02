package lesson5.problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        Furniture chair = new Furniture("Ergonomic office chair", 300, "Leather", 20);

        Electronics laptop = new Electronics("Lenovo ThinkPad", 1200, 24, 100);
        Electronics phone = new Electronics("Google Pixel", 800, 12, 50);

        Clothing jacket = new Clothing("Winter Jacket", 100, "Canada Goose", 15);
        Clothing boots = new Clothing("Snow Boots", 75, "Timberland", 10);

        products[0] = chair;
        products[1] = laptop;
        products[2] = phone;
        products[3] = jacket;
        products[4] = boots;

        for (Product item:products){
            System.out.println(item.toString());
            System.out.println();
        }

        System.out.println("The order total is "+sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        if(col.length == 0 || col == null) return 0;

        double total = 0.0;
        for (Product p:col){
            total+=p.getPrice();
        }

        return total;
    }
}
