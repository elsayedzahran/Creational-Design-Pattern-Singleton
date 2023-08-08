public class SynchronizeSingleton {
    private static SynchronizeSingleton instance;
    private static int count = 1;
    private SynchronizeSingleton() {
    }
    public static synchronized SynchronizeSingleton getInstance(String Id){
        if (instance == null){
            instance = new SynchronizeSingleton();
            System.out.println("Created" + count++ + "\t From Thread " + Id);
        }
        return instance;
    }
}
