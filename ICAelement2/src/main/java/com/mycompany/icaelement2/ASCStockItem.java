/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icaelement2;



import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ASCStockItem implements ASCStockItemInterface{
    private String productCode;
    private String productTitle;
    private String productDesc;
    private int unitPriceInPounds;
    private int unitPriceInPence;
    private  int qtyInStock;
    

    public ASCStockItem(String productCode, String productTitle, String productDesc, int unitPriceInPounds, int unitPriceInPence, int qtyInStock) {
        this.productCode = productCode;
        this.productTitle = productTitle;
        this.productDesc = productDesc;
        this.unitPriceInPounds = unitPriceInPounds;
        this.unitPriceInPence = unitPriceInPence;
        this.qtyInStock = qtyInStock;
    }

    /**
     *
     * @return
     */
    @Override
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String getProductTitle() {
        return productTitle;
    }

    @Override
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @Override
    public String getProductDesc() {
        return productDesc;
    }

    @Override
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public int getUnitPriceInPounds() {
        return unitPriceInPounds;
    }

    @Override
    public void setUnitPriceInPounds(int unitPriceInPounds) {
        this.unitPriceInPounds = unitPriceInPounds;
    }

    @Override
    public int getUnitPriceInPence() {
        return unitPriceInPence;
    }

    @Override
    public void setUnitPriceInPence(int unitPriceInPence) {
        this.unitPriceInPence = unitPriceInPence;
    }

    @Override
    public int getQtyInStock() {
        return qtyInStock;
    }

    @Override
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    
    @Override
    public String toString() {
        return String.format("%s-%s - %s - UNIT PRICE: £%s-£%d - QTY: %d",
                getProductCode(),
                getProductTitle(),
                getProductDesc(),
                getUnitPriceInPounds(),
                getUnitPriceInPence(),
                getQtyInStock());
        
    }
    
    /**
     * Load a collection of ASCStockItems into a list
     * @return a list of the Asher's Sportymart stock items.
     */
    public static List<ASCStockItem> loadStockCSV()  {
        
        List<ASCStockItem> stock = null;
        
        try(final Scanner fileScanner = new Scanner(new FileReader("ICAelement2/src/data/AshersSportsCollective.csv",Charset.forName("UTF-8")))) {
            stock = new ArrayList<>();            
            while(fileScanner.hasNextLine()) {
                final String[] columns = fileScanner.nextLine().split(",");
                if(columns.length < 6) {
                    System.err.println("Insufficient data");
                    continue; // next iteration
                }
                ASCStockItem readStock = new ASCStockItem(columns[0],
                        columns[1],columns[2],Integer.parseInt(columns[3]),
                        Integer.parseInt(columns[4]),Integer.parseInt(columns[5]));
                stock.add(readStock);
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ASCStockItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stock;
    }
    @Override
    public void updateCSV(String file, int replace, int row, int col) throws IOException {
       File inputFile = new File(file);
       List<String[]> csvBody;
       try (
           CSVReader reader = new CSVReader(new FileReader(inputFile), ',')) {
           csvBody = reader.readAll();
           csvBody.get(row)[col] = Integer.toString(replace);
       }

        CSVWriter writer = new CSVWriter(new FileWriter(file),  ',',
                                             CSVWriter.NO_QUOTE_CHARACTER);
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
   
        
    }
    //writing sales data to csv
    @Override
    public  void writeCSV(String file, LocalDateTime date, String code, int price, int q) throws IOException {
        PrintWriter output = null;

        File confidential = new File(file);
        try {
            
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
        BufferedReader brd = new BufferedReader(new FileReader(file));
        if(brd.readLine()==null){
          output.print("Date and Time"+','+"Product code"+','+"quantity sold"+'\n');
        }

        output.print(date.toString()+','+code+','+q+'\n');   // append �goodbye� to file

        output.close();
    }
    
    @Override
    public  void sellStock(int q){
       this.qtyInStock=this.qtyInStock-q;

    }
    @Override
    public  void buyStock(int q){
       this.qtyInStock=this.qtyInStock+q;

    }
    //writing a new stock to csv
    public static void writeStockCSV(String file, String code, String title, String desc, String up, String pp, String qty) throws IOException {
        PrintWriter output = null;

        File confidential = new File(file);
        try {            
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
        output.print('\n'+code+','+title+','+desc+','+up+','+pp+','+qty);

        output.close();
    }
}
