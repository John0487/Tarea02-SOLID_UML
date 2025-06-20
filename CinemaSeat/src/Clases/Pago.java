package Clases;

import Enums.TipoDePago;

public class Pago {
    private Usuario usuario;
    private double monto;
    private TipoDePago tipo;
    
    public boolean pagoValido(){
        return monto>0;
    }
    
}
