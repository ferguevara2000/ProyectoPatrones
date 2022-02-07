
package PatronStrategy;

public class Persona implements IStrategy{

    private String user, clave;

    public Persona(String user, String clave) {
        this.user = user;
        this.clave = clave;
    }

    @Override
    public Boolean loguear(String user, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desloguear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
