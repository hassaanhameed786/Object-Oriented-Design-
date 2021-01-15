package com.company;

//-------------------------
    // ------------------------- Mubariz Khan P180010=====//
public class Test {
    public void run()
    {
        spider s = new spider();
        s.eat();

        fish d = new fish();
        cat c = new cat("fluffy");
        animal a = new fish();
        animal e = new spider();
        pet p = new cat();

        d.settName("MyFish");
        d.eat();
        System.out.println(d.getName());
        d.walk();

        c.eat();
        System.out.println(c.getName());
        c.walk();
    }
}
