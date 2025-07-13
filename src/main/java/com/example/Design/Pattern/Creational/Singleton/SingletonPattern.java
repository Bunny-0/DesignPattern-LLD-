package com.example.Design.Pattern.Creational.Singleton;

class SingletonPattern {

    private static SingletonPattern obj=null;
    private SingletonPattern(){

    }

    static SingletonPattern getObj(){

        if(obj==null){

            synchronized (SingletonPattern.class)
            {
                if(obj==null)
                {
                    obj=new SingletonPattern();
                }
            }

        }
        return obj;
    }


}
