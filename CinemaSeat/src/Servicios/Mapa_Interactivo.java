package Servicios;
import Clases.Asiento;
import Clases.Asiento;
import Enums.EstadoAsiento;
import java.util.List;

public class Mapa_Interactivo {
    private List<Asiento> asientos;
    
    public List<Asiento> getAsientosDisponibles(){
        return this.asientos;
    }
    public void actualizarEstadoAsiento(Asiento asiento, EstadoAsiento estado){}
}
