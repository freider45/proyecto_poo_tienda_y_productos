
package modelo;

import java.util.ArrayList;

public class clsProveedor implements iGestion{
    /*ATRIBUTOS*/
    //Atributos de clase
    private long NIT;
    private String nombre;
    
    /*REFERENCIAS*/
    private ArrayList<clsProducto> lstProductos;
    
    /*METODOS*/
    //Constructores
    public clsProveedor(){
        this.lstProductos = new ArrayList<clsProducto>();
    }

    public clsProveedor(long NIT, String nombre) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.lstProductos = new ArrayList<clsProducto>();
    }
    
    //Metodos de acceso y modificacion

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<clsProducto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(ArrayList<clsProducto> lstProductos) {
        this.lstProductos = lstProductos;
    }
    
    
    //Metodos polimorfico

    @Override
    public float calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//Fin clase
