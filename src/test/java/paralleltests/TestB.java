package paralleltests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestB {

    private Logger logger;

    @Before
    public void initLogger() {
        logger = Logger.getLogger(TestB.class);
    }

    @Test
    public void test_B1() throws InterruptedException {
        Thread.sleep(3500);
        logger.info("slept for 3500 millis");
    }

    @Test
    public void test_B2() throws InterruptedException {
        Thread.sleep(2500);
        logger.info("slept for 2500 millis");
    }

    @Test
    public void test_B3() throws InterruptedException {
        Thread.sleep(1500);
        logger.info("slept for 1500 millis");
    }

    @Test
    public void test_B4() throws InterruptedException {
        Thread.sleep(500);
        logger.info("slept for 500 millis");
    }
}
