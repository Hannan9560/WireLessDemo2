package com.example.hannantalukder.wirelessdemo2;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 4/2/2017.
 */

public class Menu {
    private String menuName;
    private String menuquantity;
    private String price;
    private int menuImageId;

    public Menu(String menuName, String menuquantity, String price) {
        this.menuName = menuName;
        this.menuquantity = menuquantity;
        this.price = price;
    }

    public Menu(String menuName, String menuquantity, String price, int menuImageId) {
        this.menuName = menuName;
        this.menuquantity = menuquantity;
        this.price = price;
        this.menuImageId = menuImageId;
    }

    public Menu() {
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuquantity() {
        return menuquantity;
    }

    public void setMenuquantity(String menuquantity) {
        this.menuquantity = menuquantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMenuImageId() {
        return menuImageId;
    }

    public void setMenuImageId(int menuImageId) {
        this.menuImageId = menuImageId;
    }

    public ArrayList<Menu> getAllmenu()
    {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));
        menus.add(new Menu("Fried Rice","Chicken + Rice", "Tk.255/=",R.mipmap.ic_launcher));

        return  menus;
    }
}
