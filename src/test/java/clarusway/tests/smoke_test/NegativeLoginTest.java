package clarusway.tests.smoke_test;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;
import static clarusway.utilities.ExtentReportUtils.passAndCaptureScreenshot;
import static org.testng.Assert.assertTrue;

public class NegativeLoginTest extends TestBase {

    @Test
    public void negativeLoginTest() throws InterruptedException {
        ExtentReportUtils.createTestReport("Negative Login Test", "......");
        //        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        passAndCaptureScreenshot("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        Enter wrong username
        driver.findElement(By.name("username")).sendKeys("Wrong");
        Thread.sleep(1000);
        passAndCaptureScreenshot("Enter wrong username");

//        Enter password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        passAndCaptureScreenshot("Enter password admin123");

//        Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        passAndCaptureScreenshot("Click login button");


//        Assert error message
        assertTrue(driver.findElement(By.xpath("//p[.='Invalid credentials']")).isDisplayed());
        flush();
    }

}
