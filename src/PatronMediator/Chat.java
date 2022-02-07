
package PatronMediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {

    public Chat() {
        
    }

    public abstract List<String> getMensajesEnv(String user);
    public abstract List<String> getMensajesRec(String user);
    
    public abstract boolean Enviar(String mensaje, String para, String de);
    
}
