package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер для поиска в формате, например А111ВС197: ");
        String number = scanner.nextLine();
        List<String> strings = CoolNumbers.generateCoolNumbers();
        HashSet<String> coolNumbersHashSet = new HashSet<>(strings);
        TreeSet<String> coolNumbersTreeSet = new TreeSet<>(strings);

        CoolNumbers.bruteForceSearchInList(CoolNumbers.generateCoolNumbers(), number);
        Collections.sort(strings);
        CoolNumbers.binarySearchInList(strings, number);
        CoolNumbers.searchInHashSet(coolNumbersHashSet, number);
        CoolNumbers.searchInTreeSet(coolNumbersTreeSet, number);
    }
}
/*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */