package edibe.yamac.project;

import java.util.HashMap;
import java.util.Map;

public class DefaultCoffeeData implements CoffeeData { // this class uses interface CoffeeData and was created to specify default coffee ingredients
    private Map<Integer, Coffee> coffeeMenu;

    public DefaultCoffeeData() { // here we keep the coffee data
        coffeeMenu = new HashMap<>();
        coffeeMenu.put(1, createEspresso());
        coffeeMenu.put(2, createDoubleEspresso());
        coffeeMenu.put(3, createCappuccino());
        coffeeMenu.put(4, createCaffeLatte());
        coffeeMenu.put(5, createMocha());
        coffeeMenu.put(6, createAmericano());
        coffeeMenu.put(7, createHotWater());
    }

    @Override
    public Map<Integer, Coffee> getCoffeeMenu() { // returns the coffee menu
        return coffeeMenu;
    }

    @Override
    public Coffee getCoffeeByNumber(int number) { // returns the coffee by number
        return coffeeMenu.get(number);
    }

    // we use here ingredient class and create the coffee
    private Coffee createEspresso() {
        Coffee espresso = new Coffee("Espresso", 20.0);
        espresso.addIngredient(new Ingredient("espresso", 1));
        return espresso;
    }

    private Coffee createDoubleEspresso() {
        Coffee doubleEspresso = new Coffee("Double Espresso", 29.0);
        doubleEspresso.addIngredient(new Ingredient("espresso", 2));
        return doubleEspresso;
    }

    private Coffee createCappuccino() {
        Coffee cappuccino = new Coffee("Cappuccino", 27.0);
        cappuccino.addIngredient(new Ingredient("espresso", 1));
        cappuccino.addIngredient(new Ingredient("buharda ısıtılmış süt", 2));
        cappuccino.addIngredient(new Ingredient("süt köpüğü", 2));
        return cappuccino;
    }

    private Coffee createCaffeLatte() {
        Coffee caffeLatte = new Coffee("Caffe Latte", 27.0);
        caffeLatte.addIngredient(new Ingredient("espresso", 1));
        caffeLatte.addIngredient(new Ingredient("buharda ısıtılmış süt", 3));
        caffeLatte.addIngredient(new Ingredient("süt köpüğü", 1));
        return caffeLatte;
    }

    private Coffee createMocha() {
        Coffee mocha = new Coffee("Mocha", 32.0);
        mocha.addIngredient(new Ingredient("espresso", 1));
        mocha.addIngredient(new Ingredient("buharda ısıtılmış süt", 1));
        mocha.addIngredient(new Ingredient("süt köpüğü", 1));
        mocha.addIngredient(new Ingredient("sıcak çikolata", 2));
        return mocha;
    }

    private Coffee createAmericano() {
        Coffee americano = new Coffee("Americano", 25.0);
        americano.addIngredient(new Ingredient("espresso", 1));
        americano.addIngredient(new Ingredient("sıcak su", 4));
        return americano;
    }

    private Coffee createHotWater() {
        Coffee hotWater = new Coffee("Sıcak Su", 5.0);
        hotWater.addIngredient(new Ingredient("sıcak su", 5));
        return hotWater;
    }
}
