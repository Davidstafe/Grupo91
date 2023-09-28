package proyectogrupo91final.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void MateriaData(Materia materia) {

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre,anioMateria,estado)"
                + "VALUES(?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//me pasa las claves generadas por alumno creado

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();  //aca nos devuelve la clave generada en el paso anterior
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guarda Materia" + ex.getMessage());
        }

    }

    public Materia buscarMateria(int idMateria) {

        String sql = "SELECT nombre, anioMateria FROM materia WHERE materia.idMateria = ? ";
        Materia materia = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);//faltaba para que me guarde el id y no tire alarma 1402
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setEstado(true);
//                System.out.println("materia encontrada: "+materia.getNombre());

            } else {

//                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return materia;

    }

    public void modificarMateria(Materia materia) {

        try {
            String sql = "UPDATE materia SET nombre = ?, anioMateria = ?,estado=? WHERE materia.idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente" );

            } else {

//                JOptionPane.showMessageDialog(null, "Materia no existe" );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia ");
        }

    }

    public void eliminarMateria(int idMateria) {

        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 1) {

                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia" + ex);
        }

    }

    public List<Materia> listarMateria() {

        List<Materia> mat = new ArrayList<>();

        String sql = "Select * From materia where estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                mat.add(materia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la matriz materia");
        }
        return mat;
    }
}
