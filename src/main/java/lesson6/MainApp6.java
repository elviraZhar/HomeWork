package lesson6;

public class MainApp6 {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", 200, 0);
        Dog dog = new Dog("Бакс", 500, 10);

        int distance_r;
        int distance_s;

        cat.animalInfo();
        dog.animalInfo();
        cat.run(150);
        dog.run(300);
        dog.swim(5);
        cat.swim(0);
        

    }

}
