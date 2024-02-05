package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C25_ParallelCrossBrowserTest  {

    /*
    Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
    Add 10 notes using data provider with excel
    Run it with 3 different browsers using XML file
    Run it parallel with 3 threads
    */
    @Test(dataProvider = "excelDataTitleAndNote", dataProviderClass = DataProviderUtils.class)
    public void test1Chrome(String title, String note) {
        WebDriver driver = new ChromeDriver();
        //     Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        //     Add 10 notes using data provider with excel
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        //     Run it with 3 different browsers using XML file


        //     Run it parallel with 3 threads
        driver.quit();
    }@Test(dataProvider = "excelDataTitleAndNote", dataProviderClass = DataProviderUtils.class)
    public void test1Edge(String title, String note) {
        WebDriver driver = new EdgeDriver();
        //     Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        //     Add 10 notes using data provider with excel
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        //     Run it with 3 different browsers using XML file


        //     Run it parallel with 3 threads
        driver.quit();
    }@Test(dataProvider = "excelDataTitleAndNote", dataProviderClass = DataProviderUtils.class)
    public void test1Firefox(String title, String note) {
        WebDriver driver = new FirefoxDriver();
        //     Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        //     Add 10 notes using data provider with excel
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        //     Run it with 3 different browsers using XML file


        //     Run it parallel with 3 threads
        driver.quit();
    }
}
