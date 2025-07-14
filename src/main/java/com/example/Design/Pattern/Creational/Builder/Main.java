package com.example.Design.Pattern.Creational.Builder;

public class Main {

    public static void main(String args[]){

        User user=new User.Builder("shubham","gaurav").address("koderma").email("shubham@gmail.com").build();
        User user2=new User.Builder("shubham2","gaurav2").address("koderma").email("shubham@gmail.com").build();
        System.out.println(user.hashCode() +" "+user2.hashCode());
    }
}
