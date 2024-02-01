package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C15_DataProvider extends TestBase {

    @Test(dataProvider = "nameLastname")
    public void dataProviderTest(String name, String lastname) {
        System.out.println("name = " + name + " -- " + "lastname = " + lastname);


    }

    @DataProvider
    public Object[][] nameLastname() {

        String[][] data = {{"John", "Doe"}, {"Jim", "Sun"}, {"Zoey", "Bread"}};
        return data;
    }
    @Test(dataProvider = "nameLastname")
    @Parameters({"username", "password"})
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
