package Clases;

import Enums.EstadoProblema;

public class Problema {
    private Usuario usuario;
    private String descripcion;
    private EstadoProblema estado;
    
    public void escalar(){
        System.out.println("Escalando Problema...");
    }

    public String getDescripcion() {
        return descripcion;
    }    
}
