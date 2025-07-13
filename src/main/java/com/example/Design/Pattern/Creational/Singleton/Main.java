package com.example.Design.Pattern.Creational.Singleton;

public class Main {

    public static void main(String args[]){

        SingletonPattern pat=SingletonPattern.getObj();
        SingletonPattern pat1=SingletonPattern.getObj();
        System.out.println(pat.hashCode()+" "+pat1.hashCode());
        SingletonEnum oj1=SingletonEnum.INSTANCE;
        System.out.println(oj1.getData() + " " + oj1.getInstance().hashCode());
        SingletonEnum oj2=SingletonEnum.INSTANCE;
        System.out.println(oj2.getData() + " " + oj2.getInstance().hashCode());

    }
}
