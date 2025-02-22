import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class PerformanceTest {
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}

public class PerformanceTestSuite {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() throws InterruptedException {
        new PerformanceTest().longRunningTask();
    }
}
