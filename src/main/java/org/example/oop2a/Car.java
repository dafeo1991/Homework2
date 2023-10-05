package org.example.oop2a;

public class Car implements TransportMove {



    @Override
    public void start() {

        System.out.println(" машина едет ");

    }
    @Override
    public void stop() {

        System.out.println(" машина остановилась ");
    }
}
