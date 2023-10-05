package org.example.oop2;

public class Cat extends Animal {

    static  int countCat;
    String breedCat;

    public Cat(int run, int swim, String name, String breedCat) {
        super(run, swim, name);
        this.breedCat = breedCat;
        countCat++;
    }

    // переопределяем два метода
    @Override
    void running(int runDistans) {

        if(runDistans < run){
            System.out.println(name + " пробежал " + runDistans + " метров");
        } else {
            System.out.println(name + " умер");
        }

    }

    @Override
    void swimming(int swimDistans) {
        System.out.println(name + " утонул");

    }
}
