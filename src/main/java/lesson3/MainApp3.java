package lesson3;
import java.util.Arrays;

public class MainApp3 {

    public static void printArr(int[][] table) { //метод к заданию 4 (печать двухмерного массива взят в методичке)
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] newArray(int len, int initialValue) { //Метод к заданию 5
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static boolean dotArray(int [] arr5) { //Метод к заданию 7 (НЕ РАБОТАТ) - нужен разбор
        int sum1 = arr5[0];
        int sum2 = arr5[arr5.length-1];

        for (int i = 0; i < arr5.length; i ++){
            for (i = (arr5.length-1); i == 0; i --){
                if (sum1 != sum2) {
                    sum2 = sum2 + arr5[i];
                } else {
                    return true;
                }
            } if (sum1 != sum2) {
                sum1 = sum1 + arr5[i];
            } else {
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        int i; //индекс для одномерного массива
        int j; //индекс для вложенного массива
        int len; //переменная к заданию 5
        int initialValue;  //переменная к заданию 5
        int[] arr5 = {6, 17, 4, 3, 7, 15, 8}; //Массив к заданию 7

        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1};//Задание 1
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[100]; // Задание 2
        arr2[i] = 0;
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//Задание 3
        for (i = 0; i < arr3.length; i ++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        } System.out.println(Arrays.toString(arr3));

        int[][] table = new int[5][5];//Задание 4
        for (i = 0; i < 5; i ++) {
            for (j = 0; j <5; j ++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        } printArr(table);

        int [] array = newArray(7, 1); //Задание 5
        System.out.println(Arrays.toString(array));

        int[] arr4 = {7, 55, 16, 8, 98, 2, 9, 32, 4, 5}; //Задание 6
        int min = arr4[0];
        for (i = 1; i <arr4.length; i ++) {
            if (arr4[i] < min) {
                min = arr4[i];
            }
        } System.out.println(min);
        int max = arr4[0];
        for (i = 1; i < arr4.length; i ++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
        } System.out.println(max);

        System.out.println(dotArray(arr5)); //Задание 7 вывод в консоль

    }
}