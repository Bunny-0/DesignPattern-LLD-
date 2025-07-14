package com.example.Design.Pattern.Creational.protoType;

public class UserEntity implements protoType{

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;

    UserEntity(String firstName,String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public UserEntity clone() {
        return new UserEntity(this.firstName, this.lastName, this.email, this.phoneNumber, this.address);
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
                ", add=" + address+ ", email=" + email + ", address=" + address + "]";
    }
}
