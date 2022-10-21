/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icaelement2.gui;

import java.util.ArrayList;

/**
 *
 * @author zeesh
 */
public class StockData implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private int qty;
    private String code;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers) o.updateqty(qty,code); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void stockBelow(){
        notifyObservers();
    }
    
    public void checkStock(int qty, String code){
        if(qty<5) {
        this.code=code;
        this.qty=qty;
        stockBelow();}
        
    }
    
    
}
