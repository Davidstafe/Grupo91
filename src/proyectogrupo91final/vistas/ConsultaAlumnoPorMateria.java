/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupo91final.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectogrupo91final.AccesoDatos.AlumnoData;
import proyectogrupo91final.AccesoDatos.InscripcionData;
import proyectogrupo91final.AccesoDatos.MateriaData;
import proyectogrupo91final.entidades.Alumno;
import proyectogrupo91final.entidades.Inscripcion;
import proyectogrupo91final.entidades.Materia;

/**
 *
 * @author HP
 */
public class ConsultaAlumnoPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private Alumno al;
    private AlumnoData ad;
    private InscripcionData ida;
    private Materia mat;
    private MateriaData matdat;
    private Inscripcion i;
    private Materia materiaSeleccionada; ///guardara la materia seleccionada,en el jcombobox
List<Materia> listaMateria;
    private MateriaData as;

    //constructor
    public ConsultaAlumnoPorMateria(MateriaData as, Alumno al/*, Materia mat*/){

        this.as = as;
        this.al = al;
       // this.mat=mat;
       
        initComponents();
      cargarCombo();
     
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();

        jLabel1.setText("Consulta de Alumnos por Materia");

        jLabel2.setText("Seleccione una Materia");

        jCBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriasActionPerformed(evt);
            }
        });

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriasActionPerformed

        materiaSeleccionada = (Materia) jCBMaterias.getSelectedItem();
        if (materiaSeleccionada != null) {
            actualizarTabla();
        }

    }//GEN-LAST:event_jCBMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCBMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    // End of variables declaration//GEN-END:variables

//    private void cargarCombo() {
//
//recorre la lista de materias y  las agrega al  combo box
//listaMateria = (List <Materia>)as.listarMateria();
//
//        for (Materia materia : listaMateria) {
//            jCBMaterias.addItem(mat);
//            / no puedo poner  en  propiedades /code / Materia  .
//            Serà ese el motivo por lo que no trae el listado?
//jCBMaterias.addItem (mat);
//        }
//
//    }

    private void cargarCombo(){
     
        
        List<Materia> listaMateria = matdat.listarMateria();
        
        for (Materia materia : listaMateria) {
        
          jCBMaterias.addItem(materia);
           
    } 
        
        
    }
    
    
    
    private void armarTabla() {

        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTableConsulta.setModel(modelo);
    }
    private void actualizarTabla() {
        ///setear la tabla para que quede limpi
        modelo.setRowCount(0);

        ///obtener los alumnos que cursan en la materia  seleccionada
        List<Alumno> listarIns = ida.obtenerAlumnosXMaterias(materiaSeleccionada.getIdMateria());

        //llenar la tabla con los alumnos 
        for (Alumno al : listarIns) {

            Alumno alumno = ad.buscarAlumnoID(al.getIdAlumno());
            if (alumno != null) {
                modelo.addRow(new Object[]{alumno.getIdAlumno(),alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
            }
        }

    }

}
