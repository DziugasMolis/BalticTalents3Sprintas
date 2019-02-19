package java19.demo5_Facade;

public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory load to " + position);
    }

}
