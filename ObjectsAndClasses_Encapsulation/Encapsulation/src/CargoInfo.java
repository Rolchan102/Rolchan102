public class CargoInfo {
    private final Dimensions dimensions;
    private final int weight; //Масса
    private final String deliveryAddress; //Адрес доставки
    private final boolean PossibleFlip; //Можно переворачивать?
    private final String regNumber; //Номер регистрации
    private final boolean fragile; //Хрупкая?

    public CargoInfo(Dimensions dimensions, int weight, String deliveryAddress, boolean possibleFlip,
                     String regNumber, boolean fragile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.PossibleFlip = possibleFlip;
        this.regNumber = regNumber;
        this.fragile = fragile;
        this.dimensions = dimensions;
    }

    public CargoInfo setCargo(Dimensions dimensions, int weight, String deliveryAddress, boolean possibleFlip,
                              String regNumber, boolean fragile) {
        return new CargoInfo(dimensions, weight, deliveryAddress, possibleFlip, regNumber, fragile);
    }

    public Dimensions getDimensions() { return dimensions; }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isPossibleFlip() {
        return PossibleFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return "\n" + "Габариты посылки: " + dimensions +
                "\n" + "Масса: " + weight + " кг." +
                "\n" + "Адрес доставки: " + deliveryAddress +
                "\n" + "Можно переворачивать? -  " + PossibleFlip +
                "\n" + "Номер регистрации: " + regNumber +
                "\n" + "Хрупкая? -  " + fragile;
    }
}
