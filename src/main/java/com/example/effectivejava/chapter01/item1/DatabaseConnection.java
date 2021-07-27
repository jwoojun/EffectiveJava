package com.example.effectivejava.chapter01.item1;

public class DatabaseConnection {
      private static DatabaseConnection instance;
      private int connection;

      private DatabaseConnection() {
        connection = 100;
      }

      public static DatabaseConnection getInstance() {
        if (instance == null) {
          instance = new DatabaseConnection();
        }
        return instance;
      }

      public int getConnection() {
        return connection;
      }

      public void minusConnection(int value) {
        connection -= value;
      }

      public static void main(String args[]) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection_second = DatabaseConnection.getInstance();

        dbConnection.minusConnection(1);

        System.out.println(dbConnection.getConnection());
        System.out.println(dbConnection_second.getConnection());
      }
}
