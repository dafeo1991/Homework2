package org.example.oop2;

public class HomeCat extends Cat{

    static  int countHomeCat;


    public HomeCat(int run, int swim, String name, String breedCat) {
        super(run, swim, name, breedCat);
        countHomeCat++;
    }





}
