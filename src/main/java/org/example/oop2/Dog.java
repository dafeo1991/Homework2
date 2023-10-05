package org.example.oop2;

public class Dog extends Animal{

    String breed;
    static int countDog;

    public Dog(int run, int swim, String name, String breed) {
        super(run, swim, name);
        this.breed = breed;
        countDog++;

        if(run > 500){
            super.run = 500;
        }
        if(swim > 500){
            super.swim = 500;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    void running(int runDistans) {  // проверяет то сколько текущая собака бегает и какую дистанцию ей передали
        if(runDistans < run){
            System.out.println(name + " пробежал " + runDistans + " метров");
        } else {
            System.out.println(name + " умер");
        }
    }

    @Override
    void swimming(int swimDistans) {
        if(swimDistans < swim){
            System.out.println(name + " проплыл " + swimDistans + " метров");
        } else {
            System.out.println(name + " умер");
        }
    }
}
