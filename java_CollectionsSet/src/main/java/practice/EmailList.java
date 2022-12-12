package practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> address = new TreeSet<>();

    public void add(String email) {
        String ePattern = "[\\w|\\d]+@.+\\.\\w{2,}";
        Pattern pattern = Pattern.compile(ePattern);
        Matcher matcher = pattern.matcher(email);
        if (!address.contains(email) && matcher.find()) {
            address.add(email.toLowerCase());
        } else {
            System.out.println("Неверный формат email");
        }
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
    }

    public List<String> getSortedEmails() {
        for (String list : address) {
            System.out.println(list);
        }
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(address);
    }

}
