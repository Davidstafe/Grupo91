/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupo91final.vistas;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectogrupo91final.AccesoDatos.*;

import proyectogrupo91final.entidades.*;

public class cargaDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private AlumnoData ad;
    private MateriaData as;
    private InscripcionData ida;
    private Materia mat;
    private Inscripcion i;
    private Alumno alumnoSeleccionado; ///guardara el alumno select,en el jcombobox

    public cargaDeNotas(AlumnoData ad, InscripcionData ida,MateriaData as) {

        initComponents();

        this.ad = ad;
        this.ida = ida;
        this.as=as;
//        ///Alumno alu = (Alumno) jcbAlumno.getSelectedItem();
        //List<Alumno> listaAlumnos = ad.listarAlumnos();
       // List<Materia> listarMat = ida.obtenerMateriasCursadas(alu.getIdAlumno());
        
        cargarCombo();
        armarTabla();
        //actualizarTabla();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListado = new javax.swing.JTable();
        jcbAlumno = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno");

        jTListado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTListado);

        jcbAlumno.setEditable(true);
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(0, 197, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
        //Alumno listarM = (Alumno) jcbAlumno.getSelectedItem();
        alumnoSeleccionado=(Alumno)jcbAlumno.getSelectedItem();
        if(alumnoSeleccionado!= null){
            actualizarTabla();
        }
        ///List<Materia> listarMat = (Materia)jTListado.getSelectedColumn();
    }//GEN-LAST:event_jcbAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListado;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {///COMPLETO  

       ///recorre la lista de alumno y los agrega en el jcomboBox
        List<Alumno> listaAlumnos = ad.listarAlumnos();
             
        for (Alumno alumno : listaAlumnos) {
            jcbAlumno.addItem(alumno);

        }

    }

    private void armarTabla() {

        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("nota");
        jTListado.setModel(modelo);

        
    }

//    private void rellenarTabla() {
//        
//        for(Materia materia: as.listarMateria()){
//        ///modelo.addRow(new Object[]{
////        materia.getIdMateria(),
////        materia.getNombre(),
////        i.getNota()});
//            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre()
//                    ,i.getNota()});
//        }
//    }
//    
    private void actualizarTabla(){
        ///limpiar la tabla 
        modelo.setRowCount(0);
        
        ///obtener las materias cursadas por el alumno seleccionado
        
        List<Inscripcion> listarIns= ida.obtenerInscripcionPorAlumno(alumnoSeleccionado.getIdAlumno());
        
        //llenar la tabla con las materias y notas correspondientes
        
        for(Inscripcion inscripcion : listarIns){
            
            Materia materia = as.buscarMateria(inscripcion.getIdInscripcion());
            if(materia != null){
                modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),inscripcion.getNota()});
                        }
            }
                
        }
    }

