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

    public void Inverse(View v)
    {
        Button sin = (Button) findViewById(R.id.button_sin);
        Button cos = (Button) findViewById(R.id.button_cos);
        Button tan = (Button) findViewById(R.id.button_tan);
        Button naturalLog = (Button) findViewById(R.id.button_natural_log);
        Button log = (Button) findViewById(R.id.button_log);
        Button sqrt = (Button) findViewById(R.id.button_sqrt_root);
        Button power = (Button) findViewById(R.id.button_power);
        Button decimal = (Button) findViewById(R.id.button_decimal_point);

        if( storeString.counter % 2 == 0) {
            sin.setText("asin");
            cos.setText("acos");
            tan.setText("atan");
            naturalLog.setText("e^");
            log.setText("10^");
            sqrt.setText("^2");
            power.setText("root");
            decimal.setText(",");
            storeString.counter++;
        }else{
            sin.setText("sin");
            cos.setText("cos");
            tan.setText("tan");
            naturalLog.setText("ln");
            log.setText("log");
            sqrt.setText("sqrt");
            power.setText("^");
            decimal.setText(".");
            storeString.counter++;
        }

    }

    public void Answer(View v){
        displayText = (TextView) findViewById(R.id.math_view);
        storeString.mathText += storeString.answerText;
        displayText.setText(storeString.mathText);
    }

    public void calculate(View v){
        displayText = (TextView) findViewById(R.id.math_view);
        Expression e1 =new Expression(storeString.mathText);
        double answer = e1.calculate();
        storeString.mathText = Double.toString(answer);
        storeString.answerText = Double.toString(answer);
        displayText.setText(storeString.mathText);
    }

}
