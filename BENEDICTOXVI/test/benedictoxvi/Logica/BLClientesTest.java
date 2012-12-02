/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Clientes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class BLClientesTest {
    
    public BLClientesTest() {
    }


    @Test
    public void testBuscarClientes() {
        
        Clientes ObjClientes = new Clientes();
        
        ObjClientes.setNombre("");
        ObjClientes.setApellidoPaterno("");
        ObjClientes.setApellidoMaterno("");
        ObjClientes.setEmail("");
        ObjClientes.setNroDocumento("");
        ObjClientes.setTelefono("");
        ObjClientes.setFechaContacto("");
        BLClientes ObjBLClientes = new BLClientes();
        System.out.println(ObjBLClientes.BuscarClientes(ObjClientes));
    }
   @Test
    public void testGrabarCliente() {
        Clientes ObjClientes = new Clientes();
        ObjClientes.setCodigo(12);
        ObjClientes.setNombre("");
        ObjClientes.setApellidoPaterno("");
        ObjClientes.setApellidoMaterno("");
        ObjClientes.setEmail("");
        ObjClientes.setNroDocumento("");
        ObjClientes.setTelefono("");
        ObjClientes.setFechaContacto("");
        BLClientes ObjBLClientes = new BLClientes();
        System.out.println(ObjBLClientes.GrabarCliente(ObjClientes));
   }
     
  
    
  /*
  


    @Test
    public void testGrabarCliente() {
        System.out.println("GrabarCliente");
        Clientes BEEntidades = null;
        BLClientes instance = new BLClientes();
        String expResult = "";
        String result = instance.GrabarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testEliminarCliente() {
        System.out.println("EliminarCliente");
        Clientes BEEntidades = null;
        BLClientes instance = new BLClientes();
        String expResult = "";
        String result = instance.EliminarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
