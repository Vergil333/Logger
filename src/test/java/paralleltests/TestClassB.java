package paralleltests;

import org.junit.Test;

public class TestClassB {

    @Test
    public void test_B1() throws InterruptedException {
        Thread.sleep(350);
        System.out.println("Class B Test 1 slept for 350 millis");
    }

    @Test
    public void test_B2() throws InterruptedException {
        Thread.sleep(250);
        System.out.println("Class B Test 2 slept for 250 millis");
    }

    @Test
    public void test_B3() throws InterruptedException {
        Thread.sleep(150);
        System.out.println("Class B Test 3 slept for 150 millis");
    }

    @Test
    public void test_B4() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("Class B Test 4 slept for 50 millis");
    }
}
