package edibe.yamac.project;

public class Ingredient {
    private String name; // ingredient name such as espresso
    private int numDoses;

    public Ingredient(String name, int numDoses) {
        this.name = name;
        this.numDoses = numDoses;
    }

    public String getName() { // here is the getter for name 
        return name;
    }

    public int getNumDoses() { // here is the getter for number of doses
        return numDoses;
    }
}
