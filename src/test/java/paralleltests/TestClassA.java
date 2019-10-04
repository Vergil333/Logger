package paralleltests;

import org.junit.Test;

public class TestClassA {

    @Test
    public void test_A1() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Class A Test 1 slept for 100 millis");
    }

    @Test
    public void test_A2() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Class A Test 2 slept for 200 millis");
    }

    @Test
    public void test_A3() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Class A Test 3 slept for 300 millis");
    }

    @Test
    public void test_A4() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Class A Test 4 slept for 400 millis");
    }

}
