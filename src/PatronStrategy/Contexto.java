
package PatronStrategy;

public class Contexto {
    
    private IStrategy strategy;

    public Contexto(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public Boolean validarUser(String user, String clave){
        return this.strategy.loguear(user, clave);
    }
    
    public void salir(){
        this.strategy.desloguear();
    }
}
