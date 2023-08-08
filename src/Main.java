// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //runClassicSingelton();
        runThreadSafeSingelton();
    }

    private static void runClassicSingelton() {
        RunnableClassicSingleton run1 = new RunnableClassicSingleton("Thread1");
        Thread thread1 = new Thread(run1);
        thread1.start();

        RunnableClassicSingleton run2 = new RunnableClassicSingleton("Thread2");
        Thread thread2 = new Thread(run2);
        thread2.start();

        RunnableClassicSingleton run3 = new RunnableClassicSingleton("Thread3");
        Thread thread3 = new Thread(run3);
        thread3.start();
    }
    private static void runThreadSafeSingelton() {
        RunnableThreadSafeSingleton run1 = new RunnableThreadSafeSingleton("Thread1");
        Thread thread1 = new Thread(run1);
        thread1.start();

        RunnableThreadSafeSingleton run2 = new RunnableThreadSafeSingleton("Thread2");
        Thread thread2 = new Thread(run2);
        thread2.start();

        RunnableThreadSafeSingleton run3 = new RunnableThreadSafeSingleton("Thread3");
        Thread thread3 = new Thread(run3);
        thread3.start();
    }

    static class RunnableClassicSingleton implements Runnable{
        String Id;

        public RunnableClassicSingleton(String id) {
            Id = id;
        }

        @Override
        public void run() {
            ClassicSingleton Singelton = ClassicSingleton.getInstance(Id);
        }
    }

    static class RunnableThreadSafeSingleton implements Runnable{
        String Id;

        public RunnableThreadSafeSingleton(String id) {
            Id = id;
        }

        @Override
        public void run() {
            SynchronizeSingleton Singelton = SynchronizeSingleton.getInstance(Id);
        }
    }
}