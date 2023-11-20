
package model;
import java.io.Serializable;
import java.util.ArrayList;

public class Pokemon {
    private String nombre;
    private int ps;
    private String movimientos;
    private float peso;
    private float altura;
    private int num_pokedex;
    private int nivel;
    private ArrayList<String> Pokemon=new ArrayList<>();
     
    public Pokemon(String nombre, int ps, String movimientos, float peso, float altura, int num_pokedex, int nivel){
        this.nombre=nombre;
        this.ps=ps;
        this.movimientos=movimientos;
        this.peso=peso;
        this.altura=altura;
        this.num_pokedex=num_pokedex;
        this.nivel=nivel;

    }
    
    public static Pokemon factory(String[] poke){
    if(7!=poke.length){
        return null;
    }
    String p_nombre,p_movimientos;
    int p_ps,p_num_pokedex,p_nivel;
    float p_peso, p_altura;
    for(int i = 0;i<poke.length;i++){
        if(poke[i].isEmpty()){
            return null;
        }
    }
    p_nombre=poke[0];
  
    try{
        p_ps=Integer.parseInt(poke[1]);
        p_peso=Float.parseFloat(poke[3]);
        p_altura=Float.parseFloat(poke[4]);
        p_num_pokedex=Integer.parseInt(poke[5]);
        p_nivel=Integer.parseInt(poke[6]);

    }catch(Exception ex){
        System.out.println("Exception "+ex);
        return null;
    }
    p_movimientos=poke[2];
   
    
    return new Pokemon(p_nombre,p_ps,p_movimientos,p_peso,p_altura,p_num_pokedex, p_nivel);
     } 

    public String getNombre() {
        return nombre;
    }

    public int getPs() {
        return ps;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<String> getPokemon() {
        return Pokemon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPokemon(ArrayList<String> Pokemon) {
        this.Pokemon = Pokemon;
    }
    
   public String[] comoFila() {
    String[] fila = {
            this.nombre,
            String.valueOf(this.ps),
            this.movimientos,
            String.valueOf(this.peso),
            String.valueOf(this.altura),
            String.valueOf(this.num_pokedex),
            String.valueOf(this.nivel)
    };
    return fila;
}

}

//al menos una clase abstracta y una clase uq herede de esa clase abstracta
// interfaz y clase que implemente interfaz

//una enumeracion 
//una clase local date
//colecciones: lista un set :un mapa y un set ordenado