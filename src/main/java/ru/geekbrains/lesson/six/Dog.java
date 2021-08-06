package ru.geekbrains.lesson.six;

public class Dog extends Animal{
    private static final int RUN_LIM = 500;
    private static final int SWM_LIM = 10;

    public Dog() {
        super(RUN_LIM, SWM_LIM);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println("Пёс бежит...");
        if (distance > RUN_LIM) {
            System.out.printf("Пёс не пробежит больше %s",RUN_LIM);
        }
        System.out.println("Пёс пробежал "+distance);
    }


    @Override
    public void swim(int distance) {
        System.out.println("Пёс плывёт...");
        if (distance > SWM_LIM) {
            System.out.printf("Пёс не проплывёт больше %s",SWM_LIM);
        }
        System.out.println("Пёс проплыл "+distance);
    }
}
