package kseniya.valadzko.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
    }


    public  void sum(View v) {
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        if (!firstNumber.getText().toString().equals("") && !secondNumber.getText().toString().equals("")) {
            result.setText("Result: " + (Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString())));

        }else{
            result.setText("Something is wrong!");
        }
    }
    public void difference(View v){
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        if (!firstNumber.getText().toString().equals("") && !secondNumber.getText().toString().equals("")) {
            result.setText("Result: " + (Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString())));

        }else{
            result.setText("Something is wrong!");
        }
    }
    public void multip(View v){
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        if (!firstNumber.getText().toString().equals("") && !secondNumber.getText().toString().equals("")) {
            result.setText("Result: " + (Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString())));

        }else{
            result.setText("Something is wrong!");
        }
    }
    public void divide(View v){
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        if (!firstNumber.getText().toString().equals("") && !secondNumber.getText().toString().equals("")) {
            result.setText("Result: " + (Integer.parseInt(firstNumber.getText().toString()) / Integer.parseInt(secondNumber.getText().toString())));

        }else{
            result.setText("Something is wrong!");
        }
    }
}
