package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*
hint
logo for username - drawable - new - vector asset - logo selection
image on top center
custom input.xml - drawable new - resource file - action to be performed when focused and not focused
then linked to editText
checkboxes
radio buttons and radio groups


 */

public class MainActivity extends AppCompatActivity {

    EditText uname;
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox checkBox1,checkBox2, checkBox3, checkBox4 ;
    String checkText="";
    String radioText="";
    String unameText="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText)findViewById(R.id.uname);

        radioGroup = findViewById(R.id.radioGroup);
        Button sub = findViewById(R.id.submit);


        checkBox1 = (CheckBox)findViewById(R.id.cb1);
        checkBox2 = (CheckBox)findViewById(R.id.cb2);
        checkBox3 = (CheckBox)findViewById(R.id.cb3);
        checkBox4 = (CheckBox)findViewById(R.id.cb4);
        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()){

                    checkText = checkText+ checkBox1.getText() + ", ";
                }
                if(checkBox2.isChecked()){
                    checkText = checkText+ checkBox2.getText()+ ", ";
                }
                if(checkBox3.isChecked()){
                    checkText = checkText+ checkBox3.getText()+ ", ";
                }
                if(checkBox4.isChecked()){
                    checkText = checkText+ checkBox4.getText()+ ", ";
                }

                unameText=uname.getText().toString();

                System.out.println("Checkbox : "+ checkText);
                System.out.println("Username :"+ unameText);
                System.out.println("Radio Button : "+ radioText);

                Context context = getApplicationContext();
                CharSequence text = " Name : "+unameText +"\n Places : " +checkText+" "+" "+ "\n Age "+radioText;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                checkText="";
            }
        });


    }

    public void checkAge(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        radioText= (String) radioButton.getText();

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
