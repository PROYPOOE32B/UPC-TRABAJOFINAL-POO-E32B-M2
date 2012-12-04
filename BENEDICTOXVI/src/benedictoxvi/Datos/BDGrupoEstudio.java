/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.Curso;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Util.Constantes;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
 
 

/**
 *
 * @author milton
 */
public class BDGrupoEstudio {
    
    
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio) throws FileNotFoundException
{
    try
    {    
        GrupoEstudio grupoEstudio1 = new GrupoEstudio();
        grupoEstudio1.setCodigoGrupoEstudio(1);
        grupoEstudio1.setDescripcion("Inteligencia de Negocios");
        grupoEstudio1.setDetalle(null);
        Connection con = new BaseConeccion().getConnection();    
        //Statement stm = con.createStatement();

        return null;
    }
    catch(Exception ex)
    {
        return null;
    }

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
