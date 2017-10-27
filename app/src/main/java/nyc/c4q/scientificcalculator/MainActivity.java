package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView displayText;
    /**
     * Vertical Buttons
     */
    Button leftParentheses;
    Button rightParentheses;
    Button percent;
    Button decimalPoint;

    Button allClear;
    Button clearEntry;

    Button numberOne;
    Button numberTwo;
    Button numberThree;
    Button numberFour;
    Button numberFive;
    Button numberSix;
    Button numberSeven;
    Button numberEight;
    Button numberNine;
    Button numberZero;

    Button divide;
    Button multiply;
    Button subtract;
    Button plus;
    Button equals;

    /**
     * Horizontal Buttons
     */
    Button factorial;

    Button inverse;
    Button sine;
    Button inverseSine;
    Button cosine;
    Button inverseCosine;
    Button tan;
    Button inverseTan;

    Button naturalLog;
    Button logarithim;
    Button pi;
    Button eulersNumber;
    Button eulersNumberPowerX;
    Button squareRoot;
    Button exponential;
    Button power;
    Button rnd;
    Button tenPowerX;
    Button square;
    Button xRoot;


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


        Expression e1 =new Expression("5!");
        double answer = e1.calculate();
        displayText = (TextView) findViewById(R.id.math_view);
        displayText.setText(Double.toString(answer));


        divide = (Button) findViewById(R.id.button_division);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeString.mathText += "/";
                displayText.setText(storeString.mathText);
            }
        });

        inverse = (Button) findViewById(R.id.button_inverse);
        inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sine = (Button) findViewById(R.id.button_sin);
                sine.setText("asin");
            }
        });
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
