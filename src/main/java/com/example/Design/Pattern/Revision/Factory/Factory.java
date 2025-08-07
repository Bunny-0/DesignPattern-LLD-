package com.example.Design.Pattern.Revision.Factory;

public class Factory {

    public static ConnectionService getConnection(String type) {

        switch (type.toLowerCase()) {
            case "mysql":
                return new MysqlConnection();
            case "mongodb":
                return new MongoDbConnection();
            default:
                throw new IllegalArgumentException("Unknown connection type: " + type);
        }
    }

    public static void main(String args[]){

        ConnectionService mysqlConnection = Factory.getConnection("mysql");
        mysqlConnection.connect(""  , "root", "password");

    }
}
