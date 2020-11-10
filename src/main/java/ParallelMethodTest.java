import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodTest
{
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Before test-method. Thread id is: " + id + ". Name is: " + name);
    }

    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Simple test-method One. Thread id is: " + id + ". Name is: " + name);
    }

    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Simple test-method Two. Thread id is: " + id + ". Name is: " + name);
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("After test-method. Thread id is: " + id + ". Name is: " + name);
    }
}