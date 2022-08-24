
public class Persona {
    String nombre;
    int peso;
    boolean socio;

    public Persona(String nombre, int peso, boolean socio) {
        this.nombre = nombre;
        this.peso = peso;
        this.socio = socio;
    }
     public String getNombre(){
         return nombre;
     }     
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }
 
}
