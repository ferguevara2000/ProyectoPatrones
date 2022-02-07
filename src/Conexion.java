
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author jeanjp
 */
public class Conexion {
    
    private static Conexion instancia;
    private Connection connect;
    
    private Conexion(){}
    
    public static Conexion getInstancia() {
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/.....", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return connect;
    }
    
    public void desconectar() {
        try {
            connect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
