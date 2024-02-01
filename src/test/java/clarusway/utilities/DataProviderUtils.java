package clarusway.utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] nameLastname(){
        return new String[][]{ {"John","Doe"}, {"Jim","Sun"}, {"Zoey","Bread"}, {"Cedric","Known"} };
    }

    @DataProvider(name = "fakerDataProvider")//Metod adı yerine isimlendirme de kullanılabilir
    public Object[][] fakeData(){

        Faker faker = new Faker();

        return new String[][]{
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()}

        };

    }

    @DataProvider
    public Object[][] excelData(){

        ExcelUtils excelUtils = new ExcelUtils("resources/username_password.xlsx","Sheet1");

        return excelUtils.getDataArrayWithoutFirstRow();

    }@DataProvider(parallel = true)
    public Object[][] excelDataParallel(){

        ExcelUtils excelUtils = new ExcelUtils("resources/username_password.xlsx","Sheet1");

        return excelUtils.getDataArrayWithoutFirstRow();

    }



}
