public class SingletonDriver {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        if (s1 == s2) {
            System.out.println("Both references point to the same Singleton instance");
        } else {
            System.out.println("Different instances exist — not a Singleton");
        }
    }
}