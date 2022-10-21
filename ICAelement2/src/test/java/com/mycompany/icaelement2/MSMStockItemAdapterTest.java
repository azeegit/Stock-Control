/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.icaelement2;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author zeesh
 */
public class MSMStockItemAdapterTest {
    
    public MSMStockItemAdapterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductCode method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        String expResult = "RUN-234567-MSM";
        String result = instance.getProductCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUnitPriceInPence method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetUnitPriceInPence() {
        System.out.println("getUnitPriceInPence");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        int expResult = 50;
        int result = instance.getUnitPriceInPence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUnitPriceInPence method, of class MSMStockItemAdapter.
     */

    /**
     * Test of getUnitPriceInPounds method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetUnitPriceInPounds() {
        System.out.println("getUnitPriceInPounds");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        int expResult = 88;
        int result = instance.getUnitPriceInPounds();
        assertEquals(expResult, result);
    }


    /**
     * Test of getQtyInStock method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetQtyInStock() {
        System.out.println("getQtyInStock");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        int expResult = 50;
        int result = instance.getQtyInStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQtyInStock method, of class MSMStockItemAdapter.
     */
    @Test
    public void testSetQtyInStock() {
        System.out.println("setQtyInStock");
        int qtyInStock = 0;
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        instance.setQtyInStock(qtyInStock);
    }

    /**
     * Test of getProductDesc method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetProductDesc() {
        System.out.println("getProductDesc");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        String expResult = "Great trainers for running cross country";
        String result = instance.getProductDesc();
        assertEquals(expResult, result);

    }


    /**
     * Test of getProductTitle method, of class MSMStockItemAdapter.
     */
    @Test
    public void testGetProductTitle() {
        System.out.println("getProductTitle");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        String expResult = "RunEverywhere";
        String result = instance.getProductTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of sellStock method, of class MSMStockItemAdapter.
     */
    @Test
    public void testSellStock() {
        System.out.println("sellStock");
        int q = 0;
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        instance.sellStock(q);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of writeCSV method, of class MSMStockItemAdapter.
     */
    @Test
    public void testWriteCSV() throws Exception {
        System.out.println("writeCSV");
        String file = "test.csv";
        LocalDateTime date = LocalDateTime.now();
        String code = "ABC";
        int price = 0;
        int q = 0;
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        instance.writeCSV(file, date, code, price, q);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buyStock method, of class MSMStockItemAdapter.
     */
    @Test
    public void testBuyStock() {
        System.out.println("buyStock");
        int qtyToBuy = 0;
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        instance.buyStock(qtyToBuy);
    }

    /**
     * Test of toString method, of class MSMStockItemAdapter.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        MSMStockItemAdapter instance = new MSMStockItemAdapter(new MSMStockItem(1,"234567","RunEverywhere                                               Great trainers for running cross country",8850,50));
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
