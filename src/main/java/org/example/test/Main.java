package org.example.test;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();

        Animal animal = new Cat("хвостик"); // создаем экземпляр класса, вначале пишем класс родителя а дальше конкретную реализацию
        // (можно объединять классы в коллекцию по признаку родителя но не видим метод конкретно кота)
        animal.voice();  // вызываем абстрактный метод

        ((Cat) animal).klubok();

        Animal[] catAndDog = {  // коллекция, массив разных объектов
                new Cat("kot1"),
                new Dog("dog1"),
                new Cat("kot2"),
                new Cat("kot3"),
        };

        for (Animal element : catAndDog) {
           //
            if (element instanceof Cat) {
                ((Cat) animal).klubok();
                element.voice();
            } else {
                element.voice();
            }
        }
    }

}