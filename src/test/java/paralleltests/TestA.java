package paralleltests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestA {

    private Logger logger;

    @Before
    public void initLogger() {
        logger = Logger.getLogger(TestA.class);
    }

    @Test
    public void test_A1() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("slept for 1000 millis");
    }

    @Test
    public void test_A2() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("slept for 2000 millis");
    }

    @Test
    public void test_A3() throws InterruptedException {
        Thread.sleep(3000);
        logger.info("slept for 3000 millis");
    }

    @Test
    public void test_A4() throws InterruptedException {
        Thread.sleep(4000);
        logger.info("slept for 4000 millis");
    }

}
