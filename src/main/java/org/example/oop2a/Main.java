package org.example.oop2a;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();// нужно создать экземпляр человека
        Car car = new Car(); // создаем машину

        human.drive(car); // человек ездит на машине
        human.drive(car);
        human.stop(car);
        human.stop(car);
        human.drive(new Skatebord());
        Bysikle b = new Bysikle(); // внедряем класс который не описан

    }


}
