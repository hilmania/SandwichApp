package com.comodostudio.sandwichapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);

//        BreadFactory breadFactory = new BreadFactory();
//        Bread bread = breadFactory.getBread("BAG");
//
//        textView.setText(new StringBuilder()
//        .append(bread.name())
//        .toString());

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFactory.getFilling("CHE");
        Log.d(DEBUG_TAG, filling.name() + " : " + filling.calories());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BRI");
        Log.d(DEBUG_TAG, bread.name() + " : " + bread.calories());
    }
}
