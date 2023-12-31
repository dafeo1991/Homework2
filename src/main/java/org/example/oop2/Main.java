package org.example.oop2;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
         *
         * l Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
         *
         * l У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
         *
         * l Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
         *
         * l Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
         *
         * l Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
         */
        Animal[] animalsList = {
                new Dog(120, 12, "Шарик", "дворовая"),  // передаем сколько может пробежать или проплыть животное
                new HomeCat(15, 0, "Барсик", "британский"),
                new Tiger(30, 5, "Тигра", "амурский"),
                new Cat(500, 1, "Кот", "обычный")
        };       // объект, создаем экземпляры классов (ссылки на объекты)

        // пройти по списку и заставить животных бегать

        for (Animal animal : animalsList) {  // вспомог констр iter , к каждому животному обращаемся как animal
            animal.running(100);  // передаем значение сколько должен пробежать
            animal.swimming(10);

        }



    }
}
