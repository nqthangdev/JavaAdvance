package bai2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RealTimeRandom {
    public static void main(String[] args) {
        int minute = 60 * 1000;

        Random random = new Random();

        double time = System.currentTimeMillis();

        while((System.currentTimeMillis() - time) < minute)
        {
            int number = random.nextInt(100);
            System.out.println("So : " + number);

            //Cac so random cach nhau sau 3 giay
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("Loading ... ");
            }
        }

        System.out.println("End !");
    }
}
