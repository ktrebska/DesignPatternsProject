public class PayCommand implements Command {
    private Order order;

    public PayCommand(Order order) {
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