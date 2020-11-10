package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    @Override
    public void onTestStart(final ITestResult result) {
        System.out.printf("TEST - %s START", result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(final ITestResult result) {
        System.out.printf("TEST - %s ENDED SUCCESSFULLY", result.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(final ITestResult result) {
        System.out.printf("TEST - %s FAILURE", result.getMethod().getDescription());
    }

    @Override
    public void onTestSkipped(final ITestResult result) {
        System.out.printf("TEST - %s SKIPPED", result.getMethod().getDescription());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(final ITestResult result) {
    }

    @Override
    public void onStart(final ITestContext context) {
    }

    @Override
    public void onFinish(final ITestContext context) {
    }

}
