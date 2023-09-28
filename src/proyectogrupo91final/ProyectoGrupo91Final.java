
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
//        Inscripcion q=new Inscripcion();
        Alumno alu=new Alumno();
        Materia mat=new Materia();
//        
//        for (Materia materia: d.obtenerMateriasNoCursada(5)) {
//            System.out.println("nombre = "+materia.getNombre());
//        }


//
//// Inscripcion de alumno por materia
//        for (Alumno alumno : d.obtenerAlumnosXMaterias(1)) {//empieza de cero a contar el idAlumno
//            System.out.println("nombre del alumno: "+alumno.getApellido());
//        }
//        
//         
//        for (Materia  listarM : d.obtenerMateriasCursadas(5)) {
//                
//            System.out.println(""+ listarM.getNombre());
//            System.out.println(""+listarM.getAnioMateria());
//            System.out.println(""+listarM.getIdMateria());
//        }
//


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
        
       
//        for (Materia  listarM : a.listarMateria()) {
//                
//            System.out.println(""+ listarM.getNombre());
//            System.out.println(""+listarM.getAnioMateria());
//            System.out.println(""+listarM.getIdMateria());
//        }

//-------------------------------------------------------------------
//       //modificar nota
//        Alumno leon=s.buscarAlumnoID(3);
//        Materia Informatica45=a.buscarMateria(5);
//         Inscripcion q=new Inscripcion( 2.2,leon,  Informatica45);
//   d.guardarInscripcion(q);
     
   //---------------------------------------------------------------
//   //BUSCA alumno por id de alumno
//   
//        for (Inscripcion inscripcion : d.obtenerInscripcionPorAlumno(4) ) {
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//            System.out.println("Materia "+inscripcion.getMateria().getNombre());
//        }
//----------------------------------------------------------------------------------------------


//d.actualizarNota(8.2, 3, 5);
//------------------------------------------------------------------------------------------
//lista de materias           

for (Materia materia : a.listarMateria()) {
            System.out.println(materia);
        }
//}

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
        
        




    }
}