package clarusway.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task_26 {
    /*
	Create tests that depend on each other
	Create beforeClass and set up settings.
	By creating interdependent tests;
	First go to Facebook.
	Then go to Google depending on Facebook,
	Then go to Clarusway depending on Google
	Close the driver.
*/
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test01() {
        driver.get("https://facebook.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://google.com");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://clarusway.com");
        driver.close();
    }
}
