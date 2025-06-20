package Clases;

import Interfaces.Notificador;

public class NotificadorCorreo implements Notificador{
    @Override
    public void notificar(Usuario usuario){
        System.out.println("Notificando por correo a "+ usuario.getNombre());
    }
    
}
