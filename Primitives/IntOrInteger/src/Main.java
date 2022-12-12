public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        System.out.println();

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (char a = 'Ё'; a <= 'ё'; a++) {
            if ((a > 'Ё' && a < 'А') || (a > 'я' && a < 'ё')) {
                continue;
            }
            System.out.println(a + " — " + "(" + ((int) a) + ")");
        }
        }
    }