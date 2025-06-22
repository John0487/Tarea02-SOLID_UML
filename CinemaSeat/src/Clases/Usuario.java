package Clases;

import java.util.List;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private int ID;
    
    
    public Funcion seleccionarFunción(List<Funcion> l_funciones){
        int i=1;
        System.out.println("Lista de Funciones: ");
        for (Funcion f: l_funciones){
            System.out.println(i + " "+ f.getNombre());
            i++;
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el número de la función que desea ver");
        int n_fun= sc.nextInt();
        return l_funciones.get(n_fun);
    }
    
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
    
    public void ingresarAlSistema(){
        System.out.println("Ingresando al sistema");
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
