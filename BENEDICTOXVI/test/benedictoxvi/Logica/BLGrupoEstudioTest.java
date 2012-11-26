/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.GrupoEstudio;
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
 * @author milton
 */
public class BLGrupoEstudioTest {
    
    public BLGrupoEstudioTest() {
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
     * Test of BuscarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testBuscarGrupoEstudio() {
        System.out.println("BuscarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BLGrupoEstudio instance = new BLGrupoEstudio();
        ArrayList expResult = null;
        ArrayList result = instance.BuscarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testGuardarGrupoEstudio() {
        System.out.println("GuardarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BLGrupoEstudio instance = new BLGrupoEstudio();
        Result expResult = null;
        Result result = instance.GuardarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testModificarGrupoEstudio() {
        System.out.println("ModificarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BLGrupoEstudio instance = new BLGrupoEstudio();
        Result expResult = null;
        Result result = instance.ModificarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testEliminarGrupoEstudio() {
        System.out.println("EliminarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BLGrupoEstudio instance = new BLGrupoEstudio();
        Result expResult = null;
        Result result = instance.EliminarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
