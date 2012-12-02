
package benedictoxvi.Validaciones;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.*;
import benedictoxvi.Util.ResultType;


public class BVCliente {
    
    
    Result rs = new Result();
    StringBuilder sb = new StringBuilder();
    public BVCliente() {
    }
    public String ValidarCampo(Clientes BEEntidades){
            // Nombre, ApellidosPaterno, ApellidoMaterno, Email, NroDocumento, Telefono
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNombre())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoPaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoMaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEmail())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNroDocumento())? "nombre inválido,": "");
        //
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFechaContacto())? "nombre inválido,": "");
        rs.SetResult(ResultType.Advertencia, "Error de campo", sb.toString());
        return rs.toString();
    }
}
