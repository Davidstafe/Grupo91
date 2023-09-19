
package proyectogrupo91final;

import java.sql.Connection;
import proyectogrupo91final.AccesoDatos.*;
import proyectogrupo91final.entidades.*;
public class ProyectoGrupo91Final {

    public static void main(String[] args) {

       
        Connection con = Conexion.getConexion();
        MateriaData a = new MateriaData();
        AlumnoData s = new AlumnoData();
        InscripcionData d = new InscripcionData();

        
        
       



       /*Materia a= new Materia(1,"inf", 1, true);
       b.guardarMateria(a);
       System.out.println(a);
        */
       
       
       /* BUSCAR MATERIA: CORRECTO
       MateriaData b= new MateriaData();
       b.buscarMateria(1);
       /*/


       //MODIFICAR MATERIA:
//       Materia INFO;
//        INFO = new Materia(6, "infor", 5, true);
//       MateriaData b= new MateriaData();
//       b.modificarMateria(INFO);

        //Listar materia:
        
       
        for (Materia  listarM : a.listarMateria()) {
                
            System.out.println(""+ listarM.getNombre());
            System.out.println(""+listarM.getAnioMateria());
            System.out.println(""+listarM.getIdMateria());
        }
       
//        Alumno Karen=s.buscarAlumnoID(3);
//        Materia Inf=a.buscarMateria(5);
//         Inscripcion q=new Inscripcion( 5.3,Karen,  Inf);


//       d.guardarInscripcion(q);
     
//        for (Inscripcion inscripcion : d.obtenerInscripcionPorAlumno(4) ) {
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//            System.out.println("Materia "+inscripcion.getMateria().getNombre());
//        }







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

        
     
       /* ESTO ES DE ALGUNO? O SE PUEDE ELIMINAR?¿
        Materia materiaEncontrada = b.buscarMateria(6);
        System.out.println("Encontrada");
        
        System.out.println(a);/*/
        
        




