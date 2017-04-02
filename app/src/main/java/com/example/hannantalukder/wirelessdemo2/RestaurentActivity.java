package com.example.hannantalukder.wirelessdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurentActivity extends AppCompatActivity {

    private ListView res_listView;
    private Restaurent restaurent;
    private ArrayList<Restaurent>restaurents;
    private RestaurentAdapter restaurentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent);

        res_listView = (ListView) findViewById(R.id.myList);
        restaurent = new Restaurent();
        restaurents = restaurent.getAllRestaurents();
        restaurentAdapter = new RestaurentAdapter(this, restaurents, 1);
        res_listView.setAdapter(restaurentAdapter);

    }
}
