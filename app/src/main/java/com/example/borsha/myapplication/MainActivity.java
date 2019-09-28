package com.example.borsha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView2);
        tv.setText("");
        s = "";
    }

    public void onClick(View V)
    {
        Button b = (Button)V;
        s += b.getText().toString();
        tv.setText(s);
    }

    public void result(View V){
        String s1 = "";
        String s2 = "";
        boolean b = false;
        int index = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                b = true;
                index = i;
                continue;
            }
            if(b)
                s2 += s.charAt(i);
            else
                s1 += s.charAt(i);

        }
        double first = Double.parseDouble(s1);
        double second = Double.parseDouble(s2);
        if(s.charAt(index) == '+')
            tv.setText(String.valueOf(first + second));
        else if(s.charAt(index) == '-')
        tv.setText(String.valueOf(first - second));
        else if(s.charAt(index) == '*')
            tv.setText(String.valueOf(first * second));
        else
            tv.setText(String.valueOf(first / second));
    }
    public void clear(View V){
        tv.setText("");
        s = "";
    }
}
