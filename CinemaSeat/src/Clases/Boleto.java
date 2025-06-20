
package Clases;

import Clases.Sala;

public abstract class Boleto {
    protected Sala sala_asociada;
    protected int precio;
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
}
