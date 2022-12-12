package practice;

import java.util.*;

public class PhoneBook {
    static Map<String, String> mapPhoneBook = new TreeMap<>();

    public static void addContact(String phone, String name) {

        if (phone.matches("[\\d]{11}") && name.matches("[А-Яа-я]+")) {
            if (mapPhoneBook.containsKey(phone)) {
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
            } else {
                mapPhoneBook.put(phone, name);
            }
        }
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {
        if (mapPhoneBook.containsKey(phone)) {
            return mapPhoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
    }

    public Set<String> getContactByName(String name) {

        Set<String> setPhoneBook = new TreeSet<>();
        String namePlusTel = "";
        if (mapPhoneBook.containsValue(name)) {
            namePlusTel = namePlusTel.concat(name) + " - ";
            for (String tel : mapPhoneBook.keySet()) {
                if (mapPhoneBook.get(tel).equals(name)) {
                    namePlusTel = namePlusTel.concat(tel) + ", ";
                }
            }
            setPhoneBook.add(namePlusTel.substring(0, namePlusTel.length() - 2));
            return setPhoneBook;
        } else {
            return new TreeSet<>();
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
    }

    public Set<String> getAllContacts() {

        Set<String> setPhoneBook = new TreeSet<>();

        for (String key : mapPhoneBook.keySet()) {
            setPhoneBook.add(mapPhoneBook.get(key) + " - " + key);
        }
        return setPhoneBook;
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
    }

    public Set<String> getSetFromMap(Map<String, String> phoneToName) {

        Map<String, TreeSet<String>> nameToPhones = new HashMap<>();
        for (String key : phoneToName.keySet()) {
            String name = phoneToName.get(key);
            if (!nameToPhones.containsKey(name)) {
                nameToPhones.put(name, new TreeSet<>());
            }
            nameToPhones.get(name).add(key);
        }

        Set<String> result = new HashSet<>();
        for (String key : nameToPhones.keySet()) {
            String resultString = key + " - " + nameToPhones.get(key);
            result.add(resultString.replaceAll("[\\[\\]]",""));
        }

        return result;
    }
}