package practice;

import practice.EmailList;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("Выберите команду: "
                    + "\n ADD - проверяет и, если формат адреса верный, добавляет в множество."
                    + "\n LIST - печатать весь список");

            String input = scanner.nextLine();

            switch (input) {
                case "0":
                    break label;

                case "ADD":
                    System.out.println();
                    String email = scanner.nextLine();
                    emailList.add(email);
                    break;

                case "LIST":
                    emailList.getSortedEmails();

                    break;
                default:
                    System.out.println();
                    break;
            }
            
            //TODO: write code here
            
        }
    }
}
