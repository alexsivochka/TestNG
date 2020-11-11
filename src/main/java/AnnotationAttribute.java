import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationAttribute {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite method executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite method executed");
    }

    @Test(priority = 2, description = "Test-2")
    public void testMethod1() {
        Assert.assertTrue(false);
        System.out.println("This test has priority = 2");
    }

    @Test(priority = 0, description = "Test-0")
    public void testMethod2() {
        System.out.println("This test has priority = 0. Should be first.");
    }

    @Test(priority = 3,
            dependsOnMethods = "testMethod1",
            description = "Test-3")
    public void testMethod3()  {
        System.out.println("This with priority = 3");
    }

    @Test(priority = 1,
            description = "Test-1",
            timeOut = 1000)
    public void testMethod4() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("This with priority = 1");
    }

    @Test(enabled = false)
    public void testMethod5() {
        System.out.println("This method will be skipped from the test run using the attribute enabled=false");
    }

    @Test(priority = 6, invocationCount = 3, invocationTimeOut = 20, description = "Test-6")
    public void testMethod6() {
        System.out.println("This method will be executed by 3 times");
    }

    @Test(priority = 7, expectedExceptions = ArithmeticException.class, description = "Test-7")
    public void testMethod7() {
        System.out.println("This method checks exception appears");
        Assert.assertEquals(2, 6/0);
    }
}
