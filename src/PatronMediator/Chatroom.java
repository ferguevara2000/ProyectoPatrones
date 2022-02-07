package PatronMediator;

import PatronSingleton.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Chatroom extends Chat {

    Conexion conexion = Conexion.getInstancia();

    public Chatroom() {

    }

    @Override
    public boolean Enviar(String mensaje, String para, String de) {

        Mensaje msg = new Mensaje();
        msg.De = de;
        msg.Para = para;
        msg.texto = mensaje;
        try {
            Connection con = conexion.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO mensajes values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, msg.toString());
            ps.setString(2, para);
            ps.setString(3, de);
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
    }

    @Override
    public List<String> getMensajesEnv(String user) {
        try {
            List<String> lista = new ArrayList<>();
            Connection con = conexion.conectar();
            PreparedStatement ps;
            String sql = "SELECT mensaje FROM mensajes WHERE usu_env = ?";
            ps = con.prepareStatement(sql);;
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("mensaje"));
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }
    
    @Override
    public List<String> getMensajesRec(String user) {
        try {
            List<String> lista = new ArrayList<>();
            Connection con = conexion.conectar();
            PreparedStatement ps;
            String sql = "SELECT mensaje FROM mensajes WHERE usu_rec = ?";
            ps = con.prepareStatement(sql);;
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("mensaje"));
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }
}
