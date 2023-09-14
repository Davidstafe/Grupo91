
package proyectogrupo91final.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.Materia;



    public class MateriaData {
    private Connection con =null;

    public MateriaData() {
    con=Conexion.getConexion();
    }
    
   /* public void guardarMateria(Materia materia){
    
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

        
    }*/
    
        public Materia buscarMateria(int idMateria) {
            Materia materia= null;
            String sql = "SELECT nombre, anioMateria FROM materia WHERE idAlumno = ?)";

           

            try {
               PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1,idMateria);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                     materia = new Materia();
                    materia.setIdMateria(idMateria);
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("anioMateria"));
                    System.out.println("materia encontrada");

                } else {
                    
                    JOptionPane.showMessageDialog(null, "No existe la materia");

                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
            }
            return materia;

        }
    
//        public void modificarMateria(Materia materia){
//            
//            String 
//            
//            
//             
        }
        
        
    
    
    

