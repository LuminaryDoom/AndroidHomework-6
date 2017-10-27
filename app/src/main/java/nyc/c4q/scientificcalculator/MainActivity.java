package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView displayText;

    Button allClear; //delete
    Button equals;
    Button inverse;
    Button Ans; //stored last answers
    Button Rnd; //Random number
    Button Rad; //parse to radian
    Button Deg; //set to degree




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allClear = (Button) findViewById(R.id.button_allclear);
        allClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                displayText = (TextView) findViewById(R.id.math_view);
                storeString.mathText = "";
                displayText.setText(storeString.mathText);
                return true;
            }
        });


        Expression e1 =new Expression("deg(5.31)");
        double answer = e1.calculate();
        displayText = (TextView) findViewById(R.id.math_view);
        displayText.setText(Double.toString(answer));


    }

    public void getText(View v)
    {
        displayText = (TextView) findViewById(R.id.math_view);
        Button b = (Button) v;
        storeString.mathText += b.getText().toString();
        displayText.setText(storeString.mathText);
    }

    public void delete(View v)
    {
        displayText = (TextView) findViewById(R.id.math_view);
        try {

            try {
                storeString.mathText = storeString.mathText.substring(0, storeString.mathText.length() - 1);
            }catch (NullPointerException e){}

        } catch (StringIndexOutOfBoundsException e) {
            storeString.mathText ="";
            displayText.setText(storeString.mathText);
        }

        displayText.setText(storeString.mathText);
    }



}
