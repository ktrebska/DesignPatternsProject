public class Order {
    private boolean isOrdered;
    private boolean isCancelled;
    private boolean isPaid;

    public void order() {
        System.out.println("Order placed");
        this.isOrdered = true;
    }

    public void cancel() {
        if (this.isOrdered && !this.isCancelled && !this.isPaid) {
            System.out.println("Order cancelled");
            this.isCancelled = true;
        } else {
            System.out.println("Cannot cancel order");
        }
    }

    public void pay() {
        if (this.isOrdered && !this.isCancelled && !this.isPaid) {
            System.out.println("Order paid");
            this.isPaid = true;
        } else {
            System.out.println("Cannot pay for order");
        }
    }

    public void undo() {
        if (this.isPaid) {
            System.out.println("Cannot undo pay");
        } else if (this.isCancelled) {
            System.out.println("Undo cancel");
            this.isCancelled = false;
        } else if (this.isOrdered) {
            System.out.println("Undo order");
            this.isOrdered = false;
        }
    }
}