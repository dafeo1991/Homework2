package org.example.test;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println(" гав ! гав !");
    }

    public Dog(String name) {
        super(name);
    }
}
