
package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Model {
    public List <Pokemon> pokedex = null;
    private List<Entrenador> entrenadores;
    public List <Pokemon> equipo = null;
    public List <Pokemon> listaEspera = null;
        
    public String leerCadena(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scan.nextLine();
        System.out.println("Has introducido: " + cadena); 
        return cadena;
    }
    
        
    public int leerInt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scan.nextInt();
        System.out.println("Has introducido: " + numero);
        return numero;
    }
    public float leerFloat(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        float numerof = scan.nextFloat();
        System.out.println("Has introducido: " + numerof);
        return numerof;
    }
    
public boolean siOno(){
     Scanner scan = new Scanner(System.in);
     System.out.print("¿Deseas continuar? (s/n): ");
        String respuesta = scan.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Has elegido continuar.");
            return true;
        } else if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("Has elegido no continuar.");
            return false;
        } else {
            System.out.println("Respuesta no válida. Debes ingresar 's' o 'n'.");
            return siOno();
        }
       
}
public boolean añadirPokemon(String nombre, int ps, String[] nombresMovimientos, float peso, float altura, int num_pokedex, int nivel){
    Movimiento[] movimientos = new Movimiento[nombresMovimientos.length];

    for (int i = 0; i < nombresMovimientos.length; i++) {
        movimientos[i] = new Movimiento(nombresMovimientos[i], 50, Movimiento.TipoMovimiento.NORMAL);
    }

    Pokemon pok = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
    pokedex.add(pok);

    return true;
}

 public boolean estaSiONo(String nombre){
        HashMap<String,Pokemon> mapa = new HashMap<>();
         for(int i=0;i<pokedex.size();i++){
             mapa.put(pokedex.get(i).getNombre(),pokedex.get(i));
         }
         if(mapa.containsKey(nombre)){
             return true;
         }
         return false;
     }

    
public void importarDesdeTxt(String nombreArchivo) {
    if (pokedex == null) {
        pokedex = new ArrayList<>();
    }

    try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop", nombreArchivo);

        Scanner scan = new Scanner(rutaCompleta.toFile());

        while (scan.hasNextLine()) {
            String poke = scan.nextLine();
            String[] datos = poke.split(",");
            String nombre = datos[0];
            int ps = Integer.parseInt(datos[1]);

            String[] movimientosData = datos[2].split("; ");
            Movimiento[] movimientos = new Movimiento[movimientosData.length];
            for (int i = 0; i < movimientosData.length; i++) {
                movimientos[i] = encontrarMovimientoPorNombre(movimientosData[i]);
            }

            float peso = Float.parseFloat(datos[3]);
            float altura = Float.parseFloat(datos[4]);
            int num_pokedex = Integer.parseInt(datos[5]);
            int nivel = Integer.parseInt(datos[6]);

            Pokemon nuevoPokemon = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
            pokedex.add(nuevoPokemon);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado: " + nombreArchivo);
    }
}
private Movimiento encontrarMovimientoPorNombre(String nombreMovimiento) {
    List<Movimiento> movimientosPredefinidos = obtenerMovimientosPredefinidos();

    for (Movimiento movimiento : movimientosPredefinidos) {
        if (movimiento.getNombreMovimiento().equalsIgnoreCase(nombreMovimiento)) {

            return new Movimiento(movimiento.getNombreMovimiento(), movimiento.getDaño(), movimiento.getTipo());
        }
    }

    return new Movimiento(nombreMovimiento, 0, Movimiento.TipoMovimiento.NORMAL);
}

private List<Movimiento> obtenerMovimientosPredefinidos() {
    List<Movimiento> movimientos = new ArrayList<>();
    movimientos.add(new Movimiento("Movimiento1", 50, Movimiento.TipoMovimiento.FUEGO));
    movimientos.add(new Movimiento("Movimiento2", 40, Movimiento.TipoMovimiento.PLANTA));
    movimientos.add(new Movimiento("Movimiento3", 30, Movimiento.TipoMovimiento.AGUA));
    movimientos.add(new Movimiento("Movimiento4", 20, Movimiento.TipoMovimiento.NORMAL));
 
    return movimientos;
}


public void datosPokemon(String nombre){
        for(Pokemon poke: pokedex){
            if(poke.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("nombre");System.out.println(poke.getNombre());
                System.out.println("ps");System.out.println(poke.getPs());
                System.out.println("movimientos");System.out.println(poke.getMovimientos());
                System.out.println("peso");System.out.println(poke.getPeso());
                System.out.println("altura");System.out.println(poke.getAltura());
                System.out.println("num_pokedex");System.out.println(poke.getNum_pokedex());
                System.out.println("nivel");System.out.println(poke.getNivel());
            }
        }
    }
