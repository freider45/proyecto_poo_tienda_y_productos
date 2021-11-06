
package modelo;

public class clsIngrediente {
    /*ATRIBUTOS*/
    //Atributos de clase
    private String nombre;
    private float valor;
    private String unidad;
    
    /*REFERENCIAS*/
    private clsProducto objProducto;
    
    /*METODOS*/
    //Constructores
    public clsIngrediente(){
        
    }
    
    public clsIngrediente(String nombre, float valor, String unidad){
        this.nombre = nombre;
        this.valor = valor;
        this.unidad = unidad;
    }
    
    //Metodos de acceso y modificacion

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public clsProducto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(clsProducto objProducto) {
        this.objProducto = objProducto;
    }
    
    
}//Fin clase
