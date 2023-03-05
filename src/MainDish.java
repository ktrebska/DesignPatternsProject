public class MainDish {
    private String name;
    private boolean available;

    public MainDish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void set_unavailable(){
        this.available = false;
    }

    public void set_available(){
        this.available = true;
    }
}
