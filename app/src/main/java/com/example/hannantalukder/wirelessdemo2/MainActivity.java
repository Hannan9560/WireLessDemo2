package com.example.hannantalukder.wirelessdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRestaurant(View view) {
        startActivity(new Intent(MainActivity.this, RestaurentActivity.class));

    }

    /*public void onMenu(View view) {
        startActivity(new Intent(MainActivity.this, MenuActivity.class));
    }*/
}
