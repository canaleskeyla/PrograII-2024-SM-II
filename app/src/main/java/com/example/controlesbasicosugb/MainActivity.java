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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh * findViewById(R.id.tbhconversor);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec(tap"LON").setContent(R.id.tbhLongitud).setIndicator(label "LONGITUD", icon null));
        tbh.addTab(tbh.newTabSpec(tap"ALM").setContent(R.id.tbhAlmacenamiento).setIndicator(label "ALMACENAMIENTO", icon null));
        tbh.addTab(tbh.newTabSpec(tap"MON").setContent(R.id.tbhMonedas).setIndicator(label "MONEDAS", icon null));

    }
}