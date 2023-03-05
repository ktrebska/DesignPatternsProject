import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        // create menu which is singleton
        Menu menu = Menu.getInstance();
        menu.addDish("Spaghetti Carbonara");
        menu.addDish("Pad Thai");
        menu.addDish("Haloumi Burger");
        menu.printMenu();
        menu.removeDish("Pad Thai");
        menu.printMenu();


        // factory design pattern
        DishFactory chineseDishFactory = new ChineseDishFactory();
        MainDish chineseMainDish = chineseDishFactory.createMainDish("pad thai");
        Soup chineseSoup = chineseDishFactory.createSoup("won ton");

        DishFactory italianDishFactory = new ItalianDishFactory();
        MainDish italianMainDish = chineseDishFactory.createMainDish("carbonara");
        Soup italianSoup = chineseDishFactory.createSoup("minestrone ");

        // observer desing pattern
        ObservableMenu observableMenu = new ObservableMenu();
        observableMenu.addDish("Spaghetti Carbonara");
        observableMenu.addDish("Pad Thai");
        observableMenu.addDish("Haloumi Burger");

        Observer observer = (o, arg) -> {
            System.out.println(arg);
        };

        // Register observer with the observable menu
        observableMenu.addObserver(observer);

        // Check if dishes are available in the menu
        observableMenu.checkDishAvailability("Pad Thai");
        observableMenu.checkDishAvailability("Mushroom Risotto");
        observableMenu.checkDishAvailability("Haloumi Burger");

        // Remove a dish from the menu
        observableMenu.removeDish("Pad Thai");

        // Check if the removed dish is still available in the menu
        observableMenu.checkDishAvailability("Pad Thai");



        // adapter pattern for payment systems
        RestaurantPaymentSystem system = new RestaurantPaymentSystem();

        PaymentService paymentService = new RestaurantPaymentService();

        PaymentServiceAdapter paymentServiceAdapter = new PaymentServiceAdapter(system);

        paymentService.processPayment(25.99);

        paymentServiceAdapter.processPayment(15.99);



        // command design pattern
        // Create an order
        Order order = new Order();

        // Create some commands
        Command orderCommand = new OrderCommand(order);
        Command cancelCommand = new CancelCommand(order);
        Command payCommand = new PayCommand(order);

        // Add the commands to a CommandInvoker
        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(orderCommand);
        invoker.addCommand(payCommand);

        // Execute the commands
        invoker.executeCommands();

        // Undo the last command
        invoker.undoCommands();

    }
}