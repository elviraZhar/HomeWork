package ru.geekbrains.lesson1;

public class MainApp {
    public static void printThreeWords() {
        System.out.println("Orang");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void chekSumSign() {
        int a = 3;
        int b = -4;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor(){
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 65;
        int b = 112;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }
}
