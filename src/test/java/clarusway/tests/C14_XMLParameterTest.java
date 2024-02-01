package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C14_XMLParameterTest extends TestBase {

    @Test
    @Parameters({"username", "password", "comment"})
    public void parameterTest(String username, String password, String comment) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(3000);

        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        Thread.sleep(3000);

        comments.sendKeys(comment);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='submit']")).submit();
        String actualUsername = driver.findElement(By.id("_valueusername")).getText();

        assertEquals(actualUsername, username);


    }


}
