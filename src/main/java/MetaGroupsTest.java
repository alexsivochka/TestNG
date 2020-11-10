import org.testng.annotations.Test;

public class MetaGroupsTest {

    @Test(groups = { "include-one" })
    public void testMethodOne() {
        System.out.println("Test method one");
    }

    @Test(groups = { "include-two" })
    public void testMethodTwo() {
        System.out.println("Test method two");
    }

    @Test(groups = { "one-exclude" })
    public void testMethodThree() {
        System.out.println("Test method three");
    }

    @Test(groups = { "two-exclude" })
    public void testMethodFour() {
        System.out.println("Test method Four");
    }

}
