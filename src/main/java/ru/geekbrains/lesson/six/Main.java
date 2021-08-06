package ru.geekbrains.lesson.six;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(75);
            animals[i].swim(6);
        }
        System.out.println("Всего животных - " + Animal.animalCount);
        System.out.println("Из них котов - " + Animal.catCount);
        System.out.println("Из них собак - " + Animal.dogCount);
    }
}
