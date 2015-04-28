/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.Callys.web.test;
 
import static org.junit.Assert.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;
 
/**
 *
 * @author Jj.alarcon10
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CallysTest {
 
 
    private static WebDriver driver;
    private static String baseUrl;
    private static boolean acceptNextAlert = true;
    private static StringBuffer verificationErrors = new StringBuffer();
 
    /*La anotación ‘@BeforeClass’ indica lo que se debe ejecutar ANTES de correr
     el archivo de pruebas. Este método instancia un nuevo driver firefox
     (causando la apertura de una ventana física de firefox).*/
    @BeforeClass
    public static void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8080";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    /* La anotación ‘@AfterClass’ indica lo que se debe ejecutar DESPUÉS de ejecutar
     el archivo de pruebas. Este método cierra la ventana de firefox
     abierta por @BeforeClass que se utilizó para la prueba.*/
 
    @AfterClass
    public static void tearDown() throws Exception {
 
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
 
    @Before
    public void setUpTest() {
        driver.get(baseUrl + "/Callys.service");
    }
        
        @Test
    public void t1createStamp() throws Exception {
        boolean success = false;
        driver.findElement(By.id("stamp")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("upload")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("price")).clear();
        driver.findElement(By.id("name")).sendKeys("Estampa");
        driver.findElement(By.id("price")).sendKeys("20");
        driver.findElement(By.id("saveStamp")).click();
        Thread.sleep(2000);
        success = true;
        assertTrue(success);
        Thread.sleep(2000);
    }
}