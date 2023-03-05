public class ChineseDishFactory implements DishFactory {
    @Override
    public MainDish createMainDish(String name) {

        System.out.println("Chinese dish created: " + name);
        return new MainDish(name);
    }

    @Override
    public Soup createSoup(String name) {

        System.out.println("Chinese soup created: " + name);
        return new Soup(name);
    }
}
