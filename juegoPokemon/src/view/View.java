package view;

import controller.Controller;

public class View {
    Controller c = new Controller();

   
        

    public void runMenu()throws Exception{
        boolean salir = false;
            do {
            mostrarMenu();
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.nuevaPartida();
                  
                case 2 ->
                    this.continuarPartida();
                   
                case 3 ->
                    System.out.printf("funciona genial");
                
               case 4 ->
                    salir = siOno();

                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
    }
   
    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. nueva partida");
        System.out.println("2. continuar partida");
        System.out.println("3. información");
        System.out.println("4. Salir del programa");
      
    }         
   private String leerCadena(){
        return c.leerCadena();
    }
   private int leerInt(){
        return c.leerInt();
    }
   private float leerFloat(){
        return c.leerFloat();
    }
   private boolean siOno(){
        return c.siOno();
    }
   
   private void nuevaPartida(){
       System.out.println("Bienvenido al Mundo Pókemon");
       System.out.println("Acabas de comenzar tu aventura en esta nueva y extraña región");
       System.out.println("Pero no puedes hacerlo solo, NECESITARÁS UN POKEMON QUE TE ACOMPAÑE!!!");
       this.elegirPokemon();
       System.out.println("Tambien necesitarás una pokedex, toma:");
       System.out.println("Dicho esto que comienze la aventura");
       this.continuarPartida();
}
    private void continuarPartida(){
        System.out.println("Que quieres hacer?");
        boolean salir = false;
            do {
            muestraMenu();
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.menuCombate();
                    
                case 2 ->
                    System.out.printf("captura");
                   
                case 3 ->
                    this.tablaEquipo();
                    
                case 4 ->
                    this.menuPokedex();
                
               case 5 ->
                    salir = siOno();

                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
    }    

   private static void muestraMenu() {
        System.out.println("Menú:");
        System.out.println("1. combate");
        System.out.println("2. captura");
        System.out.println("3. pokemon");
        System.out.println("4. pokedex");
        System.out.println("5. volver al inicio");
      
    }         
        
      private void añadirPokemon() {
    System.out.printf("%nVamos a añadir un Pokémon, por favor, conteste a lo siguiente:");

    String nombre = "";
    do { 
        System.out.println("Introduce el nombre para comprobar que no existe ya:");
        nombre = leerCadena();
        
        if (c.estaSiONo(nombre)) {
            System.out.println("¡Error! Ya existe un Pokémon con ese nombre. Elige otro.");
        }

    } while (c.estaSiONo(nombre));

    System.out.println("Dime los PS del Pokémon, si está sano 200:");
    int ps = this.leerInt();

    System.out.println("Dime los movimientos que tiene el Pokémon (separados por comas):");
    String[] movimientos = leerCadena().split(", ");

    System.out.println("Diga el peso del Pokémon:");
    float peso = leerFloat();

    System.out.println("Diga la altura del Pokémon:");
    float altura = leerFloat();

    System.out.println("Diga el número de la Pokédex del Pokémon:");
    int num_pokedex = leerInt();

    System.out.println("Diga el nivel del Pokémon:");
    int nivel = leerInt();

    boolean pokemonAgregado = c.añadirPokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);

    if (pokemonAgregado) {
        System.out.println("¡Pokémon añadido correctamente!");
    } else {
        System.out.println("Hubo un problema al añadir el Pokémon. Por favor, verifica los datos e inténtalo de nuevo.");
    }
}

    
  public void eresAdmin()throws Exception{
        boolean salir = false;
        
            do {
                System.out.println("1.eres admin");
                System.out.println("2.eres jugador");
                System.out.println("3.salir");
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.cambiosPokemon();
                  
                case 2 ->
                    this.runMenu();
                    
                case 3 ->
                    salir = siOno();
                default ->
                    System.out.printf("%n Opcion Incorrecta %n");


            }
        } while (!salir);
    
    }
