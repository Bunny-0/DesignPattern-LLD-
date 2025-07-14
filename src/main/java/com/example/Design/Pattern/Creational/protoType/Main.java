package com.example.Design.Pattern.Creational.protoType;

public class Main {



    public static void main(String args[]){

        UserEntity user=new UserEntity("shubham","gaurav","shubhamgauarv2@","8917466543","kolkata");

        UserEntity user2=user.clone();
        System.out.println(user.toString() +" "+user2.toString());
    }
}
