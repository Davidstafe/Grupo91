
package proyectogrupo91final.entidades;


public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private Double nota;

    public Inscripcion(Alumno alumno, Materia materia, Double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, Double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc= idInscripcion +" "+ alumno.getApellido()+ ", "+alumno.getNombre();
        return insc;
    }
    
    
    
}
