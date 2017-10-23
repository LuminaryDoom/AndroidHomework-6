package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1 = (TextView) findViewById(R.id.math_view);
        DoubleEvaluator eval = new DoubleEvaluator();
        String calculate = "(2^3-1)*sin(pi/4)/ln(pi^2)";
        Double result = eval.evaluate(calculate);
        txt1.setText(result.toString());
    }
}
