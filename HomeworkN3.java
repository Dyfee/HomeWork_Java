/**
* Java 1. Homework №3
* @author Александрова Мария
* @version 15.02.2022
*/

import java.util.Arrays;

class HomeworkN3{
    public static void main(String[] args) {
        changeArray();
        fillArray();
        multiplyArray();
        fillDiagonal();
        System.out.println(Arrays.toString(createArray()));
        findMinMax();
    }
    
    static void changeArray() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
        
    static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *=2;
            }
        }    
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiagonal() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i == j || j == (matrix.length - i - 1)? 1 : 0;
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }
    
    static int[] createArray() {
        int[] len = new int[4];
        int[] initialValue = {1, 2, 3, 4, 5, 6, 7};
        return Arrays.copyOf(initialValue, 4);
    }
    
    static void findMinMax() {
        int[] arr = {55, 16, 25, 60, 3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
    }
}
