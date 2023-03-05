public class CancelCommand implements Command {
    private Order order;

    public CancelCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancel();
    }

    @Override
    public void undo() {
        order.order();
    }
}