import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CargoInfo cargoInfo = new CargoInfo(new Dimensions(20,30,40), 1500, "���������", false, "RUS456", true);
        System.out.println(cargoInfo);
        CargoInfo copy = cargoInfo.setCargo(new Dimensions(50,60,70), 2000, "������", true, "RUS789", false);
        System.out.println(copy);
    }
}