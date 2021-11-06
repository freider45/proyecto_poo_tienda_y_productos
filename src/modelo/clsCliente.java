
package modelo;

import java.util.ArrayList;

public class clsCliente extends clsPersona{
    /*ATRIBUTOS*/
    //Atributos de clase
    private String direccion;
    private long telefono;
    
    /*REFERENCIAS*/
    private clsTienda objTienda;
    private ArrayList<clsPedido> lstPedidos;
    
    /*METODOS*/
    //Constructores
    public clsCliente(){
        this.lstPedidos = new ArrayList<clsPedido>();
    }

    public clsCliente(long cedula, String nombre, String direccion, long telefono) {
        super(cedula, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.lstPedidos = new ArrayList<clsPedido>();
    }
    
    
    //Metodos generales

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public clsTienda getObjTienda() {
        return objTienda;
    }

    public void setObjTienda(clsTienda objTienda) {
        this.objTienda = objTienda;
    }

    public ArrayList<clsPedido> getLstPedidos() {
        return lstPedidos;
    }

    public void setLstPedidos(ArrayList<clsPedido> lstPedidos) {
        this.lstPedidos = lstPedidos;
    }

    //Metodo polimorfico
    
    @Override
    public String obtenerInformacion() {
        String informacion;
        informacion = "=======INFORMACIÓN CLIENTE====="+"\n"+
                "Nombre: "+super.getCedula()+"\n"+
                "Cedula: "+super.getNombre()+"\n"+
                "Dirección: "+this.getDireccion()+"\n"+
                "Telefono: "+this.getTelefono()+"\n";
        return informacion;
    }
    
}//fin clase