private void tablaPokemon() {
    try {
        String[][] tabla = c.tablaPokemon();
        if (tabla != null && tabla.length > 0 && tabla[0].length == 7) {
            for (String[] fila : tabla) {
                System.out.printf("%nNombre: %s, PS: %s, Movimientos: %s, Peso: %s, Altura: %s, Num Pokedex: %s, Nivel: %s%n",
                        fila[0], fila[1], fila[2], fila[3], fila[4], fila[5], fila[6]);
            }
        } else {
            System.out.println("La Pokedex está vacía o es nula.");
        }
    } catch (Exception ex) {
        System.out.println(ex);
    }
}
 public void importarDesdeTxt(String ruta) {
        c.importarDesdeTxt(ruta);
    }
  public void importarEntrenadorDesdeTxt(String n_archivo) {
        c.importarEntrenadorDesdeTxt(n_archivo);
    }
 
 public void cambiosPokemon(){
     boolean salir = false;
     
        
            do {
                System.out.println("1.añadir dastos de un Pokemon");
                System.out.println("2.ver datos de un  Pokemon");
                System.out.println("3.ver Pokedex");
                System.out.println("4.eliminar datos de un pokemon");
                System.out.println("5.salir");
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.añadirPokemon();
                  
                case 2 ->
                    this.datosPokemon();
                    
                case 3 ->
                    this.tablaPokemon();
                
                case 4 ->
                    System.out.println("por hacer");
                  
                case 5 ->
                    salir = siOno();
                    
                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
     
 }
  private void datosPokemon(){
        String nombre;
        do{ 
           nombre = leerCadena();
            
        }while(!c.estaSiONo(nombre));
        c.datosPokemon(nombre);
       
    }
  public void menuPokedex(){
      boolean salir = false;
     
        
            do {
                System.out.println("1.Ver los Pokemons de la pokedex");
                System.out.println("2.ver datos de un  Pokemon");
                System.out.println("3.Ordenar la pokedex por Numero de la Pokedex");
                System.out.println("4.Ordenar la pokedex en orden alfábetico");
                System.out.println("5.Ordenar la pokedex por orden nivel en el que ese pokemon empieza a aparecer y Alfabeticamente");
                System.out.println("6.salir");
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.tablaPokemon();
                  
                case 2 ->
                    this.datosPokemon();
                    
                case 3 ->
                    this.ordenarPokemonsPorNumeroDePokedex();
                 
                
                case 4 ->
                    this.ordenarPokemonsPorNombre();
                 
                case 5 ->
                    this.ordenarPokemonsPorNivelYAlfabetico();
                 
                  
                case 6 ->
                    salir = siOno();
                    
                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
      
  }
   public void ordenarPokemonsPorNumeroDePokedex() {
        c.ordenarPokemonsPorNumeroDePokedex();
        this.tablaPokemon();
               
    }
    
    public void ordenarPokemonsPorNombre() {
        c.ordenarPokemonsPorNombre();
        this.tablaPokemon();
               
    }
    public void ordenarPokemonsPorNivelYAlfabetico() {
       c.ordenarPokemonsPorNivelYAlfabetico();
       this.tablaPokemon();
               
    }
    
   private void menuCombate(){
        System.out.println("Que quieres hacer?");
        boolean salir = false;
            do {
                System.out.println("1.Mostrar entrenadores del juego");
                System.out.println("2.combatir");
                System.out.println("3.salir");
            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.mostrarEntrenadores(); 

                case 2 ->
                    System.out.printf("Empieza el combate:");
                
               case 3 ->
                    salir = siOno();

                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
    }    
   public void mostrarEntrenadores(){
       c.mostrarEntrenadores();
   }
   public void importarTreecko(String treecko) {
        c.importarTreecko(treecko);
    }
    public void importarChimchar(String chimchar) {
        c.importarChimchar(chimchar);
    }
    public void importarTotodile(String totodile) {
        c.importarTotodile(totodile);
    }
    public void elegirPokemon(){
        boolean salir = false;
        String totodile = "totodile.txt";
        String chimchar = "chimchar.txt";
        String treecko = "treecko.txt";
        
            do {
                System.out.println("1.Elegir a Treecko");
                System.out.println("2.Elegir a Chimchar");
                System.out.println("3.Elegr a Totodile");
                System.out.println("4.salir");

            int opcion;
            opcion = this.leerInt();
            switch (opcion) {
                case 1 ->
                    this.importarTreecko(treecko);
                  
                case 2 ->
                    this.importarChimchar(chimchar);
                    
                case 3 ->
                    this.importarTotodile(totodile);
                  
                case 4 ->
                    salir = siOno();
                    
                default ->
                    System.out.printf("%n Opcion Incorrecta %n");

            }
        } while (!salir);
    
        
    }
    
   private void tablaEquipo() {
    try {
        String[][] tab = c.tablaEquipo();
        if (tab != null && tab.length > 0 && tab[0].length == 7) {
            for (String[] fila : tab) {
                System.out.printf("%nNombre: %s, PS: %s, Movimientos: %s, Peso: %s, Altura: %s, Num Pokedex: %s, Nivel: %s%n",
                        fila[0], fila[1], fila[2], fila[3], fila[4], fila[5], fila[6]);
            }
        } else {
            System.out.println("La Pokedex está vacía o es nula.");
        }
    } catch (Exception ex) {
        System.out.println(ex);
    }
}
}//llave final

 