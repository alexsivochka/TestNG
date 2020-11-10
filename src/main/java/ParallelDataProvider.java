import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {

    @DataProvider(name = "userData", parallel = true)
    public Object[][] getData() {
        Object[][] userCreds = new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
        };
        return userCreds;
    }

//    @Test(dataProvider = "userData" ,threadPoolSize=3)
    @Test(dataProvider = "userData")
    public void testMethod(String userName, String userPass)
    {
        Long id = Thread.currentThread().getId();
        System.out.printf("UserName - %s. UserPass - %s. Thread id - %d\n", userName, userPass, id);
    }

}
