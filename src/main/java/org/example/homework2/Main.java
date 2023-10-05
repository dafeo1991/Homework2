package org.example.homework2;

public class Main {
    public static void main(String[] args) {

        int maxRun = 0;
        int maxHeight = 0;


        Participants[] participantsList = {
                new Robot(450, 9, "Робокоп", "F-213" ),
                new Robot(400, 5, "Терминатор", "Q-4" ),
                new Human(400, 8, "Джордж", "человек", "американец" ),
                new Cat(100, 3, "Барсик", "кошачьи", "абританский" )
        };

        Object[] objects  = {
                new Treadmill(300),
                new Treadmill(100),
                new Treadmill(300),
                new Treadmill(400),
                new Treadmill(50),
                new Treadmill(10),
                new Wall(1),
                new Wall(2),
                new Wall(5),
                new Wall(7),
                new Wall(4),
                new Wall(8)
        };


        for (Participants participant : participantsList) {



            if (participant instanceof Cat) {

                maxRun = 300;
                maxHeight = 3;
            }
            if (participant instanceof Human) {

                maxRun = 300;
                maxHeight = 3;
            }
            if (participant instanceof Robot) {

                maxRun = 500;
                maxHeight = 9;
            }

            boolean failure = false;

            for (int i = 0; i < objects.length; i++) {

                if (objects[i] instanceof Treadmill) {

                  int tRun = ((Treadmill) (objects[i])).getRunLong();

                    if (tRun > maxRun) {
                        System.out.println("Участник сошел с дистанции");
                        failure = true;
                        break;
                    }
                }
                if (objects[i] instanceof Wall) {


                   int tHeight = ((Wall) (objects[i])).getWallHeight();

                    if (tHeight > maxHeight) {
                        System.out.println("Участник сошел с дистанции");
                        failure = true;
                        break;
                    }

                }
            }

            if (!failure) {
                System.out.println("Участник прошел все испытания");
            }


        }

        
    }
}
