package java19.demo5_Facade;

public class ComputerFacade {

    static final int BOOT_ADDRESS = 0x1000;
    static final int BOOT_SECTOR = 0x100;
    static final int SECTOR_SIZE = 1024;

    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        System.out.println("Booting...");
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
        System.out.println("Started!");
    }

}
