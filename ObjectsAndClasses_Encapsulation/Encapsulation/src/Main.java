import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CargoInfo cargoInfo = new CargoInfo(new Dimensions(20,30,40), 1500, "Волгоград", false, "RUS456", true);
        System.out.println(cargoInfo);
        CargoInfo copy = cargoInfo.setCargo(new Dimensions(50,60,70), 2000, "Москва", true, "RUS789", false);
        System.out.println(copy);
    }
}