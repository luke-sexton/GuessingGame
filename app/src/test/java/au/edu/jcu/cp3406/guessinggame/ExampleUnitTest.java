package au.edu.jcu.cp3406.guessinggame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void run_game() {
        int minimum = 1;
        int maximum = 10;
        Game game = new Game();

        boolean isCorrect = false;
        for (int i = minimum; i < maximum + 1; ++i) {
            isCorrect = game.check(i);
            if (isCorrect) {
                break;
            }
        }
        assertTrue(isCorrect);

    }
}