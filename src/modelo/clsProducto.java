
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class clsProducto {
    /*ATRIBUTOS*/
    //Atributos de clase
    private long codigoBarras;
    private String nombre;
    private Calendar fechaVen;
    private Calendar fechaFab;
    private double precio;
    
    /*REFERENCIAS*/
    private ArrayList<clsIngrediente> lstIngredientes;
    private ArrayList<clsTienda> lstTiendas;
    private clsProveedor objProveedor;
    private clsPedido objPedido;
    
    /*METODOS*/
    //Constructores
    public clsProducto(){
        this.lstIngredientes = new ArrayList<clsIngrediente>();
        this.lstTiendas = new ArrayList<clsTienda>();
    }
    
    public clsProducto(long codigoBarras, String nombre, Calendar fechaVen, 
            Calendar fechaFab, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.fechaVen = fechaVen;
        this.fechaFab = fechaFab;
        this.precio = precio;
        this.lstIngredientes = new ArrayList<clsIngrediente>();
        this.lstTiendas = new ArrayList<clsTienda>();
    }
    
    //Metodos de acceso y modificacion

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Calendar fechaVen) {
        this.fechaVen = fechaVen;
    }

    public Calendar getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(Calendar fechaFab) {
        this.fechaFab = fechaFab;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<clsIngrediente> getLstIngredientes() {
        return lstIngredientes;
    }

    public void setLstIngredientes(ArrayList<clsIngrediente> lstIngredientes) {
        this.lstIngredientes = lstIngredientes;
    }

    public ArrayList<clsTienda> getLstTiendas() {
        return lstTiendas;
    }

    public void setLstTiendas(ArrayList<clsTienda> lstTiendas) {
        this.lstTiendas = lstTiendas;
    }

    public clsProveedor getObjProveedor() {
        return objProveedor;
    }

    public void setObjProveedor(clsProveedor objProveedor) {
        this.objProveedor = objProveedor;
    }

    public clsPedido getObjPedido() {
        return objPedido;
    }

    public void setObjPedido(clsPedido objPedido) {
        this.objPedido = objPedido;
    }
    
    
    //metodos generales
    public void crearIngrediente(String nombre, float valor, String unidad){
        clsIngrediente objIngrediente = new clsIngrediente(nombre,valor,unidad);
        this.lstIngredientes.add(objIngrediente);
        objIngrediente.setObjProducto(this);
    }
    
}//Fin clase
