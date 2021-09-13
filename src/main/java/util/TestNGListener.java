package util;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

    private final static Logger LOGGER = Logger.getLogger(TestNGListener.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {
        LOGGER.info("Started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        LOGGER.info("Success!!!");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        LOGGER.info("Failed!!!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        LOGGER.info("Skipped!!!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        LOGGER.info("Some text!!!");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        LOGGER.info("Beginning!!!");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        LOGGER.info("Shutting down!!!");
    }
}
