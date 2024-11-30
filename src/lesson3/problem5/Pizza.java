package lesson3.problem5;

import static lesson3.problem5.PizzaSize.*;
import static lesson3.problem5.PizzaType.*;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice(){
        double sizePrice = switch (pizzaSize) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typePrice = switch (pizzaType) {
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2;
            case CHEEZE -> 1.5;
            case BBQCHICKEN -> 2;
        };

        price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double tax = price * 0.03;
        double totalPrice = price + tax;
        return String.format(
                "Pizza Order:\nSize: %s\nType: %s\nQty: %d\nPrice: $%.2f\nTax: $%.2f\nTotal Price: $%.2f",
                pizzaSize, pizzaType, quantity, price, tax, totalPrice
        );
    }
}
