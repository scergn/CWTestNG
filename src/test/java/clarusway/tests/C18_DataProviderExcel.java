package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class C18_DataProviderExcel extends TestBase {


    @Test(dataProvider = "excelData", dataProviderClass = DataProviderUtils.class)
    public void dataProviderExcelTest1(String username, String password, String comment){

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("comment = " + comment);
        System.out.println("-----");

    }

    @Test(dataProvider = "excelData", dataProviderClass = DataProviderUtils.class)
    public void dataProviderExcelTest2(String username, String password, String comment) throws InterruptedException {

        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).sendKeys(password);

        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        comments.sendKeys(comment);

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        String actualUsername = driver.findElement(By.id("_valueusername")).getText();

        assertEquals(actualUsername,username);

    }



}
