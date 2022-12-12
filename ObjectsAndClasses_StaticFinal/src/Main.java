public class Main {
    public static void main(String[] args) {
        Computer Computer = new Computer("DELL", "Vostro 3681",
                new Cpu(2.9, 6, "Intel", 36.0),
                new Ram("DDR4", 8, 28.0),
                new Storage(StorageType.SSD,256, 7.5),
                new Monitor(23.8, MonitorType.IPS, 3.6),
                new Keyboard("Мембранная", false, 503.0));
        System.out.println(Computer);

        Computer copy = new Computer("ASUS", "G15DK-R5800X278T",
                new Cpu(3.8, 8, "AMD", 39.0),
                new Ram("DDR4", 16, 58.0),
                new Storage(StorageType.HDD,1000, 85.0),
                new Monitor(27.0, MonitorType.IPS,5.6),
                new Keyboard("Механическая", true, 1200.0));
        System.out.println(copy);
    }
}
