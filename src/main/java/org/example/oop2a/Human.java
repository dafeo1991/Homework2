package org.example.oop2a;

public class Human {

    // Создать класс человек с возможностью ездить и останавливаться на: машине, скейтборде,велосипеде(что будет если расширить список ?).

    // без интерфейса

  //  private Car lastcar; // создаем машину у человека

 //   private Skatebord skatebord;



    /*
    public void drive(Car car){
        if(lastcar == null) {   // если у нет машины
            this.lastcar = car;
            lastcar.run(); // машина едет
        } else {
            System.out.println("Уже двигаемся");
        }

    }

    public void stop(Car car){
        if (lastcar!= null) {
            lastcar.stop(); // машина останавливается
            lastcar = null;
        } else {
            System.out.println("Уже стоим");
        }
    }

    */

    // с интерфейсом

    private TransportMove lastTransport; // добавляем интерфейс, св-во, не нужно добавлять все транспорты

    public void drive(TransportMove transportMove){
        if(lastTransport == null) {   // если у нет машины
            lastTransport = transportMove;   // сохраняем ссылку на элемент
            lastTransport.start(); // машина едет, выводим сообщение

        } else {
            System.out.println("Уже двигаемся");
        }
    }

    public void stop(TransportMove transportMove){
        if (lastTransport!= null) {
            lastTransport.stop(); // машина останавливается
            lastTransport = null;// если нужно остановиться то ссылку теряем
        } else {
            System.out.println("Уже стоим");
        }
    }


}

