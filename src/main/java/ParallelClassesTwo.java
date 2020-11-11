import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClassesTwo {

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Before test-class ParallelClassesTwo. Thread id is: " + id + ". Name is: " + name);
    }

    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Sample test-method One ParallelClassesTwo. Thread id is: " + id + ". Name is: " + name);
    }

    @Test
    public void testMethodTwo() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Sample test-method Two ParallelClassesTwo. Thread id is: " + id + ". Name is: " + name);
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("After test-class ParallelClassesTwo. Thread id is: " + id + ". Name is: " + name);
    }

}
