import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ObservableMenu extends Observable {
    private List<String> dishes;

    public ObservableMenu() {
        dishes = new ArrayList<>();
    }

    public void addDish(String dish) {
        dishes.add(dish);
    }

    public void removeDish(String dish) {
        dishes.remove(dish);
    }

    public void checkDishAvailability(String dish) {
        boolean isAvailable = dishes.contains(dish);
        if (!isAvailable) {
            setChanged();
            notifyObservers(dish + " is not available in the menu.");
        }
    }
}
