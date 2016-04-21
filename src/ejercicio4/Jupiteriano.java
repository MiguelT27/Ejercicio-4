
package ejercicio4;

public class Jupiteriano extends Alien {
     
    public Jupiteriano(String nombre) {
        super(nombre);
        super.Color = "azul";
        super.Estatura = 1.50;
        super.numojos = 2;
        super.numvidas = 6;
        super.especialidad = "Super Inteligencia y gran velocidad";
    }

    @Override
    public String toString() {
        return "Su alien es un Jupiteriano " + super.toString();
    }
   

    
    
            
    
}
