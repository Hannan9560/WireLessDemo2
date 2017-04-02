package com.example.hannantalukder.wirelessdemo2;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 4/2/2017.
 */

public class Restaurent {
    private String restaurantName;
    private String restaurentLocation;
    private String restaurentPhone;
    private int restaurentImageId;

    public Restaurent(String restaurantName, String restaurentLocation, String restaurentPhone) {
        this.restaurantName = restaurantName;
        this.restaurentLocation = restaurentLocation;
        this.restaurentPhone = restaurentPhone;
    }

    public Restaurent(String restaurantName, String restaurentLocation, String restaurentPhone, int restaurentImageId) {
        this.restaurantName = restaurantName;
        this.restaurentLocation = restaurentLocation;
        this.restaurentPhone = restaurentPhone;
        this.restaurentImageId = restaurentImageId;
    }

    public Restaurent() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurentLocation() {
        return restaurentLocation;
    }

    public void setRestaurentLocation(String restaurentLocation) {
        this.restaurentLocation = restaurentLocation;
    }

    public String getRestaurentPhone() {
        return restaurentPhone;
    }

    public void setRestaurentPhone(String restaurentPhone) {
        this.restaurentPhone = restaurentPhone;
    }

    public int getRestaurentImageId() {
        return restaurentImageId;
    }

    public void setRestaurentImageId(int restaurentImageId) {
        this.restaurentImageId = restaurentImageId;
    }
    public ArrayList<Restaurent> getAllRestaurents()
    {
        ArrayList<Restaurent> restaurents = new ArrayList<>();
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road#27 Dhanmondhi", "01234567", R.mipmap.ic_launcher));

        return restaurents;
    }
}
