public class Main {

    public static void main(String[] args) {
        System.out.println();
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80,3, 960.5);
        vasyaBasket.add("Bread", 50,2, 500.75);
        vasyaBasket.print("������� ����");
        System.out.println();

        Basket mishaBasket = new Basket();
        mishaBasket.add("Bread", 50,1, 500.75);
        mishaBasket.add("Sausage", 300,1, 330.3);
        mishaBasket.add("Cheese", 130,2, 150.0);
        mishaBasket.print("������� ����");
        System.out.println();

        System.out.println("����: " +
                "\n" + "����� ��������� �������: " + Basket.getTotalCostForAllBaskets() + " ���.; " +
                "\n" + "����� ���������� �������: " + Basket.getTotalCountForAllBaskets() + " ��.; " +
                "\n" + "������� ��������� �������: " + Basket.getAverageCostForAllBaskets() + " ���.; " +
                "\n" + "������� ��������� �������: " + Basket.getAveragePriceForAllBaskets() + " ���.;");
    }
}