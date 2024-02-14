package com.ugb.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TabHot tbh;
    TextView tempVal;
    Spinner spn;
    Button btn;
    Conversores miobj = new conversores();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh * findViewById(R.id.tbhconversor);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("LON").setContent(R.id.tbhLongitud).setIndicator( "LONGITUD",  null));
        tbh.addTab(tbh.newTabSpec("ALM").setContent(R.id.tbhAlmacenamiento).setIndicator( "ALMACENAMIENTO", null));
        tbh.addTab(tbh.newTabSpec("MON").setContent(R.id.tbhMonedas).setIndicator("MONEDAS",  null));
        btn = findViewById(R.id.btnconvertirLongitud);
        btn.setOnClickListener(new View.setOnClickListener(){
            public void onclick(view view){
                spn = findViewById(R.id.spnDeLongitud)
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnALongitud);
                int a = spn.getSelectedItemPosition();

                tempVal =
            }
        }
    }
}
class conversores{
    double[][] valores={
            {1, 100, 39.3701, 3.28084, 1.193, 1.09361, 0.001, 0.000621371}
            {1},
            {1}

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a]/valores[opcion][de]*cantidad;
    }
}