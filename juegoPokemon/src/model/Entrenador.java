
package model;

import java.util.ArrayList;
import java.util.List;


public class Entrenador {
    private String nombreEntrenador;
    private List<Pokemon> equipoPokemon;
    
    
    public Entrenador(String nombreEntrenador,List<Pokemon> equipoPokemon) {
        this.nombreEntrenador = nombreEntrenador;
        this.equipoPokemon = equipoPokemon;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public List<Pokemon> getEquipoPokemon() {
        return equipoPokemon;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public void setEquipoPokemon(List<Pokemon> equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }
    
    public void agregarPokemonAlEquipo(Pokemon pokemon) {
        this.equipoPokemon.add(pokemon);
    }
    public void mostrarEquipo() {
        if (equipoPokemon.isEmpty()) {
            System.out.println("El equipo de " + nombreEntrenador + " está vacío.");
        } else {
            System.out.println("Equipo de " + nombreEntrenador + ":");
            for (Pokemon pokemon : equipoPokemon) {
                System.out.println("Nombre: " + pokemon.getNombre() + ", Nivel: " + pokemon.getNivel()+"PS: " + pokemon.getPs());
            }
        }
    }


}
