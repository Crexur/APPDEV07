/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loginmodule;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class VerifyUserLoginTest {
    
    public VerifyUserLoginTest() {
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
     * Test of verifyUserLoginCredentials method, of class VerifyUserLogin.
     */
     @Test
    public void testVerifyUserLoginCredentials() {
        System.out.println("verifyUserLoginCredentials");

        // Test case 1: Valid credentials
        String inputUserName1 = "bryle";
        String inputPassword1 = "1234";
        VerifyUserLogin instance1 = new VerifyUserLogin();
        boolean expResult1 = true;
        boolean result1 = instance1.verifyUserLoginCredentials(inputUserName1, inputPassword1);
        assertEquals(expResult1, result1);

        // Test case 2: Invalid credentials
        String inputUserName2 = "invalidUsername";
        String inputPassword2 = "invalidPassword";
        VerifyUserLogin instance2 = new VerifyUserLogin();
        boolean expResult2 = false;
        boolean result2 = instance2.verifyUserLoginCredentials(inputUserName2, inputPassword2);
        assertEquals(expResult2, result2);
    }
    
}
