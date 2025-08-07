package com.example.Design.Pattern.Revision.Factory;

public class MongoDbConnection implements ConnectionService{
    @Override
    public void connect(String url, String username, String password) {
        System.out.println("Connecting to MongoDB database at " + url + " with user " + username);
    }
}
