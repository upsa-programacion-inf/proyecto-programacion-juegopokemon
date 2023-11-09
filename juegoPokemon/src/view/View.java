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
                    System.out.printf("funciona");
                  
                
                case 2 ->
                    System.out.printf("funciona bien");
                   
                case 3 ->
                    System.out.printf("funciona genial");
                
               case 5 ->
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
        System.out.println("5. Salir del programa");
      
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
   
   
        

   
        
   
}//llave final