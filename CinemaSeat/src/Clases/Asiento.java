package Clases;

import Enums.EstadoAsiento;
import Enums.TipoDeAsiento;


public class Asiento {
    private Boleto boleto_asociado;
    private int n_asiento;
    private TipoDeAsiento tipo;
    private EstadoAsiento estado;
    
   public EstadoAsiento getEstadoAsiento(){
       return this.estado;
   }
    
}
