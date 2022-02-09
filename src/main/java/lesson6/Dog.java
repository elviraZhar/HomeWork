package lesson6;

public class Dog extends Animal{
    int distanse_s;

    public Dog (String name, int dogRun, int dogSwim) {
        super(name, dogRun, dogSwim);
    }
    public void animalInfo () {
        System.out.println("Сабака " + name);
    }

    public void run (int distance_r) {
        System.out.println("Сабака пробежала " + distance_r + " метров");
    }

    public void swim (int distanse_s) {
        System.out.println("Сабака проплыла " + distanse_s + " метров");
    }

}
