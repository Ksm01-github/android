package com.example.widget3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.dice);

    }

    public void roll(View View) {
        int randomN = new Random().nextInt(6) + 1;

        if (randomN == 1) {
            imageView.setImageResource(R.drawable.dice1);
        }

        if (randomN == 2) {
            imageView.setImageResource(R.drawable.dice2);
        }

        if (randomN == 3) {
            imageView.setImageResource(R.drawable.dice3);
        }

        if (randomN == 4) {
        imageView.setImageResource(R.drawable.dice4);
        }

        if (randomN == 5) {
            imageView.setImageResource(R.drawable.dice5);
        }
        if (randomN == 6) {
            imageView.setImageResource(R.drawable.dice6);
        }
    }



}

