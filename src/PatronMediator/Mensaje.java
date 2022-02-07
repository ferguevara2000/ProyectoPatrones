
package PatronMediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {
    
    private DateTimeFormatter fecha = DateTimeFormatter.ofPattern("hh:mm");
    public String De;
    public String Para;
    public String texto;

    public Mensaje() {
        
    }

    public DateTimeFormatter getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Mensaje a las " + fecha.format(LocalDateTime.now()) + " de  " + De + " - para " + Para + " -> " + texto;
    }
    
}
