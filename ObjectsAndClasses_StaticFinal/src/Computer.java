public class Computer {
    private final String vendor;
    private final String name;
    private Cpu cpu;
    private Ram ram;
    private Storage storage;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(String vendor, String name,
                    Cpu cpu, Ram ram, Storage storage,
                    Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setCpu(Cpu cpu) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setRam(Ram ram) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setStorage(Storage storage) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, storage, monitor, keyboard);
    }

    public String toString() {
        return "\n" + "Производитель: " + vendor +
                "\n" + "Название: " + name + "\n" +
                "\n" + "Процессор: " + cpu + "\n" +
                "\n" + "Оперативная память: " + ram + "\n" +
                "\n" + "Накопитель информации: " + storage + "\n" +
                "\n" + "Монитор: " + monitor + "\n" +
                "\n" + "Клавиатура: " + keyboard;
    }
}
