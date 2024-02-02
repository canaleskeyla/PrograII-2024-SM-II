package com.ugb.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tempVal;
    Button btn;
    RadioGroup opt;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempVal = findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 0;
                opt = findViewById(R.id.optOpciones);
                switch (opt.getCheckedRadioButtonId()){
                    case R.id.optSuma:
                        respuesta = num1+num2;
                        break;
                    case R.id.optResta:
                        respuesta=num1-num2;
                        break;
                    case R.id.optMultiplicacion:
                        respuesta=num1*num2;
                        break;
                    case R.id.optDivision:
                        respuesta=num1/num2;
                        break;
                    case R.id.optPorcentaje:
                        respuesta = (num1 / 100) * num2;
                        break;
                    case R.id.optExponenciacion:
                        respuesta = Math.pow(num1, num2);
                        break;
                    case R.id.optFactorial:
                        respuesta = factorial((int) num1);
                        break;
                    case R.id.optRaiz:
                        respuesta = Math.sqrt(num1);
                        break;
                }

                spn = findViewById(R.id.spnOpciones);
                int selectedSpinnerItemPosition = spn.getSelectedItemPosition();

                switch (selectedSpinnerItemPosition) {
                    case 0:
                        respuesta = num1 + num2;
                        break;
                    case 1:
                        respuesta = num1 - num2;
                        break;
                    case 2:
                        respuesta = num1 * num2;
                        break;
                    case 3:
                        respuesta = num1 / num2;
                        break;
                    // Nuevos casos del Spinner
                }

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);
            }
        });
    }

    private double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}