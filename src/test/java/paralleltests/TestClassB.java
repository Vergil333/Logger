package paralleltests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestClassB {

    private Logger logger;

    @Before
    public void initLogger() {
        logger = Logger.getLogger(TestClassB.class);
    }

    @Test
    public void test_B1() throws InterruptedException {
        Thread.sleep(3500);
        logger.info("Class B Test 1 slept for 3500 millis");
    }

    @Test
    public void test_B2() throws InterruptedException {
        Thread.sleep(2500);
        logger.info("Class B Test 2 slept for 2500 millis");
    }

    @Test
    public void test_B3() throws InterruptedException {
        Thread.sleep(1500);
        logger.info("Class B Test 3 slept for 1500 millis");
    }

    @Test
    public void test_B4() throws InterruptedException {
        Thread.sleep(500);
        logger.info("Class B Test 4 slept for 500 millis");
    }
}
