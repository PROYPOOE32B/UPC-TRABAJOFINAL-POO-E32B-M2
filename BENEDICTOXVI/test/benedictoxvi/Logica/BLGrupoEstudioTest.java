/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Entidades.Aula;
import benedictoxvi.Entidades.Curso;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Entidades.Instructor;
import benedictoxvi.Entidades.Local;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;
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
//    @Test
//    public void testBuscarGrupoEstudio() {
//        System.out.println("BuscarGrupoEstudio");
//        GrupoEstudio pGrupoEstudio = null;
//        BLGrupoEstudio instance = new BLGrupoEstudio();
//        ArrayList expResult = null;
//        ArrayList result = instance.BuscarGrupoEstudio(pGrupoEstudio);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of GuardarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testGuardarGrupoEstudio() {
        System.out.println("GuardarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = new GrupoEstudio();
        //Grupo de estudio
        pGrupoEstudio.setCodigoGrupoEstudio(1);
        pGrupoEstudio.setNombre("Grupo Cesar Vallejo");
        pGrupoEstudio.setDescripcion("Ciclo Verano Aduni 2012");
        pGrupoEstudio.setNombreAcademia("Grupo de Estudio Academia Cesar Vallejo");
        GrupoEstudioDetale detalle1 = new GrupoEstudioDetale();
        detalle1.setAula(new Aula(1, "Aula 402", 20));
        detalle1.setCurso(new Curso("01","Inteligencia de Negocios", "www.google.docs.com/BI.doc"));
        detalle1.setLocal(new Local(1, "Sede Monterico", "Encalada 132", "12°17′00″S,76°12′00″W"));
        detalle1.setFechaInicio(new Date(2012, 11, 1));
        detalle1.setFechaInicio(new Date(2013, 01, 30));
        detalle1.setInstructor(new Instructor(1, "Susana", "Caballero", "Rosales"));
                 
        ArrayList<GrupoEstudioDetale> detalle = new ArrayList<GrupoEstudioDetale>();
        detalle.add(detalle1);
        
        pGrupoEstudio.setDetalle(detalle);
        
        BLGrupoEstudio instance = new BLGrupoEstudio();

        Result expResult = new Result(ResultType.Ok, "Datos grabados correctamente.", "");
        Result result = instance.GuardarGrupoEstudio(pGrupoEstudio);
        
        assertEquals(expResult.getMensaje(), result.getMensaje());
        assertEquals(expResult.getTipo(), result.getTipo());
        
        System.out.println(result.getMensaje());            
    }

    /**
     * Test of ModificarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testModificarGrupoEstudio() {
        System.out.println("ModificarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = new GrupoEstudio();
        //Grupo de estudio
        pGrupoEstudio.setCodigoGrupoEstudio(1);
        pGrupoEstudio.setNombre("Grupo Cesar Vallejo");
        pGrupoEstudio.setDescripcion("Ciclo Verano Aduni 2012");
        pGrupoEstudio.setNombreAcademia("Grupo de Estudio Academia Cesar Vallejo");
        GrupoEstudioDetale detalle1 = new GrupoEstudioDetale();
        detalle1.setAula(new Aula(1, "Aula 402", 20));
        detalle1.setCurso(new Curso("01","Inteligencia de Negocios", "www.google.docs.com/BI.doc"));
        detalle1.setLocal(new Local(1, "Sede Monterico", "Encalada 132", "12°17′00″S,76°12′00″W"));
        detalle1.setFechaInicio(new Date(2012, 11, 1));
        detalle1.setFechaInicio(new Date(2013, 01, 30));
        detalle1.setInstructor(new Instructor(1, "Susana", "Caballero", "Rosales"));
                 
        ArrayList<GrupoEstudioDetale> detalle = new ArrayList<GrupoEstudioDetale>();
        detalle.add(detalle1);
        
        pGrupoEstudio.setDetalle(detalle);
        
        BLGrupoEstudio instance = new BLGrupoEstudio();

        Result expResult = new Result(ResultType.Ok, "Datos modificados correctamente.", "");
        Result result = instance.ModificarGrupoEstudio(pGrupoEstudio);
        
        assertEquals(expResult.getMensaje(), result.getMensaje());
        assertEquals(expResult.getTipo(), result.getTipo());
        
        System.out.println(result.getMensaje()); 
    }

    /**
     * Test of EliminarGrupoEstudio method, of class BLGrupoEstudio.
     */
    @Test
    public void testEliminarGrupoEstudio() {
        System.out.println("EliminarGrupoEstudio");
        GrupoEstudio pGrupoEstudio = new GrupoEstudio();
        pGrupoEstudio.setCodigoGrupoEstudio(1);
        BLGrupoEstudio instance = new BLGrupoEstudio();
        Result expResult = new Result(ResultType.Ok, "Grupo de estudio eliminado correctamente.", null); 
        Result result = instance.EliminarGrupoEstudio(pGrupoEstudio);
        assertEquals(expResult.getMensaje(), result.getMensaje());
        assertEquals(expResult.getTipo(), result.getTipo());
    }
}
