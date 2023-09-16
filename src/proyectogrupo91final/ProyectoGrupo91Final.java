
package proyectogrupo91final;

import java.sql.Connection;
import proyectogrupo91final.AccesoDatos.AlumnoData;
import proyectogrupo91final.AccesoDatos.Conexion;
import proyectogrupo91final.AccesoDatos.MateriaData;
import proyectogrupo91final.entidades.Alumno;
import proyectogrupo91final.entidades.Materia;

public class ProyectoGrupo91Final {

   
    public static void main(String[] args) {
        
        
        Connection con= Conexion.getConexion();



       /*Materia a= new Materia(1,"inf", 1, true);
       b.guardarMateria(a);
       System.out.println(a);
        */
       
       
       /* BUSCAR MATERIA: CORRECTO
       MateriaData b= new MateriaData();
       b.buscarMateria(1);
       /*/


       //MODIFICAR MATERIA:
       Materia INFO;
        INFO = new Materia(6, "infor", 5, true);
       MateriaData b= new MateriaData();
       b.modificarMateria(INFO);
       

        
     
       /* ESTO ES DE ALGUNO? O SE PUEDE ELIMINAR?¿
        Materia materiaEncontrada = b.buscarMateria(6);
        System.out.println("Encontrada");
        
        System.out.println(a);/*/
        
        

}
}
