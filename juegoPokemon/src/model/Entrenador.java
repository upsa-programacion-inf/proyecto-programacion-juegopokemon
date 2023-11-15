
package model;

import java.util.ArrayList;
import java.util.List;


public class Entrenador {
    private String nombre;
    private List<Pokemon> equipoPokemon;
    
    
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipoPokemon = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getEquipoPokemon() {
        return equipoPokemon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipoPokemon(List<Pokemon> equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }
    
    public void agregarPokemonAlEquipo(Pokemon pokemon) {
        this.equipoPokemon.add(pokemon);
    }
    public void mostrarEquipo() {
        if (equipoPokemon.isEmpty()) {
            System.out.println("El equipo de " + nombre + " está vacío.");
        } else {
            System.out.println("Equipo de " + nombre + ":");
            for (Pokemon pokemon : equipoPokemon) {
                System.out.println("Nombre: " + pokemon.getNombre() + ", Nivel: " + pokemon.getNivel());
            }
        }
    }


}
