package Servicios;
import Clases.Asiento;
import static Enums.EstadoAsiento.Disponible;
import java.util.List;

public class Temporizador {
    private int tiempo;
    
    public void LiberarAsientos(List<Asiento> asientos){}
    public int cantidadAsientosDisponibles(List<Asiento> asientos){
        int i=0;
        for (Asiento a: asientos){
            if (a.getEstadoAsiento()==Disponible){
                i++;
            }
        }
        return i;
    }
    
    public void volverAlInicio(int tiempo){
        this.tiempo=tiempo;
    }
    
    public boolean tiempoAcabado(){
        if (this.tiempo==0){
            return true;
        } else {
            return false;
        }
    }
    
}
