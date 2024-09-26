
package bai3;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true)
            {
                Message message = queue.take();
                if ("0".equals(message.getContent())){
                    System.out.println("Exit ...");
                    break;
                }
                System.out.println("Consumer : " + message.getContent());
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
