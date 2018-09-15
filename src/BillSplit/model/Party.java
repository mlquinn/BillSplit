package BillSplit.model;

import java.util.ArrayList;

public class Party implements PartyInterface {
    String partyName;
    double totalCost;
    ArrayList<Item> itemList = new ArrayList();
    ArrayList<String> sideList = new ArrayList();

    public Party(){
        this.partyName = "New Party!";
        this.totalCost = 0;
    }

    public Party (String name, double cost, Item item){
        this.partyName = name;
        this.totalCost = cost;
        this.itemList.add(item);
    }

    /* Getters and Setters */
    public String getPartyName(){
        return this.partyName;
    }
    public void setPartyName(String name){
        this.partyName = name;
    }
    public double getTotalCost (){
        return this.totalCost;
    }
    public void setTotalCost(double cost){
        this.totalCost = cost;
    }
    public ArrayList getItemList(){
        return this.itemList;
    }
    public void setItemList (ArrayList list){
        this.itemList = list;
    }
    /* To String method*/
    @Override
    public String toString (){
        return "Party name is " + this.partyName + " total cost is " + this.totalCost;
    }
}
