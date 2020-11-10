import org.testng.annotations.*;

public class AnnotationsOrder {

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite method executed");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("AfterSuite method executed");
    }

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("BeforeTest method executed");
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("AfterTest method executed");
    }

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("BeforeClass method executed");
    }

    @AfterClass
    public void afterClassMethod() {
        System.out.println("AfterClass method executed");
    }

    @BeforeGroups("groupA")
    public void beforeGroupsMethod() {
        System.out.println("BeforeGroups method executed");
    }

    @AfterGroups("groupA")
    public void afterGroupsMethod() {
        System.out.println("AfterGroups method executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod method executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod method executed");
    }

    @Test()
    public void testMethod1() {
        System.out.println("Test1 executed");
    }

    @Test()
    public void testMethod2() {
        System.out.println("Test2 executed");
    }

    @Test(groups = "groupA")
    public void testMethod3() {
        System.out.println("Test3 executed");
    }
}
