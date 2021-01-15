package com.company;
//-------------------------
    // ------------------------- Mubariz Khan P180010=====//
public abstract class animal {
        protected int legs;

        animal(int legs)
        {
            this.legs = legs;
        }
    public abstract void eat();

        public void walk()
        {
            System.out.println(this.legs+" no. oflegs");
        }
}
