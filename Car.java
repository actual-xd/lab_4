import java.util.Random;

public abstract class Car {
    private String name;
    private int price;

    public abstract int calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    void drive() {
        System.out.println("Машина едет");
    }

}


