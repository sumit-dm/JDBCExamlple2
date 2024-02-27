package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
       Student student = new Student();
        //student.createDatabse();
        //student.createTable();
        //student.insertData();
        //student.readData();
        //student.updateData();
        student.deleteStudent(10);
    }

}
