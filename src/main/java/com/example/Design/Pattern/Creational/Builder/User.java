package com.example.Design.Pattern.Creational.Builder;

public class User {


    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;

    }



    static class Builder{

        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        String address;

        Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public User build(){
            return new User(this);
        }

    }
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
                ", add=" + address+ ", email=" + email + ", address=" + address + "]";
    }
}

