/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.mycompany.icaelement2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author zeesh
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.icaelement2.MainTest.class, com.mycompany.icaelement2.MSMStockItemTest.class, com.mycompany.icaelement2.ASCStockItemTest.class, com.mycompany.icaelement2.MSMStockItemAdapterTest.class, com.mycompany.icaelement2.ASCStockItemInterfaceTest.class})
public class Icaelement2Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
