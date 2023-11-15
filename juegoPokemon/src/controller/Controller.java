
package controller;
import model.Model;

public class Controller {
    Model m= new Model();
    public String leerCadena(){
        return m.leerCadena();
    }
    public int leerInt(){
        return m.leerInt();
    }
     public float leerFloat(){
        return m.leerFloat();
    }
   public boolean siOno(){
        return m.siOno();
    }
     public boolean estaSiONo(String nombre){
        return m.estaSiONo(nombre);
    }
    public boolean añadirPokemon(String nombre, int ps, String movimientos, float peso, float altura, int num_pokedex, int nivel){
        return m.añadirPokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
    }
    
   public String[][] tablaPokemon() {
        return m.tablaPokemon();
    }

    public void importarDesdeTxt(String ruta) {
        m.importarDesdeTxt(ruta);
    }
    public void datosPokemon(String nombre){
        m.datosPokemon(nombre);
    }
    public void ordenarPokemonsPorNumeroDePokedex() {
        m.ordenarPokemonsPorNumeroDePokedex();
               
    }
    
    public void ordenarPokemonsPorNombre() {
        m.ordenarPokemonsPorNombre();
               
    }
    public void ordenarPokemonsPorNivelYAlfabetico() {
       m.ordenarPokemonsPorNivelYAlfabetico();
               
    }
}
