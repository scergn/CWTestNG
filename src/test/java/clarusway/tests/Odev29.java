package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.ExcelUtils;
import clarusway.utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Odev29 extends ParameterBrowserTestBase  {
    /*
      Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
      Add 10 notes using data provider with excel
      Run it with 3 different browsers using XML file
      Run it parallel with 3 threads
      */
   @Test(dataProvider = "excelDataParallel")
    public void odev29(String title, String note) throws Exception {
       WebDriver driver=new ChromeDriver();
    Thread.sleep(3000);
       driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
       Thread.sleep(3000);
      driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
       Thread.sleep(3000);
       driver.findElement(By.id("add-note")).click();
       Thread.sleep(3000);
       driver.quit();

   }
    @DataProvider(parallel = true)
    public Object[][] excelDataParallel(){
        ExcelUtils excelUtils=new ExcelUtils("resources/username_password.xlsx","Sheet2");

        return excelUtils.getDataArrayWithoutFirstRow();
    }
}
