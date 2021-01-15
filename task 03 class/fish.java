package com.company;

//-------------------------
    // ------------------------- Mubariz Khan P180010=====//


public class fish extends animal implements pet  {

    public fish() {
        super(0);
    }

    private String name;

    @Override
    public void eat() {
        System.out.println("fish eats");
    }

    @Override
    public void walk() {
        System.out.println("Fish dont walk");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void settName(String ss) {
        this.name =ss;
    }

    @Override
    public void play() {
        System.out.println("Fish plays");
    }
}
