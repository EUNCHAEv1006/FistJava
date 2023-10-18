package week05.Thread;

public class Main {
    public static void main(String[] args) {
//        TestThread testThread = new TestThread();
//        testThread.start();

//        Runnable run = new TestRunnable();
//        week05.Thread thread = new week05.Thread(run);
//
//        thread.start()

        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}