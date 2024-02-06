package clarusway.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtils implements ITestListener {

    @Override//Test methodu çalışmaya başladığında çalışır
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+" testi başladı");
    }

    @Override//Başarı ile geçen (PASS) test sonrası çalışır
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+" testi geçti");
    }

    @Override//Kalan (FAIL) test sonrası çalışır
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+" testi kaldı");
    }

    @Override//Atlanan (SKIP) test sonrası çalışır
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" testi atlandı");
    }

    @Override//Belirli bir başarı oranı sonrası çalışır
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //
    }

    @Override//Zaman aşımı ile kalan test sonrası çalışır
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println(result.getName()+" testi zaman aşımı ile kaldı");
    }

    @Override//Tüm test başlarken çalışır
    public void onStart(ITestContext context) {
        System.out.println("Test Başladı: "+context.getStartDate());
    }

    @Override//Tüm test bitince çalışır
    public void onFinish(ITestContext context) {
        System.out.println("Test Bitti: "+context.getEndDate());
    }
}
