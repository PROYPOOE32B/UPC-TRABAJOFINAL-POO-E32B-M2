/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author milton
 */
public class BDGrupoEstudio {
    
    
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    ArrayList<GrupoEstudio> list = new ArrayList<GrupoEstudio>();
    Connection con = new BaseConeccion().getConnection();    
    //Statement stm = con.createStatement();

    return list;
}

public Result GuardarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return new Result(ResultType.Ok, "Datos grabados correctamente.", "");
}

public Result ModificarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return new Result(ResultType.Ok, "Datos modificados correctamente.", "");
}

public Result EliminarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return new Result(ResultType.Ok, "Datos eliminados correctamente.", "");
}

}
