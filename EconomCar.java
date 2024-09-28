import java.util.Random;

class EconomCar extends Car {

    private int min = 150;
    private int max = 300;
    private int min_hours = 1;
    private int max_hours = 8;
    Random rand = new Random();

    EconomCar() {
        generateCar();
    }

    private void generateCar() {
        Random rand = new Random();
        int randomInRange = rand.nextInt(max - min + 1) + min;
        setPrice(randomInRange);
        setName("EconomCar" + randomInRange);

    }

    @Override
    public int calculate() {
        int randomInRange = rand.nextInt(max_hours - min_hours + 1) + min_hours;
        return getPrice() * randomInRange;
    }

}
