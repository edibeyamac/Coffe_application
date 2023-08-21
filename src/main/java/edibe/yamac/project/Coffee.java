package edibe.yamac.project;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String name;
    private List<Ingredient> ingredients; // instance of ingredient class
    private double price;

    public Coffee(String name, double price) { // constructor of coffee class
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.price = price;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() { 
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public String getRecipeDescription() { // that function created for showing ingredient of the coffee to user
        StringBuilder description = new StringBuilder("Kahveniz ");

        for (Ingredient ingredient : ingredients) {
            description.append(ingredient.getNumDoses()).append(" doz ").append(ingredient.getName()).append(", ");
        }

        description.delete(description.length() - 2, description.length()); 
        description.append("'dan oluşmaktadır.");

        return description.toString();
    }
}
