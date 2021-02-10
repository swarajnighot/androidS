package com.example.exam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0 , cCounter = 0;
    Button btn,btn2,btn3,btn4,btn5,ttn;
    Button bta;
    TextView txv;
    TextView txv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById (R.id.button);
        ttn = (Button) findViewById (R.id.button);
        btn2 = (Button) findViewById (R.id.button2);
        btn3 = (Button) findViewById (R.id.button3);
        btn4 = (Button) findViewById (R.id.button4);
        btn5 = (Button) findViewById (R.id.button5);
        txv = (TextView) findViewById (R.id.textView4);
        txv2 = (TextView) findViewById (R.id.textView5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                cCounter = cCounter +100;
                txv.setText(Integer.toString(mCounter));
                txv2.setText(Integer.toString(cCounter));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                cCounter = cCounter +200;
                txv.setText(Integer.toString(mCounter));
                txv2.setText(Integer.toString(cCounter));

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                cCounter = cCounter +400;
                txv.setText(Integer.toString(mCounter));
                txv2.setText(Integer.toString(cCounter));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                cCounter = cCounter +50;
                txv.setText(Integer.toString(mCounter));
                txv2.setText(Integer.toString(cCounter));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                cCounter = cCounter + 0;
                txv.setText(Integer.toString(mCounter));
                txv2.setText(Integer.toString(cCounter));
            }
        });
    }
}