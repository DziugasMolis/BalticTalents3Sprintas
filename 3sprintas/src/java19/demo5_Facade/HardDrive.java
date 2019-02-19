package java19.demo5_Facade;

public class HardDrive {

    public byte[] read(long lba, int size) {
        //do something to read data from hd
        System.out.println("HardDrive read " + size + " bytes from " + lba);
        return null;
    }
}
