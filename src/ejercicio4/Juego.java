
package ejercicio4;
import java.util.Scanner;

public class Juego {

    
    public static void main(String[] args) {
        String Nom;
        int opcion;
        Alien ma;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su avatar: ");
        Nom = lectura.nextLine(); 


        System.out.println("Elija un tipo de Alien:"+'\n'+"1.Marciano."+'\t'+"2.Jupiteriano.");
        opcion = lectura.nextInt();


        switch(opcion){
            case 1: 
                ma = new Marciano(Nom);
                System.out.println(ma.toString());
                break;
            case 2: ma = new Jupiteriano(Nom);
                System.out.println(ma.toString());
                break;
            default:
                System.out.println("Opción Invalida");
                break;
        }
  }


}

