package clarusway.tests;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static clarusway.utilities.ExtentReportUtils.flush;
import static clarusway.utilities.ExtentReportUtils.passAndCaptureScreenshot;

public class Task_30 extends TestBase {
    /*
Go to https://automationexercise.com/
Create an account and delete it.
Create HTML report for each step with screenshots
 */

    @Test
    public void test() throws InterruptedException {
        ExtentReportUtils.createTestReport("Test: Task_30", "Task_30");

        //Go to https://automationexercise.com/
        driver.get("https://automationexercise.com/");
        ExtentReportUtils.info("Kullanıcı anasayfaya gider");
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        //Create an account and delete it.
        ExtentReportUtils.info("Kullanıcı sign-up/login butonuna tiklar");
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı first name girer");
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(faker.name().firstName());
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı e-mail girer");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(faker.internet().emailAddress());
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı sign-up butonuna clickler");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı cinsiyet secer");
        driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı parola yazar");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(faker.internet().password(), Keys.PAGE_DOWN);
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı dogum gunu secer");
        driver.findElement(By.xpath("//select[@id='days']"));
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(dropDown1);
        select.selectByIndex(10);
        Thread.sleep(2000);
        passAndCaptureScreenshot("https://automationexercise.com/");


        ExtentReportUtils.info("Kullanıcı dogum ayi secer");
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='months']"));
        Select select1 = new Select(dropDown2);
        select1.selectByIndex(5);
        Thread.sleep(2000);
        passAndCaptureScreenshot("https://automationexercise.com/");


        ExtentReportUtils.info("Kullanıcı dogum yili secer");
        WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='years']"));
        Select select3 = new Select(dropDown3);
        select3.selectByVisibleText("1991");
        Thread.sleep(2000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı haber bulteni opsiyonunu secer");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı 2. opsiyonunu secer");
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        Thread.sleep(1000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin isim girer");
        driver.findElement(By.id("first_name")).sendKeys(faker.name().firstName());
        Thread.sleep(1000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin soyisim girer");
        driver.findElement(By.id("last_name")).sendKeys(faker.name().lastName());
        Thread.sleep(1000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress  girer");
        driver.findElement(By.id("address1")).sendKeys(faker.address().streetAddress(), Keys.PAGE_DOWN);
        Thread.sleep(1000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin ulke secer");
        WebElement dropDown4 = driver.findElement(By.xpath("//select[@name='country']"));
        Select select4 = new Select(dropDown4);
        select4.selectByIndex(1);
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin eyalet girer");
        driver.findElement(By.id("state")).sendKeys(faker.address().state());
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin sehir girer");
        driver.findElement(By.id("city")).sendKeys(faker.address().city());
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin posta kodu girer");
        driver.findElement(By.id("zipcode")).sendKeys(faker.address().zipCode());
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı adress icin posta kodu girer");
        driver.findElement(By.id("mobile_number")).sendKeys(faker.number().digits(10));
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı hesap olusturmak icin buttona basar");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");
        driver.navigate().refresh();

        ExtentReportUtils.info("Kullanıcı hesap olusturduktan sonra devam buttona basar");
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        Thread.sleep(2000);
        passAndCaptureScreenshot("https://automationexercise.com/");

        ExtentReportUtils.info("Kullanıcı hesabini silmek icin  buttona basar");
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        Thread.sleep(500);
        passAndCaptureScreenshot("https://automationexercise.com/");
        flush();
    }

}