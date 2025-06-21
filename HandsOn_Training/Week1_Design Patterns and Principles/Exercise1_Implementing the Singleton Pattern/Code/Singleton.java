public class Singleton {
    private static Singleton singleInstance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }
}
