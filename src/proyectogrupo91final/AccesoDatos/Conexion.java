
package proyectogrupo91final.AccesoDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="ulp";
    private static final String USUARIO="root";
    private static final String PASS="";
    private static Connection   con ;
    
    private Conexion() {}
     
    public static Connection getConexion() {

        if (con == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con= DriverManager.getConnection(URL+DB,USUARIO,PASS);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
            
        }
        return con;
    
    }
    
}
//equipo 91