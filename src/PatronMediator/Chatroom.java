
package PatronMediator;

import java.util.Hashtable;

public class Chatroom extends Chat{
    
    Hashtable<String,Usuario> participantes;

    public Chatroom() {
        this.participantes =  new Hashtable<String ,Usuario>();
    }
    
    

    @Override
    public void Enviar(String mensaje, Usuario para, Usuario de) {
        Mensaje msg = new Mensaje();
        msg.De = de;
        msg.Para = para;
        msg.texto = mensaje;
        
        if (participantes.containsKey(para.nombre)) {
            participantes.get(para.nombre).Recibir(msg);
            mensajes.add(msg);
        }
    }

    @Override
    public void Registrar(Usuario usuario) {
        if (!participantes.containsKey(usuario.nombre)) {
            participantes.put(usuario.nombre, usuario);
        }
    }
    
}
