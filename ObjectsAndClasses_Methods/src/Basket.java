public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int basketCount = 0;
    private static int totalCount;
    private static int totalCost;
    private static int averageCost;
    private static int averagePrice;

    public Basket() {
        increaseCount(1);
        items = "������ �������:";
        this.limit = 1000000;
        increaseBasketCount(1);
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int limit, int totalPrice, int totalWeight) {
        this();
        this.items = this.items + items;
        this.limit = limit;
        this.totalPrice = this.totalPrice + totalPrice;
        this.totalWeight = this.totalWeight + totalWeight;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    private static void increaseBasketCount(int basketCount) {
        Basket.basketCount += basketCount;
    }

    public void add(String name, int price, double weight, int count) {
        add(name, price, 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
    }

        items = items + "\n" + name + " - " + count + " ��. - "
                + "��������� ������: " + price + " ���. - "
                + "��� ������: " + weight + " ��.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        totalCount += count;
        totalCost += price * count;
        averageCost = totalCost / totalCount;
        averagePrice = totalCost / Basket.basketCount;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public static int getTotalCountForAllBaskets() { return totalCount; }

    public static int getTotalCostForAllBaskets() { return totalCost; }

    public static int getAverageCostForAllBaskets() { return averageCost; }

    public static int getAveragePriceForAllBaskets() { return averagePrice; }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("������� �����");
        } else {
            System.out.println(items);
            System.out.println("����� ��������� ������� � �������: " + totalPrice + " ���.;");
            System.out.println("����� ��� ������� � �������: " + totalWeight + " ��.;");
        }
    }
}