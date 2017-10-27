package nyc.c4q.sciencecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import android.widget.*;
import android.content.*;

import nyc.c4q.scientificcalculator.R;

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
    protected void onCreate(Bundle savedInstanceState) {
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
