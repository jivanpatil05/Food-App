package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name,rating,price,timing;


    HomeVerModel homeVerModel=null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);


        final Object obj=getIntent().getSerializableExtra("description");

        if (obj instanceof HomeVerModel){
            homeVerModel=(HomeVerModel) obj;
        }

        imageView= findViewById(R.id.bottom_img);
        name= findViewById(R.id.bottom_name);
        rating= findViewById(R.id.bottom_rating);
        price= findViewById(R.id.bottom_price);
        timing= findViewById(R.id.bottom_timing);

        if(homeVerModel!=null){
            imageView.setImageResource(homeVerModel.getImage());
            name.setText(homeVerModel.getName());
            rating.setText(homeVerModel.getRating());
            price.setText(homeVerModel.getPrice());
            timing.setText(homeVerModel.getTiming());
        }

    }

    public void home(View view) {
        startActivity(new Intent(DescriptionActivity.this,SettingFragment.class));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingFragment()).commit();
    }
}