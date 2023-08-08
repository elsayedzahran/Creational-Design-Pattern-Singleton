public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private static int count = 1;
    private EagerSingleton() {
    }
    public static EagerSingleton getInstance(String Id){
        return instance;
    }
}
