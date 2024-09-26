
package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        RandomNumber randomNumber = new RandomNumber("output.txt");
        
        Thread wThread = new Thread(randomNumber);
        wThread.start();
        
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("Nhap stop de tam dung chuong trinh");
            String input = sc.nextLine();
            
            if ("stop".equalsIgnoreCase(input)) {
                randomNumber.stop();
                break;
            }
        }

        System.out.println("STOP !");
        sc.close();
    }
}
