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
                    System.out.printf("funciona bien");
                   
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
   private String leerCadena(String menu){
        return c.leerCadena();
    }
   private int leerInt(){
        return c.leerInt();
    }
   private float leerFloat(){
        return c.leerFloat();
    }
   public boolean siOno(){
        return c.siOno();
    }
   
   public void nuevaPartida(){
       System.out.println("Bienvenido al Mundo Pókemon");
       System.out.println("Acabas de comenzar tu aventura en esta nueva y extraña región");
       System.out.println("Pero no puedes hacerlo solo, NECESITARÁS UN POKEMON QUE TE ACOMPAÑE!!!");
       //elegir pokemon
       System.out.println("Tambien necesitarás una pokedex, toma:");
       System.out.println("Dicho esto que comienze la aventura");
       this.continuarPartida();
}
    public void continuarPartida(){
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

   public static void muestraMenu() {
        System.out.println("Menú:");
        System.out.println("1. combate");
        System.out.println("2. captura");
        System.out.println("3. pokemon");
        System.out.println("4. pokedex");
        System.out.println("5. volver al inicio");
      
    }         
        
   
}//llave final