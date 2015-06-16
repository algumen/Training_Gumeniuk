package TestGoantifraud;
/**
 * Created by Oleksii on 16.06.2015.
 * 2. Проверка ввода некорректного логина
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestIncorrectLogEnter_2 {
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
        driver.findElement(By.id("login")).sendKeys("ttt");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("submit_btn")).click();

        // if (isElementPresent(By.id("none_err")))  // Alternative check

        if (isElementPresent(By.xpath(".//*/div[contains(text(),'Login or password is incorrect')]")))  //Check key element in the open page
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
