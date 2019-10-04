package paralleltests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class TestParallel {

    private Logger logger;

    @Before
    public void initLogger() {
        logger = Logger.getLogger(TestParallel.class);
    }

    // Parallel among classes
    @Test
    public void parallelClasses() {
        logger.info("Started parallel classes tests.");

        Class[] cls = {TestA.class, TestB.class};

        JUnitCore.runClasses(ParallelComputer.classes(), cls);
        logger.info("Ended parallel classes tests.");
    }

    // Parallel among methods in class
    @Test
    public void parallelMethods() {
        logger.info("Started parallel methods of classes test.");
        Class[] cls = {TestA.class, TestB.class};

        JUnitCore.runClasses(ParallelComputer.methods(), cls);
        logger.info("Ended parallel methods of classes test.");
    }

    // Parallel all methods in all classes
    @Test
    public void parallelAllMethods() {
        logger.info("Started parallel classes and their methods test.");
        Class[] cls = {TestA.class, TestB.class};

        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
        logger.info("Ended parallel classes and their methods test.");
    }
}
