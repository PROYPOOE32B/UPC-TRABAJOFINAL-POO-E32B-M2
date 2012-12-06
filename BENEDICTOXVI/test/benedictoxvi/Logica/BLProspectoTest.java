/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Prospecto;
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
public class BLProspectoTest {
    
    public BLProspectoTest() {
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
     * Test of BuscarAProspecto method, of class BLProspecto.
     */
    @Test
    public void testBuscarAProspecto() {
        System.out.println("BuscarAProspecto");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.BuscarAProspecto(BEEntidades);
        assertEquals(expResult, result);
    }

    /**
     * Test of GrabarCliente method, of class BLProspecto.
     */
    @Test
    public void testGrabarCliente() {
        System.out.println("GrabarCliente");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.GrabarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarCliente method, of class BLProspecto.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("EliminarCliente");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.EliminarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AltaProspecto method, of class BLProspecto.
     */
    @Test
    public void testAltaProspecto() {
        System.out.println("AltaProspecto");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.AltaProspecto(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
