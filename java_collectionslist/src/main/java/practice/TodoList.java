package practice;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> list = new ArrayList<>();

    public void add(String todo) {

        list.add(todo);
        System.out.println("Дело добавлено \"" + todo + "\"");
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index > 0 && index < list.size()) {
            list.add(index, todo);
        } else {
            list.add(todo);
        }
        System.out.println("Дело добавлено \"" + todo + "\"");
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index < list.size() && index >0) {
            list.set(index, todo);
            System.out.println("Дело \"" + todo +
                    "\" заменено на \"" + todo + "\"");
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index < list.size() && index > 0) {
            list.remove(index);
            System.out.println("Дело \"" + index + "\" удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return list;
    }
}