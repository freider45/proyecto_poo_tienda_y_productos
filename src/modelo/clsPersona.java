
package modelo;

public abstract class clsPersona {
    /*ATRIBUTOS*/
    //Atributos de clase
    private long cedula;
    private String nombre;
    
    /*METODOS*/
    //Constructores
    public clsPersona(){
        
    }
    
    public clsPersona(long cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    //Metodos de acceso y modificacion

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo polimorfico
    public abstract String obtenerInformacion();
    
}//Fin clase
