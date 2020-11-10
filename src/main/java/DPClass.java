import org.testng.annotations.DataProvider;

public class DPClass {

    @DataProvider(name = "userData")
    public Object[][] getData() {
        Object[][] userCreds = new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
        };
        return userCreds;
    }

}
