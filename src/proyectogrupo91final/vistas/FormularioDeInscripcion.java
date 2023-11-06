
package proyectogrupo91final.vistas;


import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import proyectogrupo91final.AccesoDatos.*;
import proyectogrupo91final.entidades.*;

/**
 *
 * @author david
 */
public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

    private ArrayList<Materia> lisM;
    private ArrayList<Alumno> lisA;

    private InscripcionData insc;
    private AlumnoData alu;
    private MateriaData mat;

    private DefaultTableModel modelo;

    public FormularioDeInscripcion() {
        initComponents();

        mat = new MateriaData();
        insc = new InscripcionData();
        alu = new AlumnoData();

        lisA = (ArrayList<Alumno>) alu.listarAlumnos();
        modelo = new DefaultTableModel();
        cargarAlumnos();
        armarTitulos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRMateriasInscriptas = new javax.swing.JRadioButton();
        jRMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFormularioDeInscripciòn = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 218, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripciòn");

        jLabel2.setText("Seleccione un alumno");

        JCBAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCBAlumnoMouseClicked(evt);
            }
        });
        JCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Listado de materias");

        buttonGroup1.add(jRMateriasInscriptas);
        jRMateriasInscriptas.setText("Materias inscriptas");
        jRMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasInscriptasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRMateriasNoInscriptas);
        jRMateriasNoInscriptas.setText("Materias no Inscriptas");
        jRMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jTFormularioDeInscripciòn.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTFormularioDeInscripciòn);

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnular.setText("Anular Inscripciòn");
        jBAnular.setEnabled(false);
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

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
                .addGap(29, 29, 29)
                .addComponent(jRMateriasInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRMateriasNoInscriptas)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(JCBAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAnular)
                .addGap(78, 78, 78)
                .addComponent(jBSalir)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMateriasInscriptas)
                    .addComponent(jRMateriasNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnular)
                    .addComponent(jBSalir))
                .addGap(218, 218, 218))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
    int select=jTFormularioDeInscripciòn.getSelectedRow();
        if (select!=-1) {
            Alumno a=(Alumno)JCBAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(select, 0);
            String nombre=(String)modelo.getValueAt(select, 1);
            
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void JCBAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCBAlumnoMouseClicked
        
    }//GEN-LAST:event_JCBAlumnoMouseClicked

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAnularActionPerformed

    private void jRMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasInscriptasActionPerformed
        borrarFilas();
        jRMateriasNoInscriptas.setSelected(false);
        datosInscriptos();

        jBInscribir.setEnabled(false);
        jBAnular.setEnabled(true);
        
        
    }//GEN-LAST:event_jRMateriasInscriptasActionPerformed

    private void jRMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasNoInscriptasActionPerformed
        borrarFilas();
        jRMateriasInscriptas.setSelected(false);
        datosNoInscriptos();
       jBAnular.setEnabled(false);
        jBInscribir.setEnabled(true);
//        Inscripcion a=new Inscripcion();
//       jBInscribir.add(insc.guardarInscripcion());

    }//GEN-LAST:event_jRMateriasNoInscriptasActionPerformed

    private void JCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBAlumnoActionPerformed
    private void cargarAlumnos() {
        for (Alumno alumnos : lisA) {
            JCBAlumno.addItem(alumnos);
        }

    }

    private void armarTitulos() {

        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("idAlumno");
        jTFormularioDeInscripciòn.setModel(modelo);
    }

    private void borrarFilas() {
        int ind = modelo.getRowCount() - 1;
        for (int i = ind; i > 0; i--) {
            modelo.removeRow(i);
        }
    
}
 
 private void datosInscriptos(){
     Alumno a=(Alumno) JCBAlumno.getSelectedItem();
     lisM=(ArrayList) insc.obtenerMateriasCursadas(a.getIdAlumno());
     for (Materia materia : lisM) {
         modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnioMateria()});
     }
 }
      private void datosNoInscriptos(){
     Alumno a=(Alumno) JCBAlumno.getSelectedItem();
     lisM=(ArrayList) insc.obtenerMateriasNoCursada(a.getIdAlumno());
     for (Materia materia : lisM) {
         modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnioMateria()});
     }
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> JCBAlumno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRMateriasInscriptas;
    private javax.swing.JRadioButton jRMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFormularioDeInscripciòn;
    // End of variables declaration//GEN-END:variables
}
