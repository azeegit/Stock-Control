/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.icaelement2;

import java.time.LocalDateTime;
import java.util.List;
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
public class ASCStockItemTest {
    
    public ASCStockItemTest() {
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
     * Test of getProductCode method, of class ASCStockItem.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        String expResult = "RUN1234567";
        String result = instance.getProductCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductCode method, of class ASCStockItem.
     */
    @Test
    public void testSetProductCode() {
        System.out.println("setProductCode");
        String productCode = "";
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setProductCode(productCode);

    }

    /**
     * Test of getProductTitle method, of class ASCStockItem.
     */
    @Test
    public void testGetProductTitle() {
        System.out.println("getProductTitle");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        String expResult = "Run-Tech Running shorts";
        String result = instance.getProductTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductTitle method, of class ASCStockItem.
     */
    @Test
    public void testSetProductTitle() {
        System.out.println("setProductTitle");
        String productTitle = "ERP";
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setProductTitle(productTitle);

    }

    /**
     * Test of getProductDesc method, of class ASCStockItem.
     */
    @Test
    public void testGetProductDesc() {
        System.out.println("getProductDesc");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        String expResult = "High-quality running shorts";
        String result = instance.getProductDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductDesc method, of class ASCStockItem.
     */
    @Test
    public void testSetProductDesc() {
        System.out.println("setProductDesc");
        String productDesc = "DESC";
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setProductDesc(productDesc);
    }

    /**
     * Test of getUnitPriceInPounds method, of class ASCStockItem.
     */
    @Test
    public void testGetUnitPriceInPounds() {
        System.out.println("getUnitPriceInPounds");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        int expResult = 40;
        int result = instance.getUnitPriceInPounds();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitPriceInPounds method, of class ASCStockItem.
     */
    @Test
    public void testSetUnitPriceInPounds() {
        System.out.println("setUnitPriceInPounds");
        int unitPriceInPounds = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setUnitPriceInPounds(unitPriceInPounds);
    }

    /**
     * Test of getUnitPriceInPence method, of class ASCStockItem.
     */
    @Test
    public void testGetUnitPriceInPence() {
        System.out.println("getUnitPriceInPence");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        int expResult = 20;
        int result = instance.getUnitPriceInPence();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitPriceInPence method, of class ASCStockItem.
     */
    @Test
    public void testSetUnitPriceInPence() {
        System.out.println("setUnitPriceInPence");
        int unitPriceInPence = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setUnitPriceInPence(unitPriceInPence);
    }

    /**
     * Test of getQtyInStock method, of class ASCStockItem.
     */
    @Test
    public void testGetQtyInStock() {
        System.out.println("getQtyInStock");
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        int expResult = 16;
        int result = instance.getQtyInStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQtyInStock method, of class ASCStockItem.
     */
    @Test
    public void testSetQtyInStock() {
        System.out.println("setQtyInStock");
        int qtyInStock = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.setQtyInStock(qtyInStock);
    }

    /**
     * Test of toString method, of class ASCStockItem.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ASCStockItem instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of loadStockCSV method, of class ASCStockItem.
     */
    @Test
    public void testLoadStockCSV() {
        System.out.println("loadStockCSV");
        int expResult = 3;
        List<ASCStockItem> result = ASCStockItem.loadStockCSV();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of updateCSV method, of class ASCStockItem.
     */
    @Test
    public void testUpdateCSV() throws Exception {
        System.out.println("updateCSV");
        String file = "test.csv";
        int replace = 4;
        int row = 0;
        int col = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.updateCSV(file, replace, row, col);
    }

    /**
     * Test of writeCSV method, of class ASCStockItem.
     */
    @Test
    public void testWriteCSV() throws Exception {
        System.out.println("writeCSV");
        String file = "test.csv";
        LocalDateTime date = LocalDateTime.now();
        String code = "R123";
        int price = 0;
        int q = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.writeCSV(file, date, code, price, q);
    }

    /**
     * Test of sellStock method, of class ASCStockItem.
     */
    @Test
    public void testSellStock() {
        System.out.println("sellStock");
        int q = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.sellStock(q);
    }

    /**
     * Test of buyStock method, of class ASCStockItem.
     */
    @Test
    public void testBuyStock() {
        System.out.println("buyStock");
        int q = 0;
        ASCStockItem instance = new ASCStockItem("RUN1234567","Run-Tech Running shorts","High-quality running shorts",40,20,16);
        instance.buyStock(q);
    }
    
}
