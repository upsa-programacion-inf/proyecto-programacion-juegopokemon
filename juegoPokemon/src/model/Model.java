
package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Model {
    public List <Pokemon> pokedex = null;
        
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
public boolean añadirPokemon(String nombre, int ps, String movimientos, float peso, float altura, int num_pokedex, int nivel){
      boolean tr=true;
         System.out.println("Nombre: "+nombre + " Nivel: "+nivel + " Numero de la Pokedex: "+num_pokedex);
     Pokemon pok = new Pokemon(nombre,ps,movimientos,peso,altura,num_pokedex,nivel);
      pokedex.add(pok);

      return tr;
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
    public String[][] tablaFigura(){
         
        int numpoke=this.pokedex.size();
        String[][] tab_poke=new String[numpoke][];
        for(int n=0;n<numpoke;n++) {
            tab_poke[n]=pokedex.get(n).comoFila();
        }
        return tab_poke;
    }
    
public void importarDesdeTxt(String nombreArchivo) {
        if (pokedex == null) {
            pokedex = new ArrayList<>();
        }

try {
        Path rutaCompleta = Paths.get(System.getProperty("user.home"), "Desktop",nombreArchivo);

        Scanner scan = new Scanner(rutaCompleta.toFile());

            while (scan.hasNextLine()) {
                String poke = scan.nextLine();
                String[] datos = poke.split(",");
                String nombre = datos[0];
                int ps = Integer.parseInt(datos[1]);
                String movimientos = datos[2];
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

   
}//llave final