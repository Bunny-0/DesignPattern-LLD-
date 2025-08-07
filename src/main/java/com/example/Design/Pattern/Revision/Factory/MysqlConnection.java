package com.example.Design.Pattern.Revision.Factory;

public class MysqlConnection implements ConnectionService{

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("Connecting to MySQL database at " + url + " with user " + username);

    }

}
