package org.example.oop2;

public abstract class Animal {  // делаем класс абстрактным

    int run;  // максимальный бег, ограничение
    int swim;  // максимальное плавание, ограничение

    String name;

    public static int count;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    // при вызове каждый раз родительского конструктора животное +1

    public Animal(int run, int swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
        count++;
        //System.out.println(count);
    }



    public Animal() {
    }

    abstract void running (int runDistans); // передаем величину которую надо пробежать
    abstract void swimming (int swimDistans); // передаем величину которую надо проплыть


}
