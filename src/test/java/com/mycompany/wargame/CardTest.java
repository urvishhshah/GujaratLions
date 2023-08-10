/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.wargame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author urvis
 */
public class CardTest {
    
    public CardTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*/

    /**
     * Test of getValue method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testGetValue_0args() {
        System.out.println("getValue");
        Card instance = null;
        Card.VALUE expResult = null;
        Card.VALUE result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testGetSuit_0args() {
        System.out.println("getSuit");
        Card instance = null;
        Card.TYPES expResult = null;
        Card.TYPES result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testGetSuit_String() {
        System.out.println("getSuit");
        String x = "";
        Card.TYPES expResult = null;
        Card.TYPES result = Card.getSuit(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testGetValue_String() {
        System.out.println("getValue");
        String x = "";
        Card.VALUE expResult = null;
        Card.VALUE result = Card.getValue(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringSuit method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testGetStringSuit() {
        System.out.println("getStringSuit");
        Card.TYPES type_x = null;
        String expResult = "";
        String result = Card.getStringSuit(type_x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of beats method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testBeatsGood() {
        System.out.println("beats");
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testBeatsBad() {
        System.out.println("beats");
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testBeatsBoundry() {
        System.out.println("");
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equalsForWar method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testEqualsForWarGood() {
        System.out.println("equalsForWar");
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testEqualsForWarBad() {
        System.out.println("equalsForWar");
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.jupiter.api.Test
    public void testEqualsForWarBoundry() {
        System.out.println("equalsForWar");
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
