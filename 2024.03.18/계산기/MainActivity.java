package com.example.widgetexample1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    EditText edit1;
    EditText edit2;
    EditText edit3;






   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       edit1 = (EditText) findViewById(R.id.edit1);
       edit2 = (EditText) findViewById(R.id.edit2);
       edit3 = (EditText) findViewById(R.id.edit3);





        //자바 코드에서 id불러와서 저 이름으로 쓴다.
    }

    //public void genratRandomNumber(View View) {
        //Random random = new Random();
        //int randomNumber = random.nextInt(100);

      //  textViewRandomNumber.setText("난수:" + randomNumber);
    //}
    public void ButtonNb1(View View) {
       String nb1 = edit1.getText().toString();
       String nb2 = edit2.getText().toString();
       int result = Integer.parseInt(nb1) + Integer.parseInt(nb2);
       edit3.setText(""+result);
    }
    public void ButtonNb2(View View) {
        String nb1 = edit1.getText().toString();
        String nb2 = edit2.getText().toString();
        int result = Integer.parseInt(nb1) - Integer.parseInt(nb2);
        edit3.setText(""+result);
    }
    public void ButtonNb3(View View) {
        String nb1 = edit1.getText().toString();
        String nb2 = edit2.getText().toString();
        int result = Integer.parseInt(nb1) * Integer.parseInt(nb2);
        edit3.setText(""+result);
    }
    public void ButtonNb4(View View) {
        String nb1 = edit1.getText().toString();
        String nb2 = edit2.getText().toString();
        int result = Integer.parseInt(nb1) / Integer.parseInt(nb2);
        edit3.setText(""+result);
    }
}