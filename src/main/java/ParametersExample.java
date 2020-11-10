import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    @Parameters({"name", "pass"})
    @Test(description = "Check user login")
    public void loginTest(String name, String pass){
        System.out.printf("User name: %s. User password: %s\n", name, pass);
    }
}
