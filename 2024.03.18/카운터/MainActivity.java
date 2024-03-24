package com.example.widget2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView text1;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.count);
    }

    public void buttonP(View a) {

        count ++;
        text1.setText("카운터:" + count);
    }

    public void buttonM(View b) {

        count --;
        text1.setText("카운터:" + count);
    }

}


