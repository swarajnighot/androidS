package com.example.lab6two;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText etname;
    ImageView iv;
    Button btn;
    RadioGroup rg;
    RadioButton rbtn;
    CheckBox c1,c2,c3,c4;
    Integer one,two,three,four;
    Integer Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.editTextTextPersonName2);
        iv = findViewById(R.id.imageView3);
        rg = (RadioGroup)findViewById(R.id.radioGroup);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        c3 = (CheckBox)findViewById(R.id.checkBox3);
        c4 = (CheckBox)findViewById(R.id.checkBox4);
    }
    public void start(View view) {
        String name = etname.getText().toString().trim();
        int selected_id = rg.getCheckedRadioButtonId();
        rbtn = (RadioButton)findViewById(selected_id);
        String rb_text = rbtn.getText().toString();
        String msg="";
        if(c1.isChecked())
            msg = msg + " MYSORE ";
        if(c2.isChecked())
            msg = msg + " BANGALORE ";
        if(c3.isChecked())
            msg = msg + " DELHI ";
        if(c4.isChecked())
            msg = msg + " CHENNAI ";
        Toast.makeText( this, " Name: "+ name + "\n Age Group: "+ rb_text +
                "\n Preffered City: "+ msg,Toast.LENGTH_LONG).show();
    }
}
