/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupo91final.AccesoDatos;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectogrupo91final.entidades.Inscripcion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectogrupo91final.entidades.Alumno;
/**
 *
 * @author HP
 */
public class InscripcionData {
    
    private Connection con=null;
    private MateriaData matData;
    private AlumnoData alumData;

    public InscripcionData() {
        con=Conexion.getConexion();
        }

    public InscripcionData(MateriaData matData, AlumnoData alumData) {
        this.matData = matData;
        this.alumData = alumData;
    }
    
    public void guardarInscripcion(Inscripcion insc){
       String sql= "INSERT INTO `inscripcion`( `nota`,`idAlumno`, `idMateria`)"+" VALUES (?,?,?)";
        try { 
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3,insc.getMateria().getIdMateria());
            
            ps.executeUpdate();
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                 insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setIdInscripcion(rs.getInt("idAlumno"));
                insc.setIdInscripcion(rs.getInt("idMateria"));
          JOptionPane.showMessageDialog(null, "Inscripcion  realizada");
            }else{
                JOptionPane.showMessageDialog(null, "dato no ingresado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos");
        }
        
    }
 public List<Inscripcion> obtenerInscripcion(){
    List<Inscripcion> inscripciones =new ArrayList<>();
    String sql="SELECT `idInscripcion`, `nota`, `idAlumno`, `idMateria` FROM `inscripcion`";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
          ResultSet rs=ps.executeQuery();
            while (rs.next()) {  
                Inscripcion inscripcion= new Inscripcion();
                System.out.println("idInscripcion "+rs.getInt("idInscripcion"));
                System.out.println("nota "+rs.getDouble("nota"));
                System.out.println("idAlumno "+rs.getInt("idAlumno"));
                System.out.println("idMateria "+rs.getInt("idMateria"));
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return inscripciones;
 }
 
    
    public List<Inscripcion> obtenerInscripcionPorAlumno() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        Inscripcion inscripcion = null;
        String sql = "SELECT * FROM Inscripcion where idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,inscripcion.getAlumno().getIdAlumno());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inscripcion = new Inscripcion();
               
                System.out.println("idInscripcion "+rs.getInt("idInscripcion"));
                System.out.println("nota "+rs.getDouble("nota"));
                System.out.println("idAlumno "+rs.getInt("idAlumno"));
                System.out.println("idMateria "+rs.getInt("idMateria"));
             
            }

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error");
        }
        return inscripciones;
    }
    
}

