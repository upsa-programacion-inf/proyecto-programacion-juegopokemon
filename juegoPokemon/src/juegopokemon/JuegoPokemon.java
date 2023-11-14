
package juegopokemon;
import view.View;

public class JuegoPokemon {
    
    public static void main(String[] args) throws Exception {
       View v= new View();
        String nombreArchivo = "pokedex.txt";
        
        v.importarDesdeTxt(nombreArchivo);
        v.eresAdmin();
    }
    
}
