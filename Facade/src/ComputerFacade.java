public class ComputerFacade {
    private static final long K_BOOT_ADDRESS = 0x1000;
    private static final long K_BOOT_SECTOR = 0x80;
    private static final int K_SECTOR_SIZE = 512;
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootSectorData = hardDrive.read(K_BOOT_SECTOR, K_SECTOR_SIZE);
        memory.load(K_BOOT_ADDRESS, bootSectorData);
        cpu.jump(K_BOOT_ADDRESS);
        cpu.execute();
        System.out.println("Computer booted");
    }
}
