public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Dimensions setDimensions(int width, int height, int length) {
        return new Dimensions(width, height, length);
    }
    public String toString() {
        return width + "см. * " +
                height + "см. * " +
                length + "см." + "\n" +
                "Объём груза: " + width * height * length + " куб. см.";
    }
}