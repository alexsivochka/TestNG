import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class FactoryTest1 {
    @Test
    public void testMethod1() {
        System.out.println("This is testMethod #1");
    }
}

class FactoryTest2 {
    @Test
    public void testMethod2() {
        System.out.println("This is testMethod #2");
    }
}

public class FactoryExample {
    @Factory
    public Object[] getTestFactoryMethod() {
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new FactoryTest1();
        factoryTest[1] = new FactoryTest2();
        return factoryTest;
    }
}
