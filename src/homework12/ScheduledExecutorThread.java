package homework12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorThread {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            printCurrentTime();
        }, 0, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Минуло 5 секунд");
        }, 0, 5, TimeUnit.SECONDS);
    }

    private static void printCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        long startTime = System.currentTimeMillis();
        String formattedTime = simpleDateFormat.format(new Date(startTime));
        System.out.println("Час, що минув від моменту запуску програми: " + formattedTime);
    }
}
