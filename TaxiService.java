import java.util.Objects;
import java.util.Random;

public class TaxiService {
    public int total_worth = 0;
    private int min = 1;
    private int max = 8;
    Random rand = new Random();

    public int calculate_worth() {

        BusinessCar[] businessCars = new BusinessCar[8];
        EconomCar[] economCars = new EconomCar[8];
        String[] bannedCars = new String[5];

        for (int i = 0; i < 8; i++) {
            businessCars[i] = new BusinessCar();
            economCars[i] = new EconomCar();
        }
        for (int j = 0; j < 5; j++) {
            int minimal_worth = 1000;
            String minimal_worth_name = "";
            for (int i = 0; i < 8; i++) {
                boolean skip = false;
                for (int l = 0; l < 5; l++) if (businessCars[i].getName() == bannedCars[l]) skip = true;
                for (int l = 0; l < 5; l++) if (economCars[i].getName() == bannedCars[l]) skip = true;

                if (skip) continue;
                else {
                    int bc = businessCars[i].calculate();
                    int ec = economCars[i].calculate();
                    total_worth += bc;
                    total_worth += ec;
                    if (bc < minimal_worth) minimal_worth_name = businessCars[i].getName();
                    if (ec < minimal_worth) minimal_worth_name = economCars[i].getName();
                }


            }
            bannedCars[j] = minimal_worth_name;


        }


        return total_worth;
    }
}
