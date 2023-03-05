public class ItalianDishFactory implements DishFactory {

    @Override
    public MainDish createMainDish(String name) {
        System.out.println("Italian dish created: " + name);
        return new MainDish(name);
    }

    @Override
    public Soup createSoup(String name) {
        System.out.println("Italian soup created: " + name);
        return new Soup(name);
    }

}