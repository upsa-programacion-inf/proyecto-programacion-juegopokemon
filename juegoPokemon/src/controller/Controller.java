
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
    public boolean añadirPokemon(String nombre, int ps, String[] nombresMovimientos, float peso, float altura, int num_pokedex, int nivel) {
        return m.añadirPokemon(nombre, ps, nombresMovimientos, peso, altura, num_pokedex, nivel);
    }
    
   public String[][] tablaPokemon() {
        return m.tablaPokemon();
    }

    public void importarDesdeTxt(String n_archivo) {
        m.importarDesdeTxt(n_archivo);
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
    public void importarEntrenadorDesdeTxt(String n_archivo) {
        m.importarEntrenadoresDesdeTxt(n_archivo);
    }
    public void mostrarEntrenadores() {
        m.mostrarEntrenadores();
    }
    public void importarTreecko(String treecko) {
        m.importarTreecko(treecko);
    }
    public void importarChimchar(String chimchar) {
        m.importarChimchar(chimchar);
    }
    public void importarTotodile(String totodile) {
        m.importarTotodile(totodile);
    }
    public String[][] tablaEquipo() {
        return m.tablaEquipo();
    }
    public void hora(){
        m.hora();
    }
}
