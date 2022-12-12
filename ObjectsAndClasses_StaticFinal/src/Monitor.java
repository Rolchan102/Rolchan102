public class Monitor {
    private final double screenSize;
    private final MonitorType monitorType;
    private final double weight;

    public Monitor(double screenSize, MonitorType monitorType, double weight) {
        this.screenSize = screenSize;
        this.monitorType = monitorType;
        this.weight = weight;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public MonitorType getMonitorType() { return monitorType; }

    public double getWeight() {
        return weight;
    }

    public Monitor setScreenSize(double screenSize) {
        return new Monitor(screenSize, monitorType, weight);
    }

    public Monitor setMonitorType(MonitorType monitorType) {
        return new Monitor(screenSize, monitorType, weight);
    }

    public Monitor setWeight(double weight) {
        return new Monitor(screenSize, monitorType, weight);
    }

    public String toString() {
        return "\n" + "Диагональ: " + screenSize + " дюймов" +
                "\n" + "Тип: " + monitorType +
                "\n" + "Вес: " + weight + " кг.";
    }
}
