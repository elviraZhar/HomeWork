package lesson6;

public abstract class Animal {
    String name;
    int animalRun;
    int animalSwim;

    public Animal (String name, int animalRun, int animalSwim, int count) {
        this.name = name;
        this.animalRun = animalRun;
        this.animalSwim = animalSwim;
    }

    public Animal(String name, int catRun, int catSwim) {
    }


    public void animalInfo () {
        System.out.println("Животное " + name);
    }

    public void run (int distance_r) {
        if (distance_r <= animalRun) {
        System.out.println("Животное пробежало " + distance_r + " метров");
        }
    }

    public void swim (int distance_s) {
        if (distance_s <= animalSwim){
        System.out.println("Животное проплыло " + distance_s + " метров");
        }
    }


}


