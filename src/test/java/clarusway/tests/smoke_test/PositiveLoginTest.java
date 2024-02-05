package clarusway.tests.smoke_test;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    public void positiveLoginTest() throws InterruptedException {

        //        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

//        Enter username Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);

//        Enter password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

//        Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);

//        Assert that user singed in
        assertTrue(driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed());

    }

}
