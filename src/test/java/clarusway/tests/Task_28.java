package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task_28 extends TestBase {
    //Create 5 users by using XML parameter and
    //Data Provider on https://thinking-tester-contact-list.herokuapp.com/addUser

    @Test
    @Parameters({"firstName", "lastName", "email", "password"})
    public void test(String firstname, String lastname, String email, String password) {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

    }

}