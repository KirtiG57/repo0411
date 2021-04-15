/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.sel.firsttestng.calculator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author deepa
 */
public class calculatorTest {
    
    calculator cal;
    private WebDriver driver;
    private String baseUrl="https://www.indeed.com/";
    
    public calculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
        cal = new calculator();
        System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
    @Test
    public void testADD(){
    
        assertEquals(cal.add(2, 2),4);
       
    }
    @Test
    public void testIndeed() throws Exception{
     driver.get("http://demo.guru99.com/test/delete_customer.php");
     Thread.sleep(2000);
     driver.close();
    }
    
}
