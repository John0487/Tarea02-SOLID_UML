package Clases;

import Clases.Boleto;
import Clases.Problema;
import Clases.Asiento;

public class Usuario {
    private String nombre;
    private int ID;
    
    public Boleto comprarBoleto(){
        System.out.println("Comprando boleto...");
        return null;
    }
    public Asiento seleccionarAsientos(){
        System.out.println("Seleccionando asiento...");
        return null;
    }
    public void reportarProblema(Problema p,AgenteDeSoporte a){
        System.out.println("Problema reportado: " + p.getDescripcion());
        a.atenderProblema(p);
    }
    
    public void realizarPago(Pago p){
        if (p.pagoValido()==true){
            System.out.println("Pago realizado con exito");
        } else {
            System.out.println("Vuelva a intentarlo");
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
