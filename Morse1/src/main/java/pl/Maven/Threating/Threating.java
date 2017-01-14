package pl.Maven.Threating;

/**
 * Created by RENT on 2017-01-14.
 */
public class Threating {
    public static void main(String[] args) {
//
//        Runnable runnable = new MyThread();
//
//        Runnable runnable2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 100000; i < 110000; i++) {
////                    try {
////                        Thread.sleep(100);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    System.out.println(i);
//                }
//            }
//        };
//        Thread thread = new Thread(runnable);
//        Thread thread2 = new Thread(runnable2);
//
//        System.out.println("Przed wywolaniem");
//        thread.start();
//        thread2.start();
//        System.out.println("Po wywolaniu");
//
//        Thread thread1 = new MyThread2();
//        thread1.start();

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        break;
                    }
                    System.out.print(". ");
                }
            }
        };
        Thread thread = new Thread(runnable3);
        thread.start();

        long sum = sum(10_000_000_000l);
        System.out.println("\nSuma: " + sum);

        thread.interrupt();


    }

    public static long sum(long x) {
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }


}
