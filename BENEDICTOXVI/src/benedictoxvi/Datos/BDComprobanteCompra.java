package benedictoxvi.Datos;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.*;
import java.util.ArrayList;
import java.util.List;

public class BDComprobanteCompra {
   
        
   
       public static void main(String[] args){
           
 BDComprobanteCompra comprobantecompra = new BDComprobanteCompra();
 
           comprobantecompra.addLista(1, 25, 25, null, null, null, null, 26, null);
       }
       
    ComprobanteCompra comprobantecompra = new ComprobanteCompra();
    ArrayList Lista = new ArrayList();
    
    private List<ComprobanteCompra> listaRegistroVentas;
    

    public void limpiarRegistroVentas(){
        this.listaRegistroVentas.clear();
    }       
    public void addLista(int concepto, double moneda, double numero, String empresa, String fecha_emision, String fecha_vencimiento, String fecha_pago, double igv, String estado){
        this.listaRegistroVentas.add(new ComprobanteCompra( concepto, moneda, numero,  empresa,  fecha_emision, fecha_vencimiento, fecha_pago,igv, estado));
    }       
       
       
       
       
       
       
       
    public String buscarCompra(ComprobanteCompra BEEntidades){
        return new Result(ResultType.Ok, "Buscando los datos espere un momento por favor...", "").getMensaje();
    }
    public String altaCompra(ComprobanteCompra BEEntidades){
        return new Result(ResultType.Ok, "La Compra ha sido dado de alta satisfactoriamente", "").getMensaje();
    }
     
    
    
}
