package com.example.Design.Pattern.Revision.Builder;

public class User {

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String city;
    String state;

    User(BuilderClass builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
    }

    static class BuilderClass {

        String firstName;
        String lastName;
        String address;
        String email;
        String phoneNumber;
        String city;
        String state;

        BuilderClass firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        BuilderClass lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        BuilderClass address(String address) {
            this.address = address;
            return this;
        }

        BuilderClass email(String email) {
            this.email = email;
            return this;
        }

        BuilderClass phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        BuilderClass city(String city) {
            this.city = city;
            return this;
        }

        BuilderClass state(String state) {
            this.state = state;
            return this;
        }

        public User Build() {
            return new User(this);
        }
    }
}
// The BuilderClass allows for a more flexible construction of User objects, enabling the setting of various attributes in a fluent manner.
