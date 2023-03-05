import java.util.ArrayList;
import java.util.List;

// This is the singleton class
public class Menu {
    private static Menu instance = new Menu();
    private List<String> dishes;

    private Menu() {
        dishes = new ArrayList<>();
    }

    public static Menu getInstance() {
        return instance;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (String dish : dishes) {
            System.out.println("- " + dish);
        }
    }

    public void addDish(String dish) {
        dishes.add(dish);
        System.out.println(dish + " added to the menu");
    }

    public void removeDish(String dish) {
        if (dishes.remove(dish)) {
            System.out.println(dish + " removed from the menu");
        } else {
            System.out.println(dish + " not found in the menu");
        }
    }
}

