public class BestPracticeSingleton {
    private static BestPracticeSingleton instance;
    private static int count = 1;
    private BestPracticeSingleton() {
    }
    public static BestPracticeSingleton getInstance(String Id){
        if (instance == null){
            synchronized (BestPracticeSingleton.class){
                if (instance == null){
                    instance = new BestPracticeSingleton();
                    System.out.println("Created" + count++ + "\t From Thread " + Id);
                }
            }
        }
        return instance;
    }
}
