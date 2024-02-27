import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        try{
//            //load the driver
//            //Class.forName("com.mysql.jdbc.Driver");
//
//            //creating a connection
//            String url = "jdbc:mysql://localhost:3306/";
//            String username = "root";
//            String password = "sumit123";
//
//            Connection connection = DriverManager.getConnection(url,username,password);
//            //statement create
//            Statement statement = connection.createStatement();
//
//            String query = "create database codingwallah";
//            statement.execute(query);
//            System.out.println("Database created successfully...");
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }
}