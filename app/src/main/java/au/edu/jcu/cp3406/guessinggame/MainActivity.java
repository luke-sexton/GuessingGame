package au.edu.jcu.cp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void isCorrect(View view) {
        EditText enteredNumber = findViewById(R.id.enteredNumber);
        String userInput = enteredNumber.getText().toString();
        int value = Integer.parseInt(userInput);

        Context context = getApplicationContext();
        CharSequence correctText = "You are correct!";
        CharSequence wrongText = "You are Wrong";
        int duration = Toast.LENGTH_SHORT;

        boolean isCorrect = game.check(value);

        if (isCorrect) {
            Toast.makeText(context, correctText, duration).show();
        } else {
            Toast.makeText(context, wrongText, duration).show();
        }
    }
}
