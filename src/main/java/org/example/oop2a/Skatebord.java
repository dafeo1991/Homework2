package org.example.oop2a;

public class Skatebord implements TransportMove {


    @Override
    public void start() {
        System.out.println(" скейтборд едет ");
    }

    @Override
    public void stop() {

        System.out.println(" скейтборд остановился ");
    }
}
