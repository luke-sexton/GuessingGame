package au.edu.jcu.cp3406.guessinggame;
import java.util.Random;

class Game {
    private int randomNumber;

    Game() {

        Random random = new Random();
        int min = 1;
        int max = 10;
        this.randomNumber = min + random.nextInt(max - min); // secret is assigned a random value between 1 - 10
    }

    boolean check(int value) {
        return this.randomNumber == value;
    }
}
