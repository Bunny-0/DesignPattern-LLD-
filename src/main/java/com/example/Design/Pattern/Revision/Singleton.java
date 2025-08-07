package com.example.Design.Pattern.Revision;

public class Singleton {

    Singleton instance;

    Singleton(){
      System.out.println("Inside Singleton Constructor");
    }

    public Singleton getInstance(){
        return this.instance;
    }
}
