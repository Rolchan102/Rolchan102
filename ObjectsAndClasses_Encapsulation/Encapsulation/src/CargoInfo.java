public class CargoInfo {
    private final Dimensions dimensions;
    private final int weight; //�����
    private final String deliveryAddress; //����� ��������
    private final boolean PossibleFlip; //����� ��������������?
    private final String regNumber; //����� �����������
    private final boolean fragile; //�������?

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
        return "\n" + "�������� �������: " + dimensions +
                "\n" + "�����: " + weight + " ��." +
                "\n" + "����� ��������: " + deliveryAddress +
                "\n" + "����� ��������������? -  " + PossibleFlip +
                "\n" + "����� �����������: " + regNumber +
                "\n" + "�������? -  " + fragile;
    }
}
