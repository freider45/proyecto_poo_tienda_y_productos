
package modelo;

import java.util.ArrayList;

public class clsTienda {
    /*ATRIBUTOS*/
    //Atributos de clase
    private String nombre;
    private String direccion;
    private Integer telefono;
    private String ubicacion;
    
    /*REFERENCIAS*/
    private ArrayList<clsCliente> lstClientes;
    private ArrayList<clsProducto> lstProductos;
    private ArrayList<clsEmpleado> lstEmpleados;
    
    /*METODOS*/
    //Constructores
    public clsTienda(){
        this.lstClientes = new ArrayList<clsCliente>();
        this.lstEmpleados = new ArrayList<clsEmpleado>();
        this.lstProductos = new ArrayList<clsProducto>();
    }

    public clsTienda(String nombre, String direccion, Integer telefono, String ubicacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.lstClientes = new ArrayList<clsCliente>();
        this.lstEmpleados = new ArrayList<clsEmpleado>();
        this.lstProductos = new ArrayList<clsProducto>();
    }
    
    //Metodos de acceso y modificacion

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<clsCliente> getLstClientes() {
        return lstClientes;
    }

    public void setLstClientes(ArrayList<clsCliente> lstClientes) {
        this.lstClientes = lstClientes;
    }

    public ArrayList<clsProducto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(ArrayList<clsProducto> lstProductos) {
        this.lstProductos = lstProductos;
    }

    public ArrayList<clsEmpleado> getLstEmpleados() {
        return lstEmpleados;
    }

    public void setLstEmpleados(ArrayList<clsEmpleado> lstEmpleados) {
        this.lstEmpleados = lstEmpleados;
    }
    
    //Metodos generales
    
    public void agregarCliente(clsCliente objCliente){
        this.lstClientes.add(objCliente);
        objCliente.setObjTienda(this);
    }
    
    public void agregarProducto(clsProducto objProducto){
        this.lstProductos.add(objProducto);
        objProducto.getLstTiendas().add(this);
    }
    
}//Fin clase
