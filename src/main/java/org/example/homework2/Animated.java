package org.example.homework2;

public class Animated extends  Participants{

    String view;

    public Animated(int run, int jamp, String name, String view) {
        super(run, jamp, name);
        this.view = view;
        if(run > 300){
            super.run = 300;
        }
        if(jamp > 3){
            super.run = 3;
        }
    }


}
