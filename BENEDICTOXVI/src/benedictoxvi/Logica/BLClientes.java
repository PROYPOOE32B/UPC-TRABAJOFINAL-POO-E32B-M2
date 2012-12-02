
package benedictoxvi.Logica;

import benedictoxvi.Datos.*;
import benedictoxvi.Entidades.*;
import benedictoxvi.Validaciones.*;


public class BLClientes {
    
 
    public BLClientes() {

    }
    
    
    private BDCliente ObjClientes = new BDCliente();
    private BVCliente  BVValidacion = new BVCliente();
    private String Resultado = "";

    public String BuscarClientes(Clientes BEEntidades){
        Resultado = ObjClientes.BuscarCliente(BEEntidades);
        return Resultado;
    }

    public String GrabarCliente(Clientes BEEntidades){
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            Resultado =  ObjClientes.GrabarCliente(BEEntidades);
        }
        return Resultado;
    }

    public String EliminarCliente(Clientes BEEntidades)
    {
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
        Resultado =  ObjClientes.EliminarCliente(BEEntidades);
        }
        return Resultado;
    }
    
    public String ConvertirAProspecto(Clientes BEEntidades){
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            
        Resultado =  ObjClientes.ConvertirAProspecto(BEEntidades);
        
        }
        
        return Resultado;
    }
    
    public String LeerProspecto(Clientes BEEntidades){
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            
        Resultado =  ObjClientes.LeerProspecto(BEEntidades);
        
        }
        
        return Resultado;
        
        
    }
    
    
}
