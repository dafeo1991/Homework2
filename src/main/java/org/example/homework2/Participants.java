package org.example.homework2;


public abstract class Participants {

    int run;
    int jamp;
    String name;

    public Participants(int run, int jamp, String name) {
        this.run = run;
        this.jamp = jamp;
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
