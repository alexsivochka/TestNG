import org.testng.annotations.Test;

public class RegularExpressionGroupTest {

    @Test(groups = { "include-test-one" })
    public void testMethodOne() {
        System.out.println("Test method one - include");
    }

    @Test(groups = { "include-test-two" })
    public void testMethodTwo() {
        System.out.println("Test method two - include");
    }

    @Test(groups = { "test-one-exclude" })
    public void testMethodThree() {
        System.out.println("Test method three - exclude");
    }

    @Test(groups = { "test-two-exclude" })
    public void testMethodFour() {
        System.out.println("Test method Four - exclude");
    }
}
