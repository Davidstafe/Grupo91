
package proyectogrupo91final.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import proyectogrupo91final.AccesoDatos.*;
import proyectogrupo91final.entidades.*;


/**
 *
 * @author david
 */
public class GestionDeAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData alu;
   
    public GestionDeAlumnos() {
        initComponents();
        alu =new AlumnoData();//Creo alumnodata para utilizarlo en todos los metodos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jChCalendario = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Documento: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Alumno");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Estado/Activo:");

        jLabel7.setText("Fecha de Nacimiento: ");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jChCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jChCalendarioPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jChCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBNuevo)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jRBEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBSalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jBBuscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRBEstado))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jChCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        if (jTDNI.getText().isEmpty() || jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        } else {

            try {
                LocalDate fechaNac = jChCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Alumno b = new Alumno(Integer.parseInt(jTDNI.getText()), jTApellido.getText(), jTNombre.getText(), fechaNac, jRBEstado.isSelected());

                if (alu.buscarAlumnoDni(Integer.parseInt(jTDNI.getText())) == null) {

                    alu.guardarAlumno(b);

                } else {
                    JOptionPane.showMessageDialog(null, "dni Existente ingrese nuevamente");
                    jTDNI.setText("");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresar numeros en el Dni");
                jTDNI.setText("");
            }
            limpiar();
      }


    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {

            Alumno a = alu.buscarAlumnoDni(Integer.parseInt(jTDNI.getText()));
            if (a != null) {
                jTApellido.setText(a.getApellido());
                jTNombre.setText(a.getNombre());
                jChCalendario.setDate(Date.from(a.getFechaNac().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
//                if (jRBEstado.isSelected()==a.isEstado(true)) {
                    
//                }
               

                JOptionPane.showMessageDialog(null, "alumno encntrado");

            } else {
                JOptionPane.showMessageDialog(null, "alumno no encntrado");
            }
//          limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numeros en el dni");
            limpiar();
        }


    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTDNI.getText().isEmpty() || jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        } else {

            try {
                LocalDate fechaNac = jChCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Alumno b = alu.buscarAlumnoDni(Integer.parseInt(jTDNI.getText()));

                if (b != null) {
                    b.setDni(Integer.parseInt(jTDNI.getText()));
                    b.setApellido(jTApellido.getText());
                    b.setNombre(jTNombre.getText());
                    b.setFechaNac(fechaNac);
                    b.setEstado(jRBEstado.isSelected());
//                    if (b.isEstado()==true) {
//                        b.isEstado(jRBEstado.isSelected());
//                    }
                    alu.modificarAlumno(b);
                    JOptionPane.showMessageDialog(null, "Alumnooooooooo  Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no  Modificado");
                    jTDNI.setText("");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresar numeros en el Dni");
                jTDNI.setText("");
                return;
            }
            limpiar();

        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jChCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jChCalendarioPropertyChange
        if (jChCalendario.getDate() != null) {
            LocalDate fechaNac = jChCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();//transformo con toInstant es un punto en el tiempo,convierto  zoneid esto representa una fecha en una zona determinaday
//           ,system representa la zona horaria local,luego lo convierto a Localdate
        }
    }//GEN-LAST:event_jChCalendarioPropertyChange

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed

        Alumno a = alu.buscarAlumnoDni(Integer.parseInt(jTDNI.getText()));
        if (a != null) {
            alu.bajaAlumno(a.getDni());
            jRBEstado.setSelected(false);
            JOptionPane.showMessageDialog(null, "alumno borrado");
        }else{
             JOptionPane.showMessageDialog(null, "alumno no encontrado");
        }
      
        
    }//GEN-LAST:event_jEliminarActionPerformed
public void limpiar(){
      
        jTApellido.setText("");//Limpiar campos en pantalla principal
       jTDNI.setText("");
       jTNombre.setText("");
       jRBEstado.setSelected(false);
       jChCalendario.setDate(null);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jChCalendario;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
