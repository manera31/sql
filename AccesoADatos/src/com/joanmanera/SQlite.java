package com.joanmanera;

import java.sql.*;

public class SQlite {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        conectarMySQL();
    }

    /*public static void conectarSqlite() throws SQLException {
        String urlConexio="jdbc:sqlite:/home/joan/Descargas/sqlite-tools-linux-x86-3300100/base.db";
        Connection connection = DriverManager.getConnection(urlConexio);
        if(connection != null){
            System.out.println("OK-SQlite");
        }
        connection.close();
    }
    public static void conectarApacheDerby() throws SQLException {
        String urlConexio="jdbc:derby:/home/joan/Descargas/sqlite-tools-linux-x86-3300100/base.db";
        Connection connection = DriverManager.getConnection(urlConexio);
        if(connection != null){
            System.out.println("OK-Derby");
        }
        connection.close();
    }
    public static void conectarHsqldb() throws SQLException {
        String urlConexio="jdbc:hsqldb:/home/joan/Descargas/sqlite-tools-linux-x86-3300100/base.db";
        Connection connection = DriverManager.getConnection(urlConexio);
        if(connection != null){
            System.out.println("OK-Hsqldb");
        }
        connection.close();
    }
    public static void conectarH2() throws SQLException {
        String urlConexio="jdbc:h2:/home/joan/Descargas/sqlite-tools-linux-x86-3300100/mibase,'sa',''";
        Connection connection = DriverManager.getConnection(urlConexio);
        if(connection != null){
            System.out.println("OK-H2");
        }
        connection.close();
    }*/
    public static void conectarMySQL() throws SQLException {
        String usuario = "root";
        String passwd = "";
        String urlConexio="jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC"; //empleados es la base de datos
        Connection connection = DriverManager.getConnection(urlConexio, usuario, passwd);
        if(connection != null){
            System.out.println("OK-Mysql");
        }
        connection.close();
    }
}
