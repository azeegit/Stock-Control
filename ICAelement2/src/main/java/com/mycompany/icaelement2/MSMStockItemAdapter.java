/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icaelement2;

import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author zeesh
 */
public class MSMStockItemAdapter implements ASCStockItemInterface {
    
    private final MSMStockItem msmStock;
    private List<String> departmentCode=Arrays.asList("RUN","SWM","CYC");

    public MSMStockItemAdapter(MSMStockItem msmStock) {
        this.msmStock = msmStock;
    }
    

    @Override
    public String getProductCode() {
        return departmentCode.get(msmStock.getDepartmentId()-1)+ "-" + msmStock.getCode()+ "-"+ "MSM"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getUnitPriceInPence() {
        return msmStock.getUnitPrice()%100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setUnitPriceInPence(int unitPriceInPence) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getUnitPriceInPounds() {
        return msmStock.getUnitPrice()/100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setUnitPriceInPounds(int unitPriceInPounds) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getQtyInStock() {
        return msmStock.getQuantityInStock(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setQtyInStock(int qtyInStock) {
        msmStock.setQuanity(qtyInStock); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getProductDesc() {
        return msmStock.getDescription(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setProductDesc(String productDesc) {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getProductTitle() {
        return msmStock.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setProductTitle(String productTitle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public  void updateCSV(String file, int replace, int row, int col) throws IOException {

     File inputFile = new File(file);
       File out = new File(file);

       List<String[]> csvBody;
       try (// Read existing file
               CSVReader reader = new CSVReader(new FileReader(inputFile), ',')) {
           csvBody = reader.readAll();
           // get CSV row column  and replace with by using row and column
           csvBody.get(row)[col] = Integer.toString(replace);
       }

// Write to CSV file which is open
        CSVWriter writer = new CSVWriter(new FileWriter(file),  ',',
                                             CSVWriter.NO_QUOTE_CHARACTER);
//                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
//                                             CSVWriter.DEFAULT_LINE_END);
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
   }

    @Override
    public void sellStock(int q) {
        this.setQtyInStock(this.getQtyInStock()-q); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void writeCSV(String file, LocalDateTime date, String code, int price, int q) throws IOException {
        PrintWriter output = null;

        File confidential = new File(file);
        try {
            // create new stream, link newly created stream to file
            //output = new PrintWriter(new BufferedWriter(new FileWriter(confidential, true)));	
            
            FileWriter fw = new FileWriter(confidential, true);
            output = new PrintWriter(fw);

        } catch (FileNotFoundException e) // problem with file !
        {
            System.out.println("Error - problem creating the file! Program closing");
            System.exit(0);  // this terminates the program - parameter 0 indicates normal termination
        } catch (IOException ex) {
            System.out.println("Error - problem creating the file! Program closing");
            System.exit(0);  // this terminates the program - parameter 0 indicates normal termination
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        if(br.readLine()==null){
          output.print("Date and Time"); 
          output.print(',');
          output.print("Product code"); 
          output.print(',');
          output.print("quantity sold");
          output.print('\n');
        }

        output.print(date.toString());   
        output.print(',');   
        output.print(code);
        output.print(',');
        output.print(q);
        output.print('\n');       

  

        output.close(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buyStock(int qtyToBuy) {
        this.setQtyInStock(this.getQtyInStock()+qtyToBuy); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString() {
        return String.format("%s-%s - %s - %s - UNIT PRICE: £%s - QTY: %d",
                departmentCode.get(msmStock.getDepartmentId()-1),
                msmStock.getCode(),
                msmStock.getName(),
                msmStock.getDescription(),
                msmStock.getHumanFriendlyUnitPrice(),
                msmStock.getQuantityInStock());
    }
   
    
    
    }
    
    
