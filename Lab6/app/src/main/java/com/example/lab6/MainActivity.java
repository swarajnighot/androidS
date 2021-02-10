package com.example.lab6;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String toast_message="";
    RadioButton rbutton;
    RadioGroup radioGroup;
    CheckBox cbox1,cbox2,cbox3,cbox4;
    TextView uname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.age);
        Button buttonApply = findViewById(R.id.but_bot);
        Button buttontop = findViewById(R.id.but_top);
        uname = findViewById(R.id.name);
        cbox1 = findViewById(R.id.c1);
        cbox2 = findViewById(R.id.c2);
        cbox3 = findViewById(R.id.c3);
        cbox4 = findViewById(R.id.c4);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                 rbutton = findViewById(radioId);
                toast_message = (String) rbutton.getText();
                toast_message = toast_message + "\n" + uname.getText().toString();
                if(cbox1.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox1.getText().toString();
                }
                if(cbox2.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox2.getText().toString();
                }
                if(cbox3.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox3.getText().toString();
                }
                if(cbox4.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox4.getText().toString();
                }

                Toast.makeText(getBaseContext(), toast_message, Toast.LENGTH_SHORT ).show();
            }

        });

        buttontop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                rbutton = findViewById(radioId);
                toast_message = (String) rbutton.getText();
                toast_message = toast_message + "\n" + uname.getText().toString();
                if(cbox1.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox1.getText().toString();
                }
                if(cbox2.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox2.getText().toString();
                }
                if(cbox3.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox3.getText().toString();
                }
                if(cbox4.isChecked())
                {
                    toast_message = toast_message + "\n" + cbox4.getText().toString();
                }
                Toast toast= Toast.makeText(getApplicationContext(),
                        toast_message, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }

        });
    }

}