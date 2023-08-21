 package edibe.yamac.project;

import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) throws InterruptedException { // created for interact with user 
        Scanner scanner = new Scanner(System.in);

        CoffeeData coffeeData = new DefaultCoffeeData();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeData);

        coffeeShop.displayMenu(); // for showing the coffee menu to user

        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        int selectedCoffeeNumber = scanner.nextInt();

        Coffee selectedCoffee = coffeeShop.getCoffeeByNumber(selectedCoffeeNumber); // get a number from user for understand which coffee they want

        if (selectedCoffee != null) {
            System.out.println("Teşekkürler, " + selectedCoffee.getName() + " hazırlanıyor.");
            Thread.sleep(2000); // for waiting for 2 seconds

            System.out.println(selectedCoffee.getRecipeDescription());

            System.out.println("Toplam ücret: " + selectedCoffee.getPrice() + " ₺");
        } else {
            System.out.println("Geçersiz kahve numarası.");
        }
    }
}
