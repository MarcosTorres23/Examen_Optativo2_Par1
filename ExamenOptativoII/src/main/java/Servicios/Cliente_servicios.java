/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Infraestructura.DbManagment.contactos.Cliente;
import Infraestructura.Modelos.Cliente_modelo;

/**
 *
 * @author User
 */
public class Cliente_servicios {
     Cliente clienteDB;
    public Cliente_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        clienteDB = new Cliente(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(Cliente_modelo persona){
        if(validarDatos(persona)){
           return clienteDB.registrarCliente(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarCliente(Cliente_modelo persona){
        if(validarDatos(persona)){
            return clienteDB.modificarCliente(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }


    public Cliente_modelo consultarClientePorId(int id){
        return  clienteDB.consultarCliente(id);
    }

    private boolean validarDatos(Cliente_modelo cliente) {
        try {
        if(cliente.Calificacion.trim().isEmpty())
            throw new Exception("La Calificacion no debe estar vacía");
        else if (cliente.Calificacion.trim().length() < 3) {
            throw new Exception("La calificacion no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
