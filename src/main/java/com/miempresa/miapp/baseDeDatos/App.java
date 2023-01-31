package com.miempresa.miapp.baseDeDatos;

import com.miempresa.miapp.clases.Colores;

import java.sql.SQLException;
import java.util.*;

public class App {
    public final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";
    public final static String URL = "jdbc:mysql://localhost:3306/";
    public final static String DATABASE = "test";
    public static void main(String[] args) {
        try {
            Conexion conexion = new Conexion();
            System.out.println("Conection created!");
            System.out.println(conexion);
            conexion.getConnection().close();
            System.out.println("Conection closed");
            conexion = new Conexion(DRIVER_NAME, USERNAME, PASSWORD, URL+DATABASE);
            System.out.println("Conection created!");
            System.out.println(conexion);
            // Consulta en la BBDD
            // Crea un objeto del Cliente DAO
            ClienteDAO clienteDAO = new ClienteDAODDBBImpl(conexion);
            // Obtener un listado de datos
            List<Cliente> listado = clienteDAO.findAll();
            System.out.println(Colores.cyan + "findALL: " + Colores.reset + listado);
            // Crear un objeto en la bbdd
            Cliente cliente = new Cliente();
            cliente.setName("Fernando");
            cliente.setDir("Madrid");
            cliente.setTlf("666000111");
            cliente = clienteDAO.add(cliente);
            System.out.println(Colores.yellow + "add: " + Colores.reset + cliente);
            // Obtener un dato de la bbdd por su ID
            cliente = clienteDAO.findByID(cliente.getId());
            System.out.println(Colores.cyan + "findALL: " + Colores.reset + cliente);

            // Modificar un objeto en la bbdd
            // modificamos el objeto del cliente
            cliente.setName("Fer Lop Vec");
            cliente.setDir("Leganes");
            cliente.setTlf("1234567890");
            cliente = clienteDAO.update(cliente.getId(), cliente);
            System.out.println(Colores.green + "update: " + Colores.reset + cliente);

            // Borrado del objeto por su ID
            cliente = clienteDAO.delete(cliente.getId());
            System.out.println(Colores.red + "delete: " + Colores.reset + cliente);
            conexion.getConnection().close();
            System.out.println("Conection closed");


        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("InstantiationException");
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }

    }
}