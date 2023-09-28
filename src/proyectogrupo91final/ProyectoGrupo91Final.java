
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
        Alumno alu = new Alumno();
        Materia mat = new Materia();
//  -----------------------+++++++++++++++++++++++++--------------------------      
//        //Obtener materias cursadas por idAlumno
//        for (Materia materia : d.obtenerMateriasCursadas(5)) {
//            System.out.println("nombre : " + materia.getNombre());
//            System.out.println("Año : " + materia.getAnioMateria());
//            System.out.println("idMateria : " + materia.getIdMateria());
//        }
//++++++++++++++++++++++++-----------------------------------+++++++++++++++++++
 //Obtener materias Nocursadas por idAlumno
     

//for (Materia materia : d.obtenerMateriasNoCursada(5)) {
//            System.out.println("nombre : " + materia.getNombre());
//            System.out.println("Año : " + materia.getAnioMateria());
//            System.out.println("idMateria : " + materia.getIdMateria());
//        }
//++++++++++++++++++++----------------------------------++++++++++++++++++++++++++++++++----
//
//// Inscripcion de alumno por materia utilizando el idMateria
//
//
//        for (Alumno alumno : d.obtenerAlumnosXMaterias(2)) {//empieza de cero a contar el idAlumno
//            System.out.println("nombre del alumno: "+alumno.getApellido()+" "+alumno.getNombre());
//            
//        }
//////////////********************************++++++++++++++++++++++++++----------------------------
//-------------------------------------------------------------------
////       //guardar Inscripcion
//        alu = s.buscarAlumnoID(20);
//        mat = a.buscarMateria(3);
//        Inscripcion q = new Inscripcion(2.2, alu, mat);
//        d.guardarInscripcion(q);

        //---------------------------------------------------------------
//   //Busca alumno por id de alumno
//   
//        for (Inscripcion inscripcion : d.obtenerInscripcionPorAlumno(5)) {
//            System.out.println("id " + inscripcion.getIdInscripcion());
//            System.out.println("Apellido : " + inscripcion.getAlumno().getApellido());
//            System.out.println("nombre : " + inscripcion.getAlumno().getNombre());
//            System.out.println("Materia : " + inscripcion.getMateria().getNombre());
//           
//        }
//----------------------------------------------------------------------------------------------
//
//////modifica la nota en una inscripcion) nota,idAlumno,idMateria
//d.actualizarNota(6.5, 3, 2);
//------------------------------------------------------------------------------------------

//+++++++++++++++++++++++++++Metodos de materia-----------------------------------------------------



         


// 
       mat= new Materia("inf", 6, true);
       a.guardarMateria(mat);
       System.out.println("materias"+ mat);
        
       
    
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


//for (Materia materia : a.listarMateria()) {
//            System.out.println(materia);
//        }
//--------------------------+++++++++++++++++++++++----------------------------------


//      // Materia a= new Materia(1,"inf", 1, true);


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