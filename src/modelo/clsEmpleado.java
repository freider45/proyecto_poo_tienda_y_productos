
package modelo;

import java.util.Calendar;

public class clsEmpleado extends clsPersona{
    /*ATRIBUTOS*/
    //Atributos de clase
    private eCargo cargo;
    private Calendar fechaIngreso;
    private float sueldo;
    
    /*REFERENCIA*/
    private clsTienda objTienda;

    /*METODOS*/
    //Constructores
    public clsEmpleado(){
        
    }
    
    public clsEmpleado(long cedula, String nombre, eCargo cargo,
            Calendar fechaIngreso, float sueldo){
        super(cedula, nombre);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
    //Metodos de acceso y modificacion

    public eCargo getCargo() {
        return cargo;
    }

    public void setCargo(eCargo cargo) {
        this.cargo = cargo;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public clsTienda getObjTienda() {
        return objTienda;
    }

    public void setObjTienda(clsTienda objTienda) {
        this.objTienda = objTienda;
    }
    

    //Metodo polimorfico
    @Override
    public String obtenerInformacion() {
        String informacion;
        informacion = "=======INFORMACIÓN EMPLEADO====="+"\n"+
                "Nombre: "+super.getCedula()+"\n"+
                "Cedula: "+super.getNombre()+"\n"+
                "Cargo: "+this.cargo+"\n"+
                "Fecha De Ingreso: "+this.getFechaIngreso()+"\n"+
                "Sueldo: "+this.getSueldo();
        
        return informacion;
    }
    
    
}//Fin clase
