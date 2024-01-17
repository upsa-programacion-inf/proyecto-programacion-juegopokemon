
package juegopokemon;
import view.View;

public class JuegoPokemon {
    
    public static void main(String[] args) throws Exception {
       View v= new View();
        String nombreArchivo = "pokedex.txt";
        String n_archivo="entrenadores.txt";
        
        v.importarDesdeTxt(nombreArchivo);
        v.importarEntrenadorDesdeTxt(n_archivo);
        
        v.eresAdmin();
        v.mostrarMensaje("Trabajo hecho por Ismael Gabriel Prieto");
    }
   
}
