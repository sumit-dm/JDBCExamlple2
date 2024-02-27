package myPackage;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
    public void createDatabse(){
        try{
            //load the driver
            //Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url,username,password);
            //statement create
            Statement statement = connection.createStatement();

            String query = "create database codingwallah";
            statement.execute(query);
            System.out.println("Database created successfully...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void createTable(){
        try{
            //load the driver
            //Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url,username,password);
            //statement create
            Statement statement = connection.createStatement();

            String query = "create table student(sid int(3), sname varchar(50), semail varchar(50)) ";
            statement.execute(query);
            System.out.println("Table created successfully...");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void insertData(){
        try{
            //load the driver
            //Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url,username,password);
            //statement create
            Statement statement = connection.createStatement();

            String query = "insert into student(sid, sname , semail) values (?,?,?) ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,12);
            preparedStatement.setString(2,"Ranu");
            preparedStatement.setString(3,"ranu@gmail.com");

            preparedStatement.execute();
            System.out.println("Data inserted successfully...");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public void readData() {
        try{
            //load the driver
            //Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "select * from student";
            //statement create
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("id = "+resultSet.getInt(1));
                System.out.println("name = "+resultSet.getString(2));
                System.out.println("email = "+resultSet.getString(3));
            }
            System.out.println("Read successfully");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateData() {
        try{
            //load the driver
            //Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "UPDATE student set sname = ?, semail = ? where sid = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Aman");
            preparedStatement.setString(2,"aman@example.com");
            preparedStatement.setInt(3,10);

            preparedStatement.execute();
            System.out.println("Data updated successfully...");
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(int sid) {
        try {
            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String username = "root";
            String password = "sumit123";

            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM student WHERE sid = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, sid); // Set sid parameter

            int rowsAffected = preparedStatement.executeUpdate(); // Use executeUpdate() for delete

            if (rowsAffected > 0) {
                System.out.println("Student with ID " + sid + " deleted successfully.");
            } else {
                System.out.println("No student found with ID " + sid + ".");
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
