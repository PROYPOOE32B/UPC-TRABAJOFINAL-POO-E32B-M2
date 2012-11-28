/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Validaciones;

import benedictoxvi.Entidades.Aula;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
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
public class BVGrupoEstudioTest {
    
    public BVGrupoEstudioTest() {
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
     * Test of BuscarGrupoEstudio method, of class BVGrupoEstudio.
     */
    @Test
    public void testBuscarGrupoEstudio() {
        System.out.println("BuscarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BVGrupoEstudio instance = new BVGrupoEstudio();
        ArrayList expResult = null;
        ArrayList result = instance.BuscarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarGrupoEstudio method, of class BVGrupoEstudio.
     */
    @Test
    public void testGuardarGrupoEstudio() {
        System.out.println("GuardarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = new GrupoEstudio();
        //Grupo de estudio
        pGrupoEstudio.setCodigoGrupoEstudio(1);
        pGrupoEstudio.setNombre("Ciclo Verano Aduni 2012");
        
        GrupoEstudioDetale detalle1 = new GrupoEstudioDetale();
        detalle1.setAula(new Aula(1, "Aula 402", 20));
        
        ArrayList<GrupoEstudioDetale> detalle = new ArrayList<GrupoEstudioDetale>();
        detalle.add(detalle1);
        
         pGrupoEstudio.setDetalle(detalle);
         BVGrupoEstudio instance = new BVGrupoEstudio();
               
        Result expResult = null;
        Result result = instance.GuardarGrupoEstudio(pGrupoEstudio);
        
        if(result.getTipo() ==  ResultType.Ok )
        {
           assertEquals(0, 0);
            System.out.println(result.getMensaje());         
        }
        else
        {
            fail(result.getMensaje());            
        }
    }

    /**
     * Test of ModificarGrupoEstudio method, of class BVGrupoEstudio.
     */
    @Test
    public void testModificarGrupoEstudio() {
        System.out.println("ModificarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BVGrupoEstudio instance = new BVGrupoEstudio();
        Result expResult = null;
        Result result = instance.ModificarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarGrupoEstudio method, of class BVGrupoEstudio.
     */
    @Test
    public void testEliminarGrupoEstudio() {
        System.out.println("EliminarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = null;
        BVGrupoEstudio instance = new BVGrupoEstudio();
        Result expResult = null;
        Result result = instance.EliminarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
