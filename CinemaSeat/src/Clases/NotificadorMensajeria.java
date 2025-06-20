package Clases;

import Interfaces.Notificador;

public class NotificadorMensajeria implements Notificador{
    @Override
    public void notificar(Usuario usuario){
        System.out.println("Notificando por mensaje a "+ usuario.getNombre());
    }
}
