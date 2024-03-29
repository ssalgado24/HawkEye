/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.*;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import logica.aplicacion;

/**
 *
 * @author USUARIO
 */
public class RegistroAppProfesor extends javax.swing.JFrame {

    String nombre = "";
    String apellido = "";
    String documento = "";
    String usuario = "";
    String contraseña = "";
    String correo = "";
    String area = "";
    String materia = "";
    Profesor nuevoProfesor;

    File baseDatosUsuarios = new File("baseDeDatosUsuarios.txt");
    FileWriter escribir;
    PrintWriter linea;
    FileReader reader;
    String cadena;
    BufferedReader almacenamiento;

    /**
     * Creates new form RegistroAppEstudiante
     */
    public RegistroAppProfesor() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Profesor");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());

        ImageIcon imagenbotonRegresar = new ImageIcon(this.getClass().getResource("/imagenes/iconos/5.jpg"));
        imagenbotonRegresar = new ImageIcon(imagenbotonRegresar.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_DEFAULT));

        btnRegresar1.setIcon(imagenbotonRegresar);

        //para poner el logo 
        ImageIcon imagenFondo = new ImageIcon(this.getClass().getResource("/imagenes/icono2.0.png"));
        imagenFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(pnlIcono1.getWidth(),
                pnlIcono1.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo = new JLabel();
        fondo.setIcon(imagenFondo);

        pnlIcono1.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, pnlIcono1.getWidth(), pnlIcono1.getHeight());

        //icono estudiante
        ImageIcon imagenFondo1 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/2.1.png"));
        imagenFondo1 = new ImageIcon(imagenFondo1.getImage().getScaledInstance(pnlIconoP.getWidth(),
                pnlIconoP.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo1 = new JLabel();
        fondo1.setIcon(imagenFondo1);

        pnlIconoP.add(fondo1, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo1.setBounds(0, 0, pnlIconoP.getWidth(), pnlIconoP.getHeight());

        //listo
        ImageIcon imagenbotonAñadir = new ImageIcon(this.getClass().getResource("/imagenes/iconos/7.png"));
        imagenbotonAñadir = new ImageIcon(imagenbotonAñadir.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_DEFAULT));

        btnListoRegistro.setIcon(imagenbotonAñadir);

        ImageIcon imagenFondo2 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/1.1.png"));
        imagenFondo2 = new ImageIcon(imagenFondo2.getImage().getScaledInstance(pnlEP.getWidth(),
                pnlEP.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo12 = new JLabel();
        fondo12.setIcon(imagenFondo2);

        pnlEP.add(fondo12, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo12.setBounds(0, 0, pnlEP.getWidth(), pnlEP.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        pnlIcono = new javax.swing.JPanel();
        pnlIconoE = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnListoRegistro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnRegresar1 = new javax.swing.JButton();
        pnlIcono1 = new javax.swing.JPanel();
        pnlIconoP = new javax.swing.JPanel();
        pnlEP = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JPasswordField();

        btnRegresar.setBorder(null);
        btnRegresar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIconoLayout = new javax.swing.GroupLayout(pnlIcono);
        pnlIcono.setLayout(pnlIconoLayout);
        pnlIconoLayout.setHorizontalGroup(
            pnlIconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlIconoLayout.setVerticalGroup(
            pnlIconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlIconoELayout = new javax.swing.GroupLayout(pnlIconoE);
        pnlIconoE.setLayout(pnlIconoELayout);
        pnlIconoELayout.setHorizontalGroup(
            pnlIconoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlIconoELayout.setVerticalGroup(
            pnlIconoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 133, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Documento:");

        jLabel5.setText("Usuario:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Correo (sin @unal.edu.co):");

        btnListoRegistro.setBorder(null);
        btnListoRegistro.setPreferredSize(new java.awt.Dimension(80, 80));
        btnListoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoRegistroActionPerformed(evt);
            }
        });

        jLabel8.setText("Área:");

        jLabel9.setText("Materia:");

        jPanel7.setBackground(new java.awt.Color(252, 150, 38));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 60));

        btnRegresar1.setBorder(null);
        btnRegresar1.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        pnlIcono1.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout pnlIcono1Layout = new javax.swing.GroupLayout(pnlIcono1);
        pnlIcono1.setLayout(pnlIcono1Layout);
        pnlIcono1Layout.setHorizontalGroup(
            pnlIcono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlIcono1Layout.setVerticalGroup(
            pnlIcono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlIconoPLayout = new javax.swing.GroupLayout(pnlIconoP);
        pnlIconoP.setLayout(pnlIconoPLayout);
        pnlIconoPLayout.setHorizontalGroup(
            pnlIconoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlIconoPLayout.setVerticalGroup(
            pnlIconoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEPLayout = new javax.swing.GroupLayout(pnlEP);
        pnlEP.setLayout(pnlEPLayout);
        pnlEPLayout.setHorizontalGroup(
            pnlEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlEPLayout.setVerticalGroup(
            pnlEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(pnlIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIconoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlIcono1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addComponent(pnlIconoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(27, 27, 27)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel8)
                            .addGap(26, 26, 26)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addGap(32, 32, 32)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(27, 27, 27)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(txtContraseña))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnListoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(36, 36, 36)
                .addComponent(btnListoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoRegistroActionPerformed
        nombre = this.txtNombre.getText();
        apellido = this.txtApellido.getText();
        documento = this.txtDocumento.getText();
        usuario = this.txtUsuario.getText();
        contraseña = this.txtContraseña.getText();
        correo = this.txtCorreo.getText();
        area = this.txtArea.getText();
        materia = this.txtMateria.getText();

        if (nombre.length() > 0 && apellido.length() > 0 && documento.length() > 0
                && usuario.length() > 0 && contraseña.length() > 0 && correo.length() > 0) {
            try {
                reader = new FileReader(baseDatosUsuarios);
                almacenamiento = new BufferedReader(reader);
                cadena = "";
                while (cadena != null) {
                    try {
                        //BDU= variables de la base de datos de usuarios
                        cadena = almacenamiento.readLine();
                        String nombreBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String apellidoBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String documentoBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String usuarioBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String contraseñaBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String correoUNBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String eopBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String datoxBDU = cadena;

                        cadena = almacenamiento.readLine();
                        String datoyBDU = cadena;

                        //dato inutil para dejar espacio entre usuario y usuario
                        cadena = almacenamiento.readLine();
                        String espacioBD = cadena;

                        if (!(usuario.equals(usuarioBDU))) {
                            nuevoProfesor = new Profesor(nombre, apellido, documento, contraseña, usuario, "Profesor", correo, area, materia);
                            JOptionPane.showMessageDialog(rootPane, "Profesor creado.");
                            try {
                                escribir = new FileWriter(baseDatosUsuarios, true);
                                linea = new PrintWriter(escribir);
                                linea.println(nombre);
                                linea.println(apellido);
                                linea.println(documento);
                                linea.println(usuario);
                                linea.println(contraseña);
                                linea.println(correo);
                                linea.println("Profesor");
                                linea.println(area);
                                linea.println(materia);
                                linea.println("");

                                linea.close();
                                escribir.close();
                            } catch (IOException ex) {
                                Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            cadena = null;
                            setVisible(false);
                        } else {
                            txtUsuario.setText("");
                            txtCorreo.setText("");
                            cadena = null;
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los espacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListoRegistroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAppProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAppProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAppProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAppProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAppProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListoRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlEP;
    private javax.swing.JPanel pnlIcono;
    private javax.swing.JPanel pnlIcono1;
    private javax.swing.JPanel pnlIconoE;
    private javax.swing.JPanel pnlIconoP;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
