package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {

    String TAG = MainActivity.class.getSimpleName();
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button divisionbutton;
    Button multiplicationbutton;
    Button additionbutton;
    Button substractionbutton;
    Button equalButton;
    Button clearbutton;
    Button decimalbutton;
    Button cosbutton;
    Button sinbutton;
    Button tanbutt;
    Button openpar;
    Button closepar;
    Button powersign;
    Button asin;
    Button acos;
    Button atan;
    Button root;
    Button allClear;
    String calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt1 = (TextView) findViewById(R.id.math_view);
        txt1.setText(" ");
        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        divisionbutton = (Button) findViewById(R.id.button_division);
        multiplicationbutton = (Button) findViewById(R.id.button_multiplication);
        additionbutton = (Button) findViewById(R.id.button_addition);
        substractionbutton = (Button) findViewById(R.id.button_subtraction);
        equalButton = (Button) findViewById(R.id.button_equals);
        clearbutton = (Button) findViewById(R.id.button_clear);
        decimalbutton = (Button) findViewById(R.id.button_decimal_point);
        sinbutton = (Button) findViewById(R.id.sin_button);
        cosbutton = (Button) findViewById(R.id.cos_button);
        tanbutt = (Button) findViewById(R.id.tangent);
        openpar = (Button) findViewById(R.id.open_par);
        closepar = (Button) findViewById(R.id.close_par);
        powersign = (Button) findViewById(R.id.power);
        asin = (Button) findViewById(R.id.incos);
        acos = (Button) findViewById(R.id.insin);
        atan = (Button) findViewById(R.id.intan);
        root = (Button) findViewById(R.id.root);
        allClear=(Button) findViewById(R.id.allclear);

//        final DoubleEvaluator eval = new DoubleEvaluator();
//        calculate = "(2^3-1)*sin(pi/4)/ln(pi^2)";
//        Double result = eval.evaluate(calculate);
//        txt1.setText(result.toString());
//        LinearLayout myLayout = (LinearLayout) findViewById(R.id.mylayout);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button0.getText().toString());


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button1.getText().toString());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button2.getText().toString());


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button3.getText().toString());

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button4.getText().toString());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button5.getText().toString());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button6.getText().toString());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText((message + button7.getText().toString()));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button8.getText().toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + button9.getText().toString());
            }
        });
        decimalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + decimalbutton.getText().toString());
            }
        });
        divisionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + divisionbutton.getText().toString());


            }
        });
        multiplicationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + multiplicationbutton.getText().toString());
            }
        });
        substractionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + substractionbutton.getText().toString());
            }
        });
        additionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + additionbutton.getText().toString());
            }
        });
        cosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + cosbutton.getText().toString());
            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + cosbutton.getText().toString());
            }
        });
        tanbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + cosbutton.getText().toString());
            }
        });
        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(" ");
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = txt1.getText().toString();
                String answer = calculate(text).toString();
                txt1.setText(answer);

            }
        });
        openpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + openpar.getText().toString());
            }
        });
        powersign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + powersign.getText().toString());
            }
        });
        closepar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + closepar.getText().toString());
            }
        });
        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + asin.getText().toString());
            }
        });
        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + acos.getText().toString());
            }
        });
        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message + atan.getText().toString());
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                String newMessage = message.substring(0, message.length() - 1);
                Log.d(TAG, "onClick: newMessage " + newMessage);
                txt1.setText(newMessage);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = txt1.getText().toString();
                txt1.setText(message+root.getText().toString());
            }
        });

    }

    public String calculate(String expression) {
        DoubleEvaluator evaluator = new DoubleEvaluator();
        double result = evaluator.evaluate(expression);
        return String.valueOf(result);
    }
}
