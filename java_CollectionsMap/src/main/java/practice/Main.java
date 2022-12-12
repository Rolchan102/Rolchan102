package practice;

public class Main {
    public static void main(String[] args) {
        PhoneBook.addContact("79001234567", "Маша");
        PhoneBook.addContact("79007654321", "Паша");
//        Set<String> expected = new TreeSet<>(List.of("Маша - 79001234567, 79007654321"));
//        assertEquals(expected, phoneBook.getAllContacts());
        System.out.println(PhoneBook.mapPhoneBook);
    }
}
