package com.example.big.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.big.factorypattern.factory.AbstractFactory;
import com.example.big.factorypattern.interfaces.Bread;
import com.example.big.factorypattern.factory.FactoryGenerator;
import com.example.big.factorypattern.interfaces.Filling;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFactory.getFilling("CHE");
        Log.d(DEBUG_TAG, filling.name() + " : " + filling.calories());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BRI");
        textView.setText(bread.name());
        Log.d(DEBUG_TAG, bread.name() + " : " + bread.calories());
    }
}
