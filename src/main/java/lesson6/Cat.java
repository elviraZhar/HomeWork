package lesson6;

public class Cat extends Animal {

    public Cat (String name, int catRun, int catSwim) {
        super(name, catRun, catSwim);
    }

    public void animalInfo () {
        System.out.println("Кошка " + name);
    }

    public void run (int distance_r) {
        System.out.println("Кошка пробежала " + distance_r + " метров");
    }

    public final void swim (int distance_s) {
        System.out.println("Кошка не плавает");
    }

}
