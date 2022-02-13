package lesson7;

public class Cat extends Animal {
    private static int count = 0;
    private final int RUN_DISTANCE = 200;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        super(name);
        this.appetite = appetite;
        this.satiety = false;
        count++;
    }

    public void eat(Plate p){
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " поел");
        } else {
            System.out.println("Кот " + name + " не поел");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_DISTANCE) {
            System.out.printf("Кот пробежал %d метров%n", distance);
        } else {
            System.out.printf("Кощка не может пробежать %d метров%n", distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот не умеет плавать%n");
    }

    public static int getCount() {
        return count;
    }
}
