/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package optativo2examen;

import Infraestructura.Modelos.Persona_modelo;
import Servicios.Ciudad_servicios;
import Servicios.Cliente_servicios;
import Servicios.Cuentas_servicios;
import Servicios.Movimientos_servicios;
import Servicios.Personas_servicios;

/**
 *
 * @author User
 */
public class ExamenOptativoII {

     public static void main(String[] args) {
        Personas_servicios personaService = new Personas_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
        personaService.consultarPersonaPorId(1);
        
        Ciudad_servicios ciudadService = new Ciudad_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
        ciudadService.consultarCiudadPorId(1);
        
        Cliente_servicios clienteService =new Cliente_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
        clienteService.consultarClientePorId(1);
        
        Cuentas_servicios cuentaService =new Cuentas_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
        cuentaService.consultarCuentaPorId(1);
        
        Movimientos_servicios movimientoService =new Movimientos_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
        movimientoService.consultarMovimientoPorId(1);
     }
     
     
}
