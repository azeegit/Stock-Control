/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.icaelement2.gui;


/**
 *
 * @author zeesh
 */
 interface Subject {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
interface Observer{
    public void updateqty(int qty, String code);
}
interface DisplayElement {
    public void display(String code, int sold);
}

