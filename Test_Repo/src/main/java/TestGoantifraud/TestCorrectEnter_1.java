package TestGoantifraud;
/**
 * Created by Oleksii on 16.06.2015.
 * 1. Проверка корректного входа (log: tt; pass: 123456).
 */

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCorrectEnter_1 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://goantifraud.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl + "/manager/login/");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("tt");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("submit_btn")).click();

        if (isElementPresent(By.id("tab-1090-btnInnerEl")))  //Check key element in the open page
            System.out.println("Test is passed");
        else System.out.println("Test is not passed");
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
