package com.company;

//-------------------------
    // ------------------------- Mubariz Khan P180010=====//

public class cat extends animal implements pet {
    private String name;

    cat()
    {
        super(4);
        this.name = "";
    }

    cat(String name)
    {
        super(4);
        this.name = name;
    }


    public String getName()
    {
        return this.name;
    }

    public void eat() {
        System.out.println("cat eats");
    }

    public void settName(String name)
    {
        this.name = name;
    }

    public void play()
    {
        System.out.println("Cat plays");
    }
}
