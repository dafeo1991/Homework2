package org.example.oop2;

public class Tiger extends Cat{

    static int countTiger;



    public Tiger(int run, int swim, String name, String breedCat) {
        super(run, swim, name, breedCat);
        countTiger++;
    }
}
