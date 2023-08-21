package edibe.yamac.project;

import java.util.Map;

public interface CoffeeData { // This class was created to provide the characteristics of coffee types.
    Map<Integer, Coffee> getCoffeeMenu();
    Coffee getCoffeeByNumber(int number);
}
