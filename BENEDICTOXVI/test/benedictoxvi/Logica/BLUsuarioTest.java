/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Rol;
import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milton
 */
public class BLUsuarioTest {
    
    public BLUsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GuardarUsuario method, of class BLUsuario.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("GuardarUsuario");
        Usuario pusuario = new Usuario();
        pusuario.setCodigo(1);
        pusuario.setNroDocumento("93983454");
        pusuario.setNombre("Maria");
        pusuario.setApellidoPaterno("Estrada");
        pusuario.setApellidoMaterno("Perez");
        pusuario.setUsuario("MEstrada");
        pusuario.setContrasenha("Estrada9829");
        pusuario.setConfirmContrasenha("Estrada9829");
        pusuario.setEmail("mestrada@gmail.com");
        pusuario.setFechaIngreso(new Date(2012, 8, 21));
        pusuario.setCargo("Vendedor");
        Rol rol1 = new Rol();
        rol1.setCodigoRol(1);
        rol1.setDescripcionRol("Vendedor");
        pusuario.setRol(rol1);
       
                
        BLUsuario instance = new BLUsuario();
        Result expResult = new Result(ResultType.Ok, "El usuario ha sido registrado correctamente.", null);
        Result result = instance.GuardarUsuario(pusuario);
        
        System.out.println(result.getMensaje());
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo()); 
    }

    /**
     * Test of ModificarUsuario method, of class BLUsuario.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("ModificarUsuario");
        Usuario pusuario = new Usuario();
        pusuario.setCodigo(1);
        pusuario.setNroDocumento("93983454");
        pusuario.setNombre("Maria");
        pusuario.setApellidoPaterno("Estrada");
        pusuario.setApellidoMaterno("Perez");
        pusuario.setUsuario("MEstrada");
        pusuario.setContrasenha("Estrada9829");
        pusuario.setConfirmContrasenha("Estrada9829");
        pusuario.setEmail("mestrada@gmail.com");
        pusuario.setFechaIngreso(new Date(2012, 8, 21));
        pusuario.setCargo("Vendedor");
        Rol rol1 = new Rol();
        rol1.setCodigoRol(1);
        rol1.setDescripcionRol("Vendedor");
        pusuario.setRol(rol1);
        
        BLUsuario instance = new BLUsuario();
        Result expResult = new Result(ResultType.Ok, "El usuario ha sido modificado correctamente.", null);
        Result result = instance.ModificarUsuario(pusuario);
        
        System.out.println(result.getMensaje());
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo()); 
    }

    /**
     * Test of EliminarUsuario method, of class BLUsuario.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("EliminarUsuario");
        Usuario pusuario = new Usuario();
        pusuario.setCodigo(1);
        //pusuario.setUsuario("MSantiago");
        
        BLUsuario instance = new BLUsuario();
        Result expResult = new Result(ResultType.Ok, "Usuario eliminado correctamente.", null);
        Result result = instance.EliminarUsuario(pusuario);
         
        System.out.println(result.getMensaje());
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo()); 
    }

    /**
     * Test of BuscarUsuarios method, of class BLUsuario.
     */
    @Test
    public void testBuscarUsuarios() {
        System.out.println("BuscarUsuarios");
        Usuario pusuario = new Usuario();        
        pusuario.setUsuario("MSantiago");
        
        BLUsuario instance = new BLUsuario();
         
        Usuario result = instance.BuscarUsuarios(pusuario);        
        if(result == null) fail("La busqueda no ha retornado resultado.");
        else
        {
            assertEquals(pusuario.getUsuario(),result.getUsuario());
            System.out.println("Se encontró el usuario.");
        }

        
    }

    /**
     * Test of ValidarUsuario method, of class BLUsuario.
     */
    @Test
    public void testExisteUsuario() {
        System.out.println("ValidarUsuario");
        Usuario pusuario = new Usuario();        
        pusuario.setUsuario("cvilchez");
        
        BLUsuario instance = new BLUsuario();
        boolean expResult = false;
        boolean result = instance.ExisteUsuario(pusuario);
        System.out.println("Existe usuario: " + result);
        assertEquals(expResult , result ); 
        
    }
}
