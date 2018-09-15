package BillSplit.model;

import java.util.ArrayList;

public class Item implements ItemInterface{
    String itemName;
    ArrayList<String> sideList = new ArrayList();

    public Item (){
        this.itemName = "New Item!";
        this.sideList.add("Side");
    }
    public Item (String name, String side){
        this.itemName = name;
        this.sideList.add(side);
    }
    /*Getters and Setters*/
    public String getItemName(){
        return this.itemName;
    }
    public void setItemName(String name){
        this.itemName = name;
    }
    /*To string method*/
    @Override
    public String toString(){
        return "ITEM TOSTRING: " + this.itemName + " " + this.sideList;
    }
}
