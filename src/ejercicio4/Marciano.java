
package ejercicio4;


public  class Marciano extends Alien {

    public Marciano(String nombre){
        super(nombre);
        super.Color = "rojo";
        super.Estatura = 2.50;
        super.numojos = 4;
        super.numvidas = 3;
        super.especialidad = "Super Fueza y autocuración";
    }

    @Override
    public String toString() {
        return "Su alien es un Marciano " + super.toString();
    }
    
    
    
    
    }
    

    
    
    
    

