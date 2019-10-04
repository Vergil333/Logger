package paralleltests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class TestParallel {

    // Parallel among classes
    @Test
    public void parallelClasses() {
        Class[] cls = {TestClassA.class, TestClassB.class};

        JUnitCore.runClasses(ParallelComputer.classes(), cls);
    }

    // Parallel among methods in class
    @Test
    public void parallelMethods() {
        Class[] cls = {TestClassA.class, TestClassB.class};

        JUnitCore.runClasses(ParallelComputer.methods(), cls);
    }

    // Parallel all methods in all classes
    @Test
    public void parallelAllMethods() {
        Class[] cls = {TestClassA.class, TestClassB.class};

        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }

    @After
    public void delimiter() {
        Logger.getLogger(String.valueOf(TestParallel.class)).info("-----------------------------------");
    }
}
