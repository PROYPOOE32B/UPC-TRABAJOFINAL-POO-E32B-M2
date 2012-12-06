/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Clientes;
import benedictoxvi.Util.Result;
import java.util.ArrayList;
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
     
   @Test
       public void ConvertirAProspecto(){
        Clientes ObjClientes = new Clientes();
        ObjClientes.setCodigo(12);
        ObjClientes.setNombre("milton");
        ObjClientes.setApellidoPaterno("Baltazar");
        ObjClientes.setApellidoMaterno("Valenzuela");
        ObjClientes.setEmail("mbaltazar@gmail.com");
        ObjClientes.setNroDocumento("55489543");
        ObjClientes.setTelefono("014453456");
        ObjClientes.setFechaContacto("2012-12-01");

        BLClientes instance = new BLClientes();
        String expResult = "Convercion satisfactoria.";
        String result = instance.ConvertirAProspecto(ObjClientes);
        System.out.println(result);
        assertEquals(expResult, result);

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
