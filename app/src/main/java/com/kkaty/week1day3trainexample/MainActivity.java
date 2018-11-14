package com.kkaty.week1day3trainexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.kkaty.week1day3trainexample.view.Animal;
import com.kkaty.week1day3trainexample.view.Eagle;

public class MainActivity extends AppCompatActivity {
    TextView tvHelloMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHelloMessage =findViewById(R.id.hello_message);
        Animal animal = new Animal();
        animal.getName();

       Eagle eagle = new Eagle( "Bob", 10000);
        eagle.flyup();

        tvHelloMessage.setText(eagle.getName());
    }
}

