/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDGrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Entidades.Instructor;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;
import java.util.List;  
/**
 *
 * @author milton
 */
public class BLGrupoEstudio {
   
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return null;
}

public Result GuardarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    StringBuilder sb = new StringBuilder();
    Result rs = new Result();
    
    sb.append((pGrupoEstudio.getNombre().isEmpty() || pGrupoEstudio.getNombre() == null)? "Debe ingresar el nombre del grupo de estudio.": "");
    sb.append((pGrupoEstudio.getDescripcion().isEmpty() || pGrupoEstudio.getDescripcion() == null)? "Debe ingresar la descripción del grupo de estudio.": "");
    sb.append((pGrupoEstudio.getNombreAcademia().isEmpty() || pGrupoEstudio.getNombreAcademia() == null)? "Debe ingresar la Academia del grupo de estudio.": "");
    
    for(GrupoEstudioDetale detalle : pGrupoEstudio.getDetalle())
    {
        //Validacion del curso
        sb.append((detalle.getCurso().getCodigoCurso().isEmpty() || detalle.getCurso().getCodigoCurso()== null)?"Debe ingresar el código del curso": "");
        sb.append((detalle.getCurso().getNombreCurso().isEmpty() || detalle.getCurso().getNombreCurso()== null)?"Debe ingresar el nombre del curso": "");
        sb.append((detalle.getCurso().getSyllabus().isEmpty() || detalle.getCurso().getSyllabus()== null)?"Debe ingresar la url del syllabus": "");
       
        //Validacion del instructor
        sb.append((detalle.getInstructor().getCodigo() <= 0)?"Debe ingresar el nombre del curso": "");
        sb.append((detalle.getInstructor().getApellidosNombres().isEmpty() || detalle.getInstructor().getApellidosNombres() == null )?"Debe ingresar el nombre del instructor": "");

        //Validacion del local
        sb.append((detalle.getLocal().getCodigoLocal() <= 0)?"Debe ingresar el código del local": "");
        sb.append((detalle.getLocal().getNombre().isEmpty() || detalle.getLocal().getNombre() == null)?"Debe ingresar el nombre del local": "");
        
    }
        
    if (sb.length() > 0) rs.SetResult(ResultType.Error, sb.toString());
    
    BDGrupoEstudio bd = new BDGrupoEstudio();
    return bd.GuardarGrupoEstudio(pGrupoEstudio);    
}

public Result ModificarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
     BDGrupoEstudio bd = new BDGrupoEstudio();
    return bd.ModificarGrupoEstudio(pGrupoEstudio) ;
}

public Result EliminarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    BDGrupoEstudio bd = new BDGrupoEstudio();
    return bd.EliminarGrupoEstudio(pGrupoEstudio) ;
}

}
