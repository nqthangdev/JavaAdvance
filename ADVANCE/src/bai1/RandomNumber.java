package bai1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class RandomNumber implements Runnable{
    
    boolean run = true;
    BufferedWriter writer;
    Random random;
    
    public RandomNumber(String filename){
        try {
            writer = new BufferedWriter(new FileWriter(filename, true));
            random = new Random();
        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }    

    @Override
    public void run() {
        try {
            while (run) {
                int randomNumber = random.nextInt(100);
                writer.write(String.valueOf(randomNumber));
                writer.newLine();
                System.out.println("So: " + randomNumber);
                writer.flush();
                Thread.sleep(1000);  
            }
            writer.close();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException();
        }
    }

    void stop() {
        run = false;
    }
}
