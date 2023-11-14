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
        System.out.println("1. continuar partida");
        System.out.println("2. nueva partida");
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
       //elegir pokemon
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
                    System.out.printf("combate");
                  
                
                case 2 ->
                    System.out.printf("captura");
                   
                case 3 ->
                    System.out.printf("pokemon");
                    
                case 4 ->
                    System.out.printf("pokedex");
                
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
        
      private void añadirPokemon(){
        System.out.printf("%nVamos a añadir un pokemon, por favor, conteste a lo sigiente:");
        String nombre=leerCadena();
  
         System.out.println("dime los ps del pokemon, si está sano 200");
         int ps=this.leerInt();
          System.out.println("dime algun movimiento que tenga el pokemon");
         String movimientos = leerCadena();
          System.out.println("diga el peso del pokemon");
         float peso = leerFloat();
          System.out.println("diga la altura del pokemon");
         float altura = leerFloat();
          System.out.println("diga el numero de pokedex del pokemon");
         int num_pokedex = leerInt();
          System.out.println("diga el nivel del pokemon");
         int nivel = leerInt();
 
      c.añadirPokemon(nombre, ps, movimientos, peso, altura, num_pokedex, nivel);

      
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
                    this.añadirPokemon();
                  
                case 2 ->
                    this.runMenu();
                    
                case 3 ->
                    salir = siOno();


            }
        } while (!salir);
    
    }
    private void tablaFiguras(){
        var ldt = c.tablaFigura();
        try {
            System.out.println(ldt);
        } catch (Exception ex) {
            System.out.println(ex);
        }
       
        }
 public void importarDesdeTxt(String ruta) {
        c.importarDesdeTxt(ruta);
    }
}//llave final

/*     do{ 
            System.out.println("introduce el nombre para comprobar que no existe ya");
            nombre = leerCadena();
            
        }while(c.estaSiONo(nombre));
*/