
package juegopokemon;
import view.View;

public class JuegoPokemon {
    
    public static void main(String[] args) throws Exception {
       View v= new View(); 
        v.runMenu("%n1.-Archivos:%n"
                + "2.-Gestion de Galeria%n"
                + "3.-Listados%n"    
                + "5.-salir");
    }
    
}
