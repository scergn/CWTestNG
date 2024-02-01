package clarusway.tests;

import org.testng.annotations.Test;

public class C06_Description {
    //Testle ilgili bilgileri açıklayan @Test annotationa eklenen ve genelde tek bir dizeden oluşan açıklamadır.
    @Test(description = "US01_TC03")
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(description = "Test 02")
    public void test02() {
        System.out.println("Test 02");
    }

    @Test
    public void test03() {
        System.out.println("Test 03");
    }
}