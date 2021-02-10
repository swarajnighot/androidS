package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView email,phone,address,website;
    TextView label1, label2,label3,label4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email_image);
        phone = findViewById(R.id.phone_image);
        address = findViewById(R.id.address_image);
        website = findViewById(R.id.wesite_image);
        label1 = findViewById(R.id.label_option1);
        label2 = findViewById(R.id.label_option2);
        label3 = findViewById(R.id.label_option3);
        label4 = findViewById(R.id.label_option4);


        registerForContextMenu(email);
        registerForContextMenu(phone);
        registerForContextMenu(address);
        registerForContextMenu(website);
        registerForContextMenu(label1);
        registerForContextMenu(label2);
        registerForContextMenu(label3);
        registerForContextMenu(label4);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        int id = v.getId();
        menu.setHeaderTitle("Whats Next?");

        if(id == R.id.phone_image)
        {
            getMenuInflater().inflate(R.menu.phone,menu);
        }
        else if(id == R.id.label_option4)
        {
            getMenuInflater().inflate(R.menu.phone,menu);
        }
        else if (id == R.id.email_image)
        {
            getMenuInflater().inflate(R.menu.email,menu);
        }
        else if (id == R.id.label_option3)
        {
            getMenuInflater().inflate(R.menu.email,menu);
        }
        else if (id == R.id.address_image)
        {
            getMenuInflater().inflate(R.menu.address,menu);
        }
        else if (id == R.id.label_option2)
        {
            getMenuInflater().inflate(R.menu.address,menu);
        }
        else if (id == R.id.wesite_image)
        {
            getMenuInflater().inflate(R.menu.website,menu);
        }
        else if (id == R.id.label_option1)
        {
            getMenuInflater().inflate(R.menu.website,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.p1:

                Uri number = Uri.parse("tel:7600251167");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);

                return true;

            case R.id.p2:

                Uri number1 = Uri.parse("tel:5699875515");
                Intent cIntent = new Intent(Intent.ACTION_DIAL, number1);
                startActivity(cIntent);

                return true;


            case R.id.e1:

                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"swarajnighot@mca.christuniversity.in"});
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hello");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Enter Your Text Here");
                startActivity(emailIntent);

                return true;

            case R.id.e2:

                final Intent eIntent = new Intent(android.content.Intent.ACTION_SEND);
                eIntent.setType("plain/text");
                eIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"swarajnighot@gmail.com"});
                eIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hello!!");
                eIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Enter Your Text Here");
                startActivity(eIntent);

                return true;


            case R.id.a1:

                Uri location = Uri.parse("geo:12.934998,77.6028288?q=MCD");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);

                return true;

            case R.id.a2:

                Uri location1 = Uri.parse("geo:12.934998,77.6028288?q=Mcdonalds");
                Intent mIntent = new Intent(Intent.ACTION_VIEW, location1);
                startActivity(mIntent);

                return true;


            case R.id.w1 :

                Uri webpage = Uri.parse("https://mcdindia.com/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);

                return true;

            case R.id.w2 :

                Uri webpage1 = Uri.parse("https://en.wikipedia.org/wiki/McDonald%27s");
                Intent wIntent = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(wIntent);

                return true;


            default:
                return super.onContextItemSelected(item);

        }


    }
}