/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.icaelement2;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zeesh
 */
public interface ASCStockItemInterface  {
   public String getProductCode();
   
   public int getUnitPriceInPence();
   public void setUnitPriceInPence(int unitPriceInPence);
   
   public int getUnitPriceInPounds();
   public void setUnitPriceInPounds(int unitPriceInPounds);
   public int getQtyInStock();
   public void setQtyInStock(int qtyInStock);
   public String getProductDesc();
   public void setProductDesc(String productDesc);
   public String getProductTitle();
   public void setProductTitle(String productTitle);
   public void sellStock(int q);
   public  void updateCSV(String file, int replace, int row, int col) throws IOException;
   public  void writeCSV(String file, LocalDateTime date, String code, int price, int q) throws IOException;    
   public void buyStock(int qtyToBuy);
}
