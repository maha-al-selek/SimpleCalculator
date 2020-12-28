package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView equation,result;
    String total;
    int lastResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equation = (TextView) findViewById(R.id.equation);
        result = (TextView) findViewById(R.id.result);
        total="";
        lastResult=0;
    }

    public void ClearEquation(View view) {
        total="";
        equation.setText("");
        result.setText("result");
    }

    public void seven(View view) {
        total=total+"7";
        equation.setText(total);
    }

    public void eight(View view) {
        total=total+"8";
        equation.setText(total);
    }

    public void nine(View view) {
        total=total+"9";
        equation.setText(total);
    }

    public void four(View view) {
        total=total+"4";
        equation.setText(total);
    }

    public void five(View view) {
        total=total+"5";
        equation.setText(total);
    }

    public void six(View view) {
        total=total+"6";
        equation.setText(total);
    }

    public void one(View view) {
        total=total+"1";
        equation.setText(total);
    }

    public void two(View view) {
        total=total+"2";
        equation.setText(total);
    }

    public void three(View view) {
        total=total+"3";
        equation.setText(total);
    }

    public void multiplication(View view) {
        total=total+"*";
        equation.setText(total);
    }

    public void division(View view) {
        total=total+"/";
        equation.setText(total);
    }

    public void pointfordecimal(View view) {
        total=total+".";
        equation.setText(total);
    }

    public void addition(View view) {
        total=total+"+";
        equation.setText(total);
    }

    public void subtraction(View view) {
        total=total+"-";
        equation.setText(total);
    }

    public void calculateresult(View view) {
        double another = computeAnother(total);
        result.setText(Double.toString(another));
        equation.setText("");
    }



    static double computeAnother(String equation) {
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }

}
