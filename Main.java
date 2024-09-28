public class Main {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();

        System.out.println("Заработано за 5 дней: " + service.calculate_worth());


    }
}
