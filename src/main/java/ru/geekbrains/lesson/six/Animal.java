package ru.geekbrains.lesson.six;

public abstract class Animal {
    private int runLimit;
    private int swimLimit;

    public static int animalCount;
    public static int dogCount;
    public static int catCount;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
