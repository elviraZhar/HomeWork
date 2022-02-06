package lesson4;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;
import java.util.Scanner;

public class MainApp4 {
    public static char [][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void initMap() { //Заполнение массива
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i ++) {
            for (int j = 0; j < SIZE; j ++ ) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap () { //Метод для печати массива
        for (int i = 0; i <= SIZE; i ++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i ++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j ++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) { //Метод проверки пустая ли клетка
        if(x< 0||x>=SIZE||y<  0||y>=SIZE){
            return false;
        }
        if(map[y][x]==DOT_EMPTY){
            return true;
        }
        return false;
    }

    public static void humanTurn() { //Ход игрока
        int x,y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() -1;
            y = scanner.nextInt() -1;
        } while (!isCellValid(x, y));
        map [y][x] = DOT_X;
    }

    public static void aiTurn() { //Ход игрока
        int x,y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +1));
        map [y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) { //Проверка победы прямые
        boolean line, colomn, diagonal1, diagonal2;
        line = true;
        colomn = true;
        diagonal1 = true;
        diagonal2 = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                line = line & (map[i][j] == symb);
                colomn = colomn & (map[j][i] == symb);
                diagonal1 = diagonal1 & (map[i][j] == symb);
                diagonal2 = diagonal2 & (map[i][SIZE - j - 1] == symb);
            }
            if ((diagonal1 || diagonal2 || line || colomn) == true) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i ++) {
            for (int j = 0; j < SIZE; j ++) {
               if (map[i][j] == DOT_EMPTY) {
                   return false;
               }
            }
        }
        return true;
    }


    public static void main(String[] args){
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена.");
    }

}
