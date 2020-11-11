import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

//    @DataProvider(name = "userData")
//    public Object[][] getData() {
//        Object[][] userCreds = new Object[][]{
//                {"user1", "pass1"},
//                {"user2", "pass2"},
//                {"user3", "pass3"},
//        };
//        return userCreds;
//    }
//
//    @Test(description = "Check user login", dataProvider = "userData")
//    public void loginTest(String name, String pass){
//        System.out.printf("User name: %s. User password: %s\n", name, pass);
//    }


    @Test(description = "Check user login2", dataProvider = "userData", dataProviderClass = DPClass.class)
    public void loginTest2(String name, String pass){
        System.out.printf("User name: %s. User password: %s\n", name, pass);
    }

}
