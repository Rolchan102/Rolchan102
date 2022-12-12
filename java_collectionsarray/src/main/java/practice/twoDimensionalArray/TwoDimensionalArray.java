package practice.twoDimensionalArray;

public class TwoDimensionalArray {
    public static char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] cross = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cross[i][j] = (j == i || j == size - 1 - i) ? SYMBOL : ' ';
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
        return cross;
    }
}
//TODO: Написать метод, который создаст двумерный массив char заданного размера.
// массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
// [X,  , X]
// [ , X,  ]
// [X,  , X]