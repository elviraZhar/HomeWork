package lesson2;

public class MainApp {
    public static boolean rangeInt(int a,int b) {
        if ((a + b) >= 10 && (a + b) <=20) {
            return true;
        } else {
            return false;
        }
    }
    public static void viewInt(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean viewIntBool(int a) {
        if (a >= 0) {
            return false;
        } else {
           return true;
        }
    }
    public static void printText(String s, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(s);
        }
    }
    public static boolean leapYeur(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
            System.out.println(rangeInt(4, 10));
            viewInt(17);
            System.out.println(viewIntBool(-9));
            printText("Hallo", 4);
            System.out.println(leapYeur(160));
    }


}
