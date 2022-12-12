public class Cpu {
    private final double frequency;
    private final int cpuCores;
    private final String manufacturer;
    private final double weight;

    public Cpu(double frequency, int cpuCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cpuCores = cpuCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumOfCore() {
        return cpuCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public Cpu setFrequency(double frequency) {
        return new Cpu(frequency, cpuCores, manufacturer, weight);
    }

    public Cpu setCpuCores(int cpuCores) {
        return new Cpu(frequency, cpuCores, manufacturer, weight);
    }

    public Cpu setManufacturer(String manufacturer) {
        return new Cpu(frequency, cpuCores, manufacturer, weight);
    }

    public Cpu setWeight(double weight) {
        return new Cpu(frequency, cpuCores, manufacturer, weight);
    }

    public String toString() {
        return "\n" +"Частота: " + frequency + " ГГц" +
                "\n" +"Количество ядер: " + cpuCores +
                "\n" +"Производитель: " + manufacturer +
                "\n" +"Вес: " + weight + " гр.";
    }
}
