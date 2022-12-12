public class Ram {
    private final String ramType;
    private final int capacity;
    private final double weight;

    public Ram(String ramType, int capacity, double weight) {
        this.ramType = ramType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getRamType() {
        return ramType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public Ram setRamType (String ramType) {
        return new Ram(ramType, capacity, weight);
    }

    public Ram setCapacity (int capacity) {
        return new Ram(ramType, capacity, weight);
    }

    public Ram setWeight (double weight) {
        return new Ram(ramType, capacity, weight);
    }

    public String toString() {
        return "\n" + "Тип: " + ramType +
                "\n" + "Объём: " + capacity + " ГБ" +
                "\n" + "Вес: " + weight + " гр.";
    }
}
