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
    
    sb.append((pGrupoEstudio.getNombre() == null || pGrupoEstudio.getNombre().isEmpty())? "Debe ingresar el nombre del grupo de estudio.": "");
    sb.append((pGrupoEstudio.getDescripcion() == null || pGrupoEstudio.getDescripcion().isEmpty())? "Debe ingresar la descripción del grupo de estudio.": "");
    sb.append((pGrupoEstudio.getNombreAcademia() == null || pGrupoEstudio.getNombreAcademia().isEmpty())? "Debe ingresar la Academia del grupo de estudio.": "");
    
    for(GrupoEstudioDetale detalle : pGrupoEstudio.getDetalle())
    {
        //Validacion del curso
        if (detalle.getCurso() != null)
        {
            sb.append((detalle.getCurso().getCodigoCurso()== null || detalle.getCurso().getCodigoCurso().isEmpty())?"Debe ingresar el código del curso": "");
            sb.append((detalle.getCurso().getNombreCurso()== null || detalle.getCurso().getNombreCurso().isEmpty())?"Debe ingresar el nombre del curso": "");
            sb.append((detalle.getCurso().getSyllabus()== null || detalle.getCurso().getSyllabus().isEmpty())?"Debe ingresar la url del syllabus": "");
        }
        else
        {
            sb.append("No se ha especificado un curso válido.");
        }
       
        //Validacion del instructor
        if(detalle.getInstructor() != null)
        {
            sb.append((detalle.getInstructor().getCodigo() <= 0)?"Debe ingresar el nombre del curso": "");
            sb.append((detalle.getInstructor().getApellidosNombres() == null || detalle.getInstructor().getApellidosNombres().isEmpty())?"Debe ingresar el nombre del instructor": "");        
        }
        else
        {
            sb.append("No se ha especificado un instructor.");
        }


        //Validacion del local
        if (detalle.getLocal() != null)
        {
            sb.append((detalle.getLocal().getCodigoLocal() <= 0)?"Debe ingresar el código del local": "");
            sb.append((detalle.getLocal().getNombre() == null || detalle.getLocal().getNombre().isEmpty())?"Debe ingresar el nombre del local": "");        
        }
        else
        {
            sb.append("No se ha especificado un local válido.");
        }

        
    }
        
    if (sb.length() > 0) 
    {
        rs.SetResult(ResultType.Error, sb.toString());
        return rs;
    }
    
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