public String[][] tablaPokemon() {
        try {
            if (pokedex != null && !pokedex.isEmpty()) {
                String[][] tabla = new String[pokedex.size()][];
                int i = 0;
                for (Pokemon pokemon : pokedex) {
                    tabla[i] = pokemon.comoFila();
                    i++;
                }
                return tabla;
            } else {
                System.out.println("La Pokedex está vacía o es nula.");
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

public void ordenarPokemonsPorNumeroDePokedex() {
        Collections.sort(pokedex, Comparator.comparing(Pokemon::getNum_pokedex));
               
    }
public void ordenarPokemonsPorNombre() {
        Collections.sort(pokedex, Comparator.comparing(Pokemon::getNombre));
               
    }
public void ordenarPokemonsPorNivelYAlfabetico() {
        Collections.sort(pokedex, Comparator.comparing(Pokemon::getNivel).thenComparing(Pokemon::getNombre));
               
    }

public void importarEntrenadoresDesdeTxt(String n_Archivo) {
    if (entrenadores == null) {
        entrenadores = new ArrayList<>();
    }

    try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop", n_Archivo);

        Scanner scan = new Scanner(rutaCompleta.toFile());

        while (scan.hasNextLine()) {
            String entre = scan.nextLine();
            String[] dato = entre.split(";");
            String nombreEntrenador = dato[0];

            List<Pokemon> equipoPokemon = new ArrayList<>();

            for (int i = 1; i < dato.length; i++) {
                String[] datosPokemon = dato[i].split(",");
                String nombre = datosPokemon[0];
                int ps = Integer.parseInt(datosPokemon[1]);

                String[] nombresMovimientos = datosPokemon[2].split("; ");
                Movimiento[] movimientos = new Movimiento[nombresMovimientos.length];
                for (int j = 0; j < nombresMovimientos.length; j++) {
                    movimientos[j] = encontrarMovimientoPorNombre(nombresMovimientos[j]);
                }

                float peso = Float.parseFloat(datosPokemon[3]);
                float altura = Float.parseFloat(datosPokemon[4]);
                int num_pokedex = Integer.parseInt(datosPokemon[5]);
                int nivel = Integer.parseInt(datosPokemon[6]);

                Pokemon pokemon = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
                equipoPokemon.add(pokemon);
            }

            Entrenador nuevoEntrenador = new Entrenador(nombreEntrenador, equipoPokemon);
            entrenadores.add(nuevoEntrenador);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado: " + n_Archivo);
    }
}


public void mostrarEntrenadores() {
        if (entrenadores == null || entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("Lista de Entrenadores:");
            for (Entrenador entrenador : entrenadores) {
                System.out.println("Nombre: " + entrenador.getNombreEntrenador());
                System.out.println("Equipo:");
                entrenador.mostrarEquipo();
                System.out.println("---------------");
            }
        }
    }
       




// Funciones importar desde txt Para elegir al inicial
public void importarTreecko(String treecko) {
        if (equipo == null) {
            equipo = new ArrayList<>();
        }

try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop",treecko);

        Scanner scan = new Scanner(rutaCompleta.toFile());

            while (scan.hasNextLine()) {
                String poke = scan.nextLine();
                String[] datos = poke.split(",");
                String nombre = datos[0];
                int ps = Integer.parseInt(datos[1]);
                String[] movimientosData = datos[2].split("; ");
                Movimiento[] movimientos = new Movimiento[movimientosData.length];
                for (int i = 0; i < movimientosData.length; i++) {
              
                movimientos[i] = encontrarMovimientoPorNombre(movimientosData[i]);
                     }
                float peso = Float.parseFloat(datos[3]);
                float altura = Float.parseFloat(datos[4]);
                int num_pokedex = Integer.parseInt(datos[5]);
                int nivel = Integer.parseInt(datos[6]);

                Pokemon nuevoPokemon = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
                if(equipo.size() <1){
                equipo.add(nuevoPokemon);
                }else{
                    System.out.println("Ya has elegido");
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado: " + treecko);
        }
    }

public void importarChimchar(String chimchar) {
        if (equipo == null) {
            equipo = new ArrayList<>();
        }

try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop",chimchar);

        Scanner scan = new Scanner(rutaCompleta.toFile());

            while (scan.hasNextLine()) {
                String poke = scan.nextLine();
                String[] datos = poke.split(",");
                String nombre = datos[0];
                int ps = Integer.parseInt(datos[1]);
                String[] movimientosData = datos[2].split("; ");
                Movimiento[] movimientos = new Movimiento[movimientosData.length];
                for (int i = 0; i < movimientosData.length; i++) {
              
                movimientos[i] = encontrarMovimientoPorNombre(movimientosData[i]);
                    }
                float peso = Float.parseFloat(datos[3]);
                float altura = Float.parseFloat(datos[4]);
                int num_pokedex = Integer.parseInt(datos[5]);
                int nivel = Integer.parseInt(datos[6]);

                Pokemon nuevoPokemon = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
                if(equipo.size() <1){
                equipo.add(nuevoPokemon);
                }else{
                    System.out.println("Ya has elegido");
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado: " + chimchar);
        }
    }
public void importarTotodile(String totodile) {
        if (equipo == null) {
            equipo = new ArrayList<>();
        }

try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop",totodile);

        Scanner scan = new Scanner(rutaCompleta.toFile());

            while (scan.hasNextLine()) {
                String poke = scan.nextLine();
                String[] datos = poke.split(",");
                String nombre = datos[0];
                int ps = Integer.parseInt(datos[1]);
                String[] movimientosData = datos[2].split("; ");
                Movimiento[] movimientos = new Movimiento[movimientosData.length];
                for (int i = 0; i < movimientosData.length; i++) {
              
                movimientos[i] = encontrarMovimientoPorNombre(movimientosData[i]);
                 }
                float peso = Float.parseFloat(datos[3]);
                float altura = Float.parseFloat(datos[4]);
                int num_pokedex = Integer.parseInt(datos[5]);
                int nivel = Integer.parseInt(datos[6]);

                Pokemon nuevoPokemon = new Pokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);
                if(equipo.size() <1){
                equipo.add(nuevoPokemon);
                }else{
                    System.out.println("Ya has elegido");
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado: " + totodile);
        }
    }
public String[][] tablaEquipo() {
        try {
            if (equipo != null && !equipo.isEmpty()) {
                String[][] tabla = new String[equipo.size()][];
                int i = 0;
                for (Pokemon pokemon : equipo) {
                    tabla[i] = pokemon.comoFila();
                    i++;
                }
                return tabla;
            } else {
                System.out.println("La Pokedex está vacía o es nula.");
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
}//llave final