/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupo91final.vistas;

import proyectogrupo91final.AccesoDatos.*;


/**
 *
 * @author david
 */
public class Principal extends javax.swing.JFrame {
    private InscripcionData ida= new InscripcionData();
    private AlumnoData ad= new AlumnoData();
    private MateriaData as= new MateriaData();
    
    

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMenuItemFormulario = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMenuItemFormularioDeMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMenuItemManejoDeInscripciones = new javax.swing.JMenuItem();
        jMenuItemManipulacion = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMXM = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMenuItemFormulario.setText("Formulario");
        jMenuItemFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormularioActionPerformed(evt);
            }
        });
        jMAlumno.add(jMenuItemFormulario);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMenuItemFormularioDeMateria.setText("Formulario de materia");
        jMMateria.add(jMenuItemFormularioDeMateria);

        jMenuBar1.add(jMMateria);

        jMAdministracion.setText("Administraciòn");

        jMenuItemManejoDeInscripciones.setText("Manejo de inscripciones");
        jMenuItemManejoDeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManejoDeInscripcionesActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMenuItemManejoDeInscripciones);

        jMenuItemManipulacion.setText("Manipulacion de notas");
        jMenuItemManipulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManipulacionActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMenuItemManipulacion);

        jMenuBar1.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMXM.setText("Alumnos por materia");
        jMXM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMXMActionPerformed(evt);
            }
        });
        jMConsultas.add(jMXM);

        jMenuBar1.add(jMConsultas);

        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFormularioActionPerformed

    private void jMenuItemManejoDeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManejoDeInscripcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemManejoDeInscripcionesActionPerformed

    private void jMenuItemManipulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManipulacionActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        cargaDeNotas vistaCargaNota = new cargaDeNotas(ad,ida);
        vistaCargaNota.setVisible(true);
        Escritorio.add(vistaCargaNota);
        Escritorio.moveToFront(vistaCargaNota);
        
    }//GEN-LAST:event_jMenuItemManipulacionActionPerformed

    private void jMXMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMXMActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaAlumnoPorMateria vistaConsultaAlumnoPorMateria = new ConsultaAlumnoPorMateria(as);
        vistaConsultaAlumnoPorMateria.setVisible(true);
        Escritorio.add(vistaConsultaAlumnoPorMateria);
        Escritorio.moveToFront(vistaConsultaAlumnoPorMateria);
    }//GEN-LAST:event_jMXMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuItem jMXM;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItemFormulario;
    private javax.swing.JMenuItem jMenuItemFormularioDeMateria;
    private javax.swing.JMenuItem jMenuItemManejoDeInscripciones;
    private javax.swing.JMenuItem jMenuItemManipulacion;
    // End of variables declaration//GEN-END:variables
}
