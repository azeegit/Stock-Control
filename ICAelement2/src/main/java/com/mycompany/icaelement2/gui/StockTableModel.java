/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icaelement2.gui;


import com.mycompany.icaelement2.ASCStockItemInterface;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author zeesh
 */
public class StockTableModel extends AbstractTableModel {
    private static final String[] col_names={"Code","Title","Description","Unit Price(pounds)","Unit Price(pence)","Quantity"};
    private final List<ASCStockItemInterface> as;

    public StockTableModel(List<ASCStockItemInterface> stocks) {
        this.as = stocks;

    }

    
    

    @Override
    public int getRowCount() {
        return as.size();
                         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return col_names.length; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return col_names[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ASCStockItemInterface stock = as.get(rowIndex);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        switch(columnIndex){
            case 0:
                return stock.getProductCode();
            case 1:
                return stock.getProductTitle();
            case 2:
                return stock.getProductDesc();
            case 3:
                return stock.getUnitPriceInPounds();
            case 4:
                return stock.getUnitPriceInPence();
            case 5:
                return stock.getQtyInStock();
        } return null;
        }
    
}
