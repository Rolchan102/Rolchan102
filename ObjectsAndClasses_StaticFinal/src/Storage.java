public class Storage {
    private final StorageType storageType;
    private final int capacity;
    private final double weight;

    public Storage(StorageType storageType, int capacity, double weight) {
        this.storageType = storageType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public StorageType getStorageType() { return storageType;}

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public Storage setStorageType(StorageType storageType) {
        return new Storage(storageType, capacity, weight);
    }

    public Storage setCapacity (int capacity) {
        return new Storage(storageType, capacity, weight);
    }

    public Storage setWeight (double weight) {
        return new Storage(storageType, capacity, weight);
    }

    public String toString() {
        return "\n" + "Тип: " + storageType +
                "\n" + "Объём: " + capacity + " ГБ" +
                "\n" + "Вес: " + weight + " гр.";
    }
}
