package Sport;

import java.util.Arrays;
import java.util.Random;

public class MainSport {
    public static void main(String[] args) {
        Random random = new Random();
        Sportsman[] sportsmen = new Sportsman[10];
        for (int i = 0; i < sportsmen.length; i++) {
            int choice = random.nextInt(3)+1;
            switch (choice){
                case 1:
                    sportsmen[i] = new Pilot();
                    break;
                case 2:
                    sportsmen[i] = new ChessPlayer();
                    break;
                case 3:
                    sportsmen[i] = new FootballPlayer();
                    break;
            }
        }

        System.out.println(Arrays.toString(sportsmen));
    }
}
