
package controller;
import model.Model;

public class Controller {
    Model m= new Model();
    public String leerCadena(){
        return m.leerCadena();
    }
    public int leerInt(){
        return m.leerInt();
    }
     public float leerFloat(){
        return m.leerFloat();
    }
   public boolean siOno(){
        return m.siOno();
    }
   
}
