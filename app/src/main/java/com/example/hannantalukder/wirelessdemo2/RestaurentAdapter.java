package com.example.hannantalukder.wirelessdemo2;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Hannan Talukder on 4/2/2017.
 */

public class RestaurentAdapter extends ArrayAdapter<Restaurent> {
    private Context context;
    private ArrayList<Restaurent>restaurents;
    private int number;

    public RestaurentAdapter(@NonNull Context context, ArrayList<Restaurent> restaurents, int number) {
        super(context, R.layout.restaurant_layout, restaurents);
        this.context = context;
        this.restaurents = restaurents;
        this.number = number;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.restaurant_layout,parent, false);

        ImageView restaurantImage = (ImageView) convertView.findViewById(R.id.restaurantImage);
        TextView restaurentName = (TextView) convertView.findViewById(R.id.restaurentName);
        TextView restaurantLocaion = (TextView) convertView.findViewById(R.id.restaurantLocation);
        TextView restaurentPhone = (TextView) convertView.findViewById(R.id.restaurentPhone);

        restaurentName.setText(restaurents.get(position).getRestaurantName());
        restaurantLocaion.setText(restaurents.get(position).getRestaurentLocation());
        restaurentPhone.setText(restaurents.get(position).getRestaurentPhone());
        restaurantImage.setImageResource(restaurents.get(position).getRestaurentImageId());

        return convertView;
    }
}
