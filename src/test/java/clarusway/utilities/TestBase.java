package clarusway.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {

    protected static WebDriver driver;
    protected static Faker faker;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        faker=new Faker();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("--disbale-cookies");
        chromeOptions.addArguments("disable-infobars");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }

}
