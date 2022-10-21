/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.icaelement2;

import java.io.IOException;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeesh
 */
public class ASCStockItemInterfaceTest {
    
    public ASCStockItemInterfaceTest() {
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
     * Test of getProductCode method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        String expResult = "";
        String result = instance.getProductCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnitPriceInPence method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetUnitPriceInPence() {
        System.out.println("getUnitPriceInPence");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        int expResult = 0;
        int result = instance.getUnitPriceInPence();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitPriceInPence method, of class ASCStockItemInterface.
     */
    @Test
    public void testSetUnitPriceInPence() {
        System.out.println("setUnitPriceInPence");
        int unitPriceInPence = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.setUnitPriceInPence(unitPriceInPence);
    }

    /**
     * Test of getUnitPriceInPounds method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetUnitPriceInPounds() {
        System.out.println("getUnitPriceInPounds");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        int expResult = 0;
        int result = instance.getUnitPriceInPounds();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitPriceInPounds method, of class ASCStockItemInterface.
     */
    @Test
    public void testSetUnitPriceInPounds() {
        System.out.println("setUnitPriceInPounds");
        int unitPriceInPounds = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.setUnitPriceInPounds(unitPriceInPounds);
    }

    /**
     * Test of getQtyInStock method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetQtyInStock() {
        System.out.println("getQtyInStock");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        int expResult = 0;
        int result = instance.getQtyInStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQtyInStock method, of class ASCStockItemInterface.
     */
    @Test
    public void testSetQtyInStock() {
        System.out.println("setQtyInStock");
        int qtyInStock = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.setQtyInStock(qtyInStock);
    }

    /**
     * Test of getProductDesc method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetProductDesc() {
        System.out.println("getProductDesc");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        String expResult = "";
        String result = instance.getProductDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductDesc method, of class ASCStockItemInterface.
     */
    @Test
    public void testSetProductDesc() {
        System.out.println("setProductDesc");
        String productDesc = "";
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.setProductDesc(productDesc);
    }

    /**
     * Test of getProductTitle method, of class ASCStockItemInterface.
     */
    @Test
    public void testGetProductTitle() {
        System.out.println("getProductTitle");
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        String expResult = "";
        String result = instance.getProductTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductTitle method, of class ASCStockItemInterface.
     */
    @Test
    public void testSetProductTitle() {
        System.out.println("setProductTitle");
        String productTitle = "";
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.setProductTitle(productTitle);
    }

    /**
     * Test of sellStock method, of class ASCStockItemInterface.
     */
    @Test
    public void testSellStock() {
        System.out.println("sellStock");
        int q = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.sellStock(q);
    }

    /**
     * Test of updateCSV method, of class ASCStockItemInterface.
     */
    @Test
    public void testUpdateCSV() throws Exception {
        System.out.println("updateCSV");
        String file = "";
        int replace = 0;
        int row = 0;
        int col = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.updateCSV(file, replace, row, col);
    }

    /**
     * Test of writeCSV method, of class ASCStockItemInterface.
     */
    @Test
    public void testWriteCSV() throws Exception {
        System.out.println("writeCSV");
        String file = "";
        LocalDateTime date = null;
        String code = "";
        int price = 0;
        int q = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.writeCSV(file, date, code, price, q);
    }

    /**
     * Test of buyStock method, of class ASCStockItemInterface.
     */
    @Test
    public void testBuyStock() {
        System.out.println("buyStock");
        int qtyToBuy = 0;
        ASCStockItemInterface instance = new ASCStockItemInterfaceImpl();
        instance.buyStock(qtyToBuy);
    }

    public class ASCStockItemInterfaceImpl implements ASCStockItemInterface {

        public String getProductCode() {
            return "";
        }

        public int getUnitPriceInPence() {
            return 0;
        }

        public void setUnitPriceInPence(int unitPriceInPence) {
        }

        public int getUnitPriceInPounds() {
            return 0;
        }

        public void setUnitPriceInPounds(int unitPriceInPounds) {
        }

        public int getQtyInStock() {
            return 0;
        }

        public void setQtyInStock(int qtyInStock) {
        }

        public String getProductDesc() {
            return "";
        }

        public void setProductDesc(String productDesc) {
        }

        public String getProductTitle() {
            return "";
        }

        public void setProductTitle(String productTitle) {
        }

        public void sellStock(int q) {
        }

        public void updateCSV(String file, int replace, int row, int col) throws IOException {
        }

        public void writeCSV(String file, LocalDateTime date, String code, int price, int q) throws IOException {
        }

        public void buyStock(int qtyToBuy) {
        }
    }
    
}
