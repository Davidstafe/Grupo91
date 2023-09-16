package proyectogrupo91final.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia){
    
        String sql="INSERT INTO materia(nombre,anio,estado)"
                +"VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//me pasa las claves generadas por alumno creado
            
            ps.setString(1,materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3,materia.isEstado());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guarda Materia" +ex.getMessage());
        }

        
    }
    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String sql = "SELECT nombre, anioMateria FROM materia WHERE idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);//faltaba para que me guarde el id y no tire alarma 1402
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                System.out.println("materia encontrada: "+materia.getNombre());

            } else {

                JOptionPane.showMessageDialog(null, "No existe la materia");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return materia;

    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE alumno SET materia (nombre = ?, anioMateria = ?, WHERE idMateria = ? )";

        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente" + ps);

            } else {

                JOptionPane.showMessageDialog(null, "Materia no existe" + ps);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ps);
        }
        
    }
    
    public void eliminarMateria(int id)  {
        
        try{
            String sql="UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila= ps.executeUpdate();
            if(fila>1){
                
                JOptionPane.showMessageDialog(null,"Se elimino correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex);    
        }
        
    } 

    public List<Materia> listarMateria()  {
        
      List<Materia> mat = new ArrayList<>();
        
      String sql = "Select * From materia where estado = 1";
      
      try{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                mat.add(materia);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la matriz materia");
        }return mat;
    }
}
