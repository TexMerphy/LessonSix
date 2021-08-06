package ru.geekbrains.lesson.six;

public class Cat extends Animal{
    private static final int RUN_LIM = 200;
    private static final int SWM_LIM = 0;

    public Cat() {
        super(RUN_LIM,SWM_LIM);
        catCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println("Кот бежит...");
        if (distance > RUN_LIM) {
            System.out.printf("Кот не пробежит больше %s",RUN_LIM);
        }
        System.out.println("Кот пробежал "+distance);

    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот плавать не умеет:)");
    }
}
