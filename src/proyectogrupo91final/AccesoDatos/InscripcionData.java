/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupo91final.AccesoDatos;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class InscripcionData {
    
    private Connection con=null;
    private MateriaData matData=new MateriaData();
    private AlumnoData alumData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public InscripcionData(MateriaData matData, AlumnoData alumData) {
        this.matData = matData;
        this.alumData = alumData;
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion( nota,idAlumno, idMateria)" + " VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));//esta en el resulset y esta en la primera fila de la columna
//                insc.setIdInscripcion(rs.getInt("idAlumno"));
//                insc.setIdInscripcion(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Inscripcion  realizada");
            } else {
                JOptionPane.showMessageDialog(null, "dato no ingresado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos" + ex.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripcion() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT `idInscripcion`, `nota`, `idAlumno`, `idMateria` FROM `inscripcion`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscrip = new Inscripcion();
                inscrip.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alum = alumData.buscarAlumnoID(rs.getInt("idAlumno"));//recupero alumno de alumnoData luego hago el resulset
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                inscrip.setAlumno(alum);// seteamos lo encontrado en las tablas anteriores
                inscrip.setMateria(mat);
                inscrip.setNota(rs.getDouble("nota"));//este esta en la fila de la tabla inscripcion
                inscripciones.add(inscrip);

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        Inscripcion inscrip = null;
        String sql = "SELECT * FROM Inscripcion where idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inscrip = new Inscripcion();
                inscrip.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = alumData.buscarAlumnoID(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "alumno encontardo");
                inscrip.setAlumno(alu);
                inscrip.setMateria(mat);
                inscrip.setNota(rs.getDouble("nota"));
                inscripciones.add(inscrip);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion join materia on inscripcion.idMateria=materia.idMateria and inscripcion.idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materias.add(materia);

            }
ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos");
        }

        return materias;
    }

    public List<Materia> obtenerMateriasNoCursada(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM `inscripcion` JOIN materia on inscripcion.idMateria=materia.idMateria  and NOT inscripcion.idAlumno=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setNombre(rs.getString("nombre"));
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de datos");
        }
    
    
  return materias;  
}
   
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM `inscripcion` WHERE `idAlumno`=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int borrar = ps.executeUpdate();
            if (borrar > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");

            } else {
                JOptionPane.showMessageDialog(null, "Inscripcion no borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }

    }

    public void actualizarNota(double nota, int idAlumno, int idMateria) {
        String sql = "UPDATE inscripcion SET nota= ? WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int completo = ps.executeUpdate();
            if (completo > 0) {
                JOptionPane.showMessageDialog(null, "Nota modificada");

            } else {
                JOptionPane.showMessageDialog(null, "nota no cargada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos");
        }

    }

    public List<Alumno> obtenerAlumnosXMaterias(int idMateria) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno JOIN inscripcion on alumno.idAlumno=inscripcion.idAlumno and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumno.setFechaNac(rs.getDate("FechaNac").toLocalDate());
                alumnos.add(alumno);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener materias"+ex.getMessage());
        }

        return alumnos;
    }
}
