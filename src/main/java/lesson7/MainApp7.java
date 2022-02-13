package lesson7;

public class MainApp7 {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Barsik", 7, false);
        catArray[1] = new Cat("Rizhik",8, false);
        catArray[2] = new Cat("Snezhok",6, false);
        Plate plate = new Plate(20);



        plate.info();
        catArray[0].eat(plate);
        catArray[1].eat(plate);
        catArray[2].eat(plate);
        plate.info();

        plate.addFood(5);
        plate.info();

    }
}
