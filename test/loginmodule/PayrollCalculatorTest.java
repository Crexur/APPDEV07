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
public class PayrollCalculatorTest {
    
    public PayrollCalculatorTest() {
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
     * Test of getTotalSalary method, of class PayrollCalculator.
     */
    @Test
    public void testGetTotalSalary() {
        System.out.println("getTotalSalary");

    // Test case 1: No overtime
    double hourlyRate1 = 10.0;
    double hours1 = 40.0;
    double overtime1 = 0.0;
    PayrollCalculator instance1 = new PayrollCalculator();
    double expResult1 = 400.0; // 10.0 * 40.0
    double result1 = instance1.getTotalSalary(hourlyRate1, hours1, overtime1);
    assertEquals(expResult1, result1, 0);

    // Test case 2: With overtime
    double hourlyRate2 = 15.0;
    double hours2 = 40.0;
    double overtime2 = 10.0;
    PayrollCalculator instance2 = new PayrollCalculator();
    double expResult2 = 825.0; // (15.0 * 1.5) * 10.0 + 15.0 * 40.0
    double result2 = instance2.getTotalSalary(hourlyRate2, hours2, overtime2);
    assertEquals(expResult2, result2, 0);
    }

    /**
     * Test of getRegularPay method, of class PayrollCalculator.
     */
    @Test
    public void testGetRegularPay() {
        System.out.println("getRegularPay");
        
        // Test case
        PayrollCalculator instance = new PayrollCalculator();
        double expResult = 0.0; // Modify with expected result
        double result = instance.getRegularPay();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getOverTimePay method, of class PayrollCalculator.
     */
    @Test
    public void testGetOverTimePay() {
        System.out.println("getOverTimePay");
        
        // Test case
        PayrollCalculator instance = new PayrollCalculator();
        double expResult = 0.0; // Modify with expected result
        double result = instance.getOverTimePay();
        assertEquals(expResult, result, 0);
    }
    
}
