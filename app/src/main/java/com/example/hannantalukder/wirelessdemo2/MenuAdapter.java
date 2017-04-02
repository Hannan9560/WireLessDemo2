package com.example.hannantalukder.wirelessdemo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 3/31/2017.
 */

public class MenuAdapter extends ArrayAdapter<Menu> {
    private Context context;
    private ArrayList<Menu>menus;

    public MenuAdapter(@NonNull Context context, ArrayList<Menu> menus) {
        super(context, R.layout.menu_layout, menus);
        this.context = context;
        this.menus = menus;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.menu_layout,parent,false);
        ImageView menuImageView = (ImageView) convertView.findViewById(R.id.menuImage);
        TextView menuName = (TextView) convertView.findViewById(R.id.menuName);
        TextView menuQuanty = (TextView) convertView.findViewById(R.id.menuQuantity);
        TextView menuPrice = (TextView) convertView.findViewById(R.id.menuPrice);

        menuName.setText(menus.get(position).getMenuName());
        menuQuanty.setText(menus.get(position).getMenuquantity());
        menuPrice.setText(menus.get(position).getPrice());
        menuImageView.setImageResource(menus.get(position).getMenuImageId());
        return convertView;
    }
}
