import java.util.Random;

class BusinessCar extends Car {
    private int min = 450;
    private int max = 600;

    private int min_hours = 1;
    private int max_hours = 8;
    Random rand = new Random();
    BusinessCar() {
        generateCar();
    }

    private void generateCar() {
        Random rand = new Random();
        int randomInRange = rand.nextInt(max - min + 1) + min;
        setPrice(randomInRange);
        setName("BusinessCar" + randomInRange);
    }

    @Override
    public int calculate() {
        int randomInRange = rand.nextInt(max_hours - min_hours + 1) + min_hours;
        return getPrice() * randomInRange;
    }


}