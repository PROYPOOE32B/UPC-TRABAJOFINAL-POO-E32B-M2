/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDGrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Entidades.Instructor;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;
import java.util.List;  
import benedictoxvi.Validaciones.BVGrupoEstudio;
/**
 *
 * @author milton
 */
public class BLGrupoEstudio {
   
private BLGrupoEstudio bl = new BLGrupoEstudio();
     
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return bl.BuscarGrupoEstudio(pGrupoEstudio);
}

public Result GuardarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    Result rs = null;
    BVGrupoEstudio bv = new BVGrupoEstudio();
    rs = bv.ValidarGrupoEstudio(pGrupoEstudio);
    
    if(rs.getTipo() == ResultType.Error)
    {
       return rs;
    }   
    
    return bl.GuardarGrupoEstudio(pGrupoEstudio); 
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
