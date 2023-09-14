package proyectogrupo91final.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNac`, `activo`)" + " VALUES (?,?,?,?,?)";
        try {//preparacion de comando o secuencias
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//me pasa las claves generadas por alumno creado
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            //hasta aca se armo la sentencia insert a la base de datos
            ResultSet rs = ps.getGeneratedKeys();  //aca nos devuelve la clave generada en el paso anterior
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(rs.getInt(1)));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue guardado su alumno" + ex.getMessage());
        }

    }

    public AlumnoData(Alumno alu) {
    }

   
    public void buscarAlumnoID(Alumno alumno){
        
        
        String sql="SELECT * FROM alumno WHERE (inscripcion.idAlumno=?)"; // como identificamosa que id se refiere el usuario?
        

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ps.executeUpdate();
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                System.out.println("Id" + resultado.getInt("idAlumno"));
                System.out.println("DNI" + resultado.getInt("dni"));
                System.out.println("Apellido" + resultado.getString("apellido"));
                System.out.println("Nombre" + resultado.getString("nombre"));
                System.out.println("Estado" + resultado.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra alumno con ese id" + ex.getMessage());
        }
    }

    public void buscarAlumnoDni(Alumno alumno) {
        String sql = "SELECT * FROM alumno WHERE alumno.dni=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.executeUpdate();
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                System.out.println("Id" + resultado.getInt("idAlumno"));
                System.out.println("DNI" + resultado.getInt("dni"));
                System.out.println("Apellido" + resultado.getString("apellido"));
                System.out.println("Nombre" + resultado.getString("nombre"));
                System.out.println("Estado" + resultado.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra alumno con ese id" + ex.getMessage());
        }
    }


    public List<Alumno> listarAlumnos() { //ver video
        List<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT * FROM alumno WHERE activo=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Alumno alumno = new Alumno();
                System.out.println("Id" + resultado.getInt("idAlumno"));
                System.out.println("DNI" + resultado.getInt("dni"));
                System.out.println("Apellido" + resultado.getString("apellido"));
                System.out.println("Nombre" + resultado.getString("nombre"));
                System.out.println("Estado" + resultado.getBoolean("estado"));
                alumnos.add(alumno);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en generaciòn de listado" + ex.getMessage());
        }

        return alumnos;
    }

    public void elimimarAlumno(Alumno alumno) {
        try {
            String sql = "DELETE FROM alumno WHERE dni=?";
            PreparedStatement ps = con.prepareStatement(sql);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Alumno borrado exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en proceso" + ex.getMessage());
        }
    }

    public void bajaAlumno(Alumno alumno) {
        try {

            String sql = "UPDATE alumno SET estado=0 WHERE DNI=?";
            PreparedStatement ps = con.prepareStatement(sql);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Alumno dado de baja exitosamente");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en proceso" + ex.getMessage());;
        }
    }
}

