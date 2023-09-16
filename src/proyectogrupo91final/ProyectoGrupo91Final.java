
package proyectogrupo91final;

import java.sql.Connection;
import proyectogrupo91final.AccesoDatos.*;
//import proyectogrupo91final.AccesoDatos.Conexion;
//import proyectogrupo91final.AccesoDatos.MateriaData;
import proyectogrupo91final.entidades.*;
//import proyectogrupo91final.entidades.Materia;

public class ProyectoGrupo91Final {

   
    public static void main(String[] args) {
       
        Connection con = Conexion.getConexion();
        MateriaData a = new MateriaData();
        AlumnoData s = new AlumnoData();
        InscripcionData d = new InscripcionData();
       
        Alumno Karen=s.buscarAlumnoID(3);
        Materia Inf=a.buscarMateria(5);
         Inscripcion q=new Inscripcion( 5.3,Karen,  Inf);

       d.guardarInscripcion(q);
     

    }
}

//      // Materia a= new Materia(1,"inf", 1, true);
//
//       MateriaData b= new MateriaData();
//       
//               
//       b.buscarMateria(1);
////       b.guardarMateria(a);
//       
//
////        System.out.println(a);
////        
////      b.buscarMateria();
//      // System.out.println(a);
//      
//       // Materia materiaEncontrada = b.buscarMateria(6);
//        //System.out.println("Encontrada");
//        
//       // System.out.println(a);
//        
//      
