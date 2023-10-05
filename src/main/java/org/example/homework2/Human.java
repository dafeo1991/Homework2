package org.example.homework2;

public class Human extends Animated{

    String nationality;

    public Human(int run, int jamp, String name, String view, String nationality) {
        super(run, jamp, name, view);
        this.nationality = nationality;
    }
}
