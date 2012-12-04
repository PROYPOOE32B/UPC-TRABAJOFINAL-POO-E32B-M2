/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
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
public class BLAutenticarTest {
    
    public BLAutenticarTest() {
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
     * Test of AutenticarUsuario method, of class BLAutenticar.
     */
    @Test
    public void testAutenticarUsuario() {
        System.out.println("AutenticarUsuario");
        
        Usuario pusuario = new Usuario();
        pusuario.setUsuario("Administrador");
        pusuario.setContrasenha("Windows1@");
        
        BLAutenticar instance = new BLAutenticar();
        Result expResult = new Result(ResultType.Ok, "Usuario correcto", null);
        Result result = instance.AutenticarUsuario(pusuario);
        
        System.out.println(result.getMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje());
        assertEquals(expResult.getTipo(), result.getTipo());
       
       
    }
}
