package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.print("Введите команду: ");
            String text = scanner.nextLine();
            String[] input = text.split("\\s+");
            String command = input[0];
            int index = 0;

            if (command.equals("ADD")) {
                todoList.add(0, text);
            } else if (command.equals("EDIT")) {
                todoList.edit(0, text);
        } else if (command.equals("DELETE")) {
                todoList.delete(0);
            } else if (command.equals("LIST")) {
            System.out.println(todoList.getTodos());

        } else if (command.equals("0")) {
            break;

        } else{
            System.out.println("Неверная команда");
        }
    }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
