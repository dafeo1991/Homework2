package org.example.homework2;

public class Robot extends Participants {

    String model;

    public Robot(int run, int jamp, String name, String model) {
        super(run, jamp, name);
        this.model = model;
        if(run > 500){
            super.run = 500;
        }
        if(jamp > 9){
            super.run = 9;
        }
    }


}
