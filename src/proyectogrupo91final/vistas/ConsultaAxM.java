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

public class ConsultaAxM extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private Alumno al;
    private AlumnoData ad;
    private InscripcionData ida;
    private Materia mat;

    private Inscripcion i;
    private Materia materiaSeleccionada; ///guardara la materia seleccionada,en el jcombobox

    private MateriaData as;
    List<Alumno> lisAlum;

    public ConsultaAxM(MateriaData as, AlumnoData ad) {

        this.as = as;
        this.al = al;
        this.ad = ad;

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
        jBSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Consulta de Alumno por Materia ");

        jLabel2.setText("Seleccione Materia ");

        jCBMaterias.setEditable(true);
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

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jBSalir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriasActionPerformed
        materiaSeleccionada = (Materia) jCBMaterias.getSelectedItem();
        if (materiaSeleccionada != null) {
            actualizarTabla();
           
        }
    }//GEN-LAST:event_jCBMateriasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Materia> jCBMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    // End of variables declaration//GEN-END:variables

 private void cargarCombo() {

        List<Materia> listMat = as.listarMateria();

        for (Materia materia : listMat) {

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
        //setear la tabla para que quede limpia
        modelo.setRowCount(0);
        materiaSeleccionada = (Materia) jCBMaterias.getSelectedItem();
        //obtener los alumnos que cursan en la materia  seleccionada
        List<Alumno> listarAl = (List) ida.obtenerAlumnosXMaterias(materiaSeleccionada.getIdMateria());

        // llenar la tabla con los alumnos 
        for (Alumno al : listarAl) {

            Alumno alumno = ad.buscarAlumnoID(al.getIdAlumno());
            if (alumno != null) {
                modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
            }
        }

    }
}
