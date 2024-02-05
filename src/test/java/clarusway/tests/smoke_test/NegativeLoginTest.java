package clarusway.tests.smoke_test;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NegativeLoginTest extends TestBase {

    @Test
    public void positiveLoginTest() throws InterruptedException {

        //        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

//        Enter wrong username
        driver.findElement(By.name("username")).sendKeys("Wrong");
        Thread.sleep(1000);

//        Enter password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

//        Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);

//        Assert error message
        assertTrue(driver.findElement(By.xpath("//p[.='Invalid credentials']")).isDisplayed());

    }

}
