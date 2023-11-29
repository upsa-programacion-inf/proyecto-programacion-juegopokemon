
package model;

public class Movimiento {
    private String nombreMovimiento;
    private int daño;
    private TipoMovimiento tipo;

  
    public Movimiento(String nombreMovimiento, int daño, TipoMovimiento tipo) {
        this.nombreMovimiento = nombreMovimiento;
        this.daño = daño;
        this.tipo = tipo;
    }

public enum TipoMovimiento {
    FUEGO,
    PLANTA,
    AGUA,
    NORMAL
}

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public int getDaño() {
        return daño;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }
    

}