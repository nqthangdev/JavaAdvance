
package bai3;

import java.util.concurrent.BlockingQueue;

public  class Producer extends Thread{

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<=10; i++){
                String content = "Message " + i;
                Message message = new Message(content);

                System.out.println("Producer : " + content);
                queue.put(message);
                Thread.sleep(2000);
            }
            queue.put(new Message("0"));
            System.out.println("End");

        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
}
