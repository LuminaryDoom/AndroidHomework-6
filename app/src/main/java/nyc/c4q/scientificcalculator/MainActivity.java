package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import android.widget.*;
import android.content.*;

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
      //  TextView txt1 = (TextView) findViewById(R.id.math_view);
        DoubleEvaluator eval = new DoubleEvaluator();
        String calculate = "(2^3-1)*sin(pi/4)/ln(pi^2)";
        Double result = eval.evaluate(calculate);
      //  txt1.setText(result.toString());
    }
}
