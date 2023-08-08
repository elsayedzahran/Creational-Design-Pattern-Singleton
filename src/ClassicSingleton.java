public class ClassicSingleton {
    private static ClassicSingleton instance;
    private static int count = 1;
    private ClassicSingleton() {
    }
    public static ClassicSingleton getInstance(String Id){
        if (instance == null){
            instance = new ClassicSingleton();
            System.out.println("Created" + count++ + "\t From Thread " + Id);
        }
        return instance;
    }
}
