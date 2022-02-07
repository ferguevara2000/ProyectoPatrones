
package PatronStrategy;

import PatronSingleton.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Persona implements IStrategy{

    private String user, clave;
    Conexion conexion = Conexion.getInstancia();

    public Persona() {
    }


    @Override
    public Boolean loguear(String user, String clave) {
        try {
            Connection con = conexion.conectar();
            PreparedStatement ps;
            String sql = "SELECT * FROM usuarios WHERE usuario = ? and clave = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, clave);;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void desloguear() {
        JOptionPane.showMessageDialog(null, "El usuario se ha desconectado");
    }
    
}
