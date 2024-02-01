package clarusway.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C13_UsingParameters {

    @Test
    @Parameters("Param1")//XML dosyasında belirtilen paramtre test classta kullanılır
    void paramterizedTest(@Optional("John") String name){//@Optional anatasyonu içine belirtilen değer paramtereye değer atanmadığı durumlarda default olarak kullanılır

        System.out.println("name = " + name);

    }
@Test
    @Parameters({"name","lastname","age"})//XML dosyasında belirtilen paramtre test classta kullanılır
    void threeparamterizedTest( String name,String lastname,String age){//@Optional anatasyonu içine belirtilen değer paramtereye değer atanmadığı durumlarda default olarak kullanılır

        System.out.println(name);
        System.out.println(lastname);
        System.out.println(age);

    }

}
