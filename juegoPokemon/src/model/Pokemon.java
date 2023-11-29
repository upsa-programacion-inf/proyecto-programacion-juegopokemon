
package model;
import java.io.Serializable;
import java.util.ArrayList;

public class Pokemon {
    private String nombre;
    private int ps;
    private Movimiento[] movimientos;
    private float peso;
    private float altura;
    private int num_pokedex;
    private int nivel;
     
    public Pokemon(String nombre, int ps, Movimiento[] movimientos, float peso, float altura, int num_pokedex, int nivel){
        this.nombre=nombre;
        this.ps=ps;
        this.movimientos=movimientos;
        this.peso=peso;
        this.altura=altura;
        this.num_pokedex=num_pokedex;
        this.nivel=nivel;

    }
     public String getNombre() {
        return nombre;
    }

    public int getPs() {
        return ps;
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

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPs(int ps) {
        this.ps = ps;
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

  

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }
    
public String[] comoFila() {
    String[] nombresMovimientos = new String[movimientos.length];

    for (int i = 0; i < movimientos.length; i++) {
        nombresMovimientos[i] = movimientos[i].getNombreMovimiento();
    }

    String[] fila = {
            this.nombre,
            String.valueOf(this.ps),
            String.join("; ", nombresMovimientos), 
            String.valueOf(this.peso),
            String.valueOf(this.altura),
            String.valueOf(this.num_pokedex),
            String.valueOf(this.nivel)
    };

    return fila;
}


}//lave final

