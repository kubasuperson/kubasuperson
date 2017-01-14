package pl.Maven.Threating;

/**
 * Created by RENT on 2017-01-14.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(i);
        }
    }
}
