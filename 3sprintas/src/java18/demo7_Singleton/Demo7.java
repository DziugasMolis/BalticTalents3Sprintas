package java18.demo7_Singleton;

public class Demo7 {

    public static void main(String[] args) {

        ISingleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getNumber());

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ISingleton singleton2 = Singleton.getInstance();
            System.out.println(singleton2.getNumber());

        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ISingleton singleton2 = Singleton.getInstance();
            System.out.println(singleton2.getNumber());

        }).start();

        printSingletonValue(Singleton.getInstance());
        printSingletonValue(new DummySingleton());

    }

    static void printSingletonValue(ISingleton singleton) {
        System.out.println(singleton.getNumber());
    }
}
