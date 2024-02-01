package clarusway.tests;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Task_27 extends TestBase {

    @Test
    public void test01() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        int earliestYear = Integer.MAX_VALUE;
        String earliestBuiltTowerHeight = null;

        for (WebElement row : rows) {
            WebElement yearElement = row.findElement(By.xpath("td[4]"));
            int currentYear = Integer.parseInt(yearElement.getText());

            if (currentYear < earliestYear) {
                earliestYear = currentYear;
                earliestBuiltTowerHeight = row.findElement(By.xpath("td[3]")).getText();
            }
        }
        System.out.println("earliestBuiltTowerHeight = " + earliestBuiltTowerHeight);
    }
}

