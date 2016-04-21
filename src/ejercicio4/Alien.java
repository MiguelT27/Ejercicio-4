
package ejercicio4;


public class Alien {
    
    String nombre;
    public String Color;
    public double Estatura;
    public int numojos;
    public int numvidas;
    public String especialidad;
    public  Alien(String nombre) {
        this.nombre = nombre;
        this.Color = Color;
        this.Estatura = Estatura;
        this.numojos = numojos;
        this.numvidas = numvidas; 
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "cuyo nombre es " + nombre +"."+"\n" + "\tTiene color " + Color + ", una estatura de " + Estatura +" mts" +", posee " + numojos + " ojos" + 
                ", tiene " + numvidas +" vidas" + ", y su especialidad es " + especialidad +".";
    }
    
    

  
    

    
    
}
