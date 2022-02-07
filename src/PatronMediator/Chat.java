
package PatronMediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {
    protected List<Mensaje> mensajes;

    public Chat() {
        this.mensajes = new ArrayList<Mensaje>();
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
    
    public abstract void Enviar(String mensaje, Usuario para, Usuario de);
    public abstract void Registrar(Usuario usuario);
    
}
