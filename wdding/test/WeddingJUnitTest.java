/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EELU
 */
public class WeddingJUnitTest {
    
    public WeddingJUnitTest() {
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

    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "esraa123";
        String password = "12345";
        boolean expResult = false;
        boolean result = dbconnection.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of conn method, of class dbconnection.
     */
//    @Test
//    public void testConn() {
//        System.out.println("conn");
//        dbconnection.conn();
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }

    /**
     * Test of insert method, of class dbconnection.
     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        String id = "";
//        String contactnum = "";
//        String name = "";
//        String age = "";
//        String username = "";
//        String password = "";
//        dbconnection.insert(id, contactnum, name, age, username, password);
//        // TODO review the generated test code and remove the default call to fail.
//      //  fail("The test case is a prototype.");
//    }

    /**
     * Test of getuserdata method, of class dbconnection.
     */
//    @Test
//    public void testGetuserdata() {
//        System.out.println("getuserdata");
//        String[] expResult = null;
//        String[] result = dbconnection.getuserdata();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      //  fail("The test case is a prototype.");
//    }
}
