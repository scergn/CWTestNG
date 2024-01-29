package clarusway.tests;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    /*
    - İkinci test methodu birinci test methoduna bağımlı olmak istediğinde bu attribute kullanılır.
    - Birinci test methodu başarısız olursa, birinci test methodundaki bağımlı method, yani ikinci test methodu çalışmayacaktır.
    - Bir parametrede bir method veya birden çok method iletilebilir.
    */
    @Test
    public void loginTest() {
        System.out.println("LoginTest");
       // throw new RuntimeException();//--> Bu metod fail olursa bu metoda bagli diger metodlar calismaz
    }

    @Test(dependsOnMethods = {"loginTest"})//---> homepageTest, loginTest'e bagimlidir. homepageTest calismadan login test calismaz
    public void homepageTest() {
        System.out.println("homepageTest");
    }

    @Test(dependsOnMethods = {"homepageTest", "loginTest"})
    public void smokeTest() {
        System.out.println("smokeTest");
    }

    @Test
    public void independentTest(){

    }

}
