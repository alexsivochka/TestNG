package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ListenerExample {

    @Test(description = "Check sum of numbers")
    public void checkSum(){
        Assert.assertEquals(5, 5);
    }

    @Test(description = "Check diff of numbers")
    public void checkSub(){
        Assert.assertEquals(7, 6);
    }

    @Test(description = "Check mul of numbers", dependsOnMethods = "checkSub")
    public void checkMul(){
        Assert.assertEquals(8, 6);
    }
}
