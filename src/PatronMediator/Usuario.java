
package PatronMediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    
    String nombre;
    List<Mensaje> mensajes;
    Chat chat;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.mensajes = new ArrayList<Mensaje>();
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void Enviar(String mensaje, String para){
        chat.Enviar(mensaje, para, this.getNombre());
    }
    
    public void Recibir(Mensaje msg){
        mensajes.add(msg);
    }
    
    
}
