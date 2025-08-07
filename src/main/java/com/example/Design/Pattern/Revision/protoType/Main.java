package com.example.Design.Pattern.Revision.protoType;

public class Main {

    public static void main(String args[]){

        ProtoType protoType=new ProtoType("shubham","gaurav","shubhamgauarv2@",1,"kolkata");
        ProtoType protoType2=protoType.clone();
        System.out.println(protoType.toString() + " " + protoType2.toString());
        System.out.println(protoType.hashCode() + " " + protoType2.hashCode());


    }
}
