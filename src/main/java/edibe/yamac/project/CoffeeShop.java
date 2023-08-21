package edibe.yamac.project;

import java.util.Map;

public class CoffeeShop {
    private CoffeeData coffeeData; // created instance of coffeedata

    public CoffeeShop(CoffeeData coffeeData) {
        this.coffeeData = coffeeData;
    }

    public void displayMenu() { // this method created for showing the coffee menu to user 
        System.out.println("Kahve Menüsü:");
        for (Map.Entry<Integer, Coffee> entry : coffeeData.getCoffeeMenu().entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getName() + " (" + entry.getValue().getPrice() + " ₺)");
        }
    }

    public Coffee getCoffeeByNumber(int number) {
        return coffeeData.getCoffeeByNumber(number);
    }
}
