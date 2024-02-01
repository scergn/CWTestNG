package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C16_DataProviderUtilsTest extends TestBase {

    @Test(dataProvider = "nameLastname", dataProviderClass = DataProviderUtils.class)
    public void parameterTest(String username, String password) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[@value='submit']")).submit();
        String actualUsername = driver.findElement(By.id("_valueusername")).getText();

        assertEquals(actualUsername, username);


    }


}
