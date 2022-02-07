package PatronSingleton;

import PatronStrategy.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {

    Conexion conexion = Conexion.getInstancia();

    public List<String> obtenerUsuarios() {
        try {
            List<String> lista = new ArrayList<>();
            Connection con = conexion.conectar();
            PreparedStatement ps;
            String sql = "SELECT usuario FROM usuarios";
            ps = con.prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("usuario"));
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }
}
