
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsPedido implements iGestion{
    /*ATRIBUTOS*/
    //Atributos de clase
    private long codigo;
    private Calendar fecha;
    private float valorPago;
    
    /*REFERENCIAS*/
    private clsCliente objCliente;
    private ArrayList<clsProducto> lstProductos;
    
    /*METODOS*/
    //Constructores
    public clsPedido(){
        this.lstProductos = new ArrayList<clsProducto>();
    }

    public clsPedido(long codigo, Calendar fecha, float valorPago) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.valorPago = valorPago;
        this.lstProductos = new ArrayList<clsProducto>();
    }
    
    //Metodos de acceso y modificacion

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public clsCliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(clsCliente objCliente) {
        this.objCliente = objCliente;
    }

    public ArrayList<clsProducto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(ArrayList<clsProducto> lstProductos) {
        this.lstProductos = lstProductos;
    }
    
    //Metodos generales
    public void agregarProducto(clsProducto objProducto){
        this.lstProductos.add(objProducto);
        objProducto.setObjPedido(this);
    }
    
    //Metodo polimorfico

    @Override
    public float calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//Fin clase
