public class OrderCommand implements Command {
    private Order order;

    public OrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.pay();
    }

    @Override
    public void undo() {
        order.undo();
    }
}