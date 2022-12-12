public class Keyboard {
    private final String keyType;
    private final boolean illuminated;
    private final double weight;

    public Keyboard(String keyType, boolean illuminated, double weight) {
        this.keyType = keyType;
        this.illuminated = illuminated;
        this.weight = weight;
    }

    public String getKeyType() {
        return keyType;
    }

    public boolean isIlluminated() {
        return illuminated;
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setKeyType(String keyType) {
        return new Keyboard(keyType, illuminated, weight);
    }

    public Keyboard setIlluminated(boolean illuminated) {
        return new Keyboard(keyType, illuminated, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(keyType, illuminated, weight);
    }

    public String toString() {
        return "\n" + "Тип: " + keyType +
                "\n" + "Наличие подсветки: " + illuminated +
                "\n" + "Вес: " + weight + " гр.";
    }
}
