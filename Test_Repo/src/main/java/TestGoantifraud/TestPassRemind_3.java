package TestGoantifraud;

/**
 * Created by Oleksii on 16.06.2015.
 * 3. Проверка восстановления пароля
 */

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TestPassRemind_3 {

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
        driver.get(baseUrl + "/manager/login/?next=/manager/");
        driver.findElement(By.linkText("Forgot your password?")).click();

        if (isElementPresent(By.xpath(".//*/span[contains(text(),'Password remind')]")))  //Check key element in the open page
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
