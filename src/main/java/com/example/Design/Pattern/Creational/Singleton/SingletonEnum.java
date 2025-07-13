package com.example.Design.Pattern.Creational.Singleton;

public enum SingletonEnum {

    INSTANCE;

    String data;

    SingletonEnum() {
       data="inside connection url";
    }

   public SingletonEnum getInstance(){
       return INSTANCE;
   }

   public String getData(){
       return data;
   }


}
