/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.aplicacion;

/**
 *
 * @author USUARIO
 */
public class AmigosApp extends javax.swing.JFrame {

    ArrayList<String> amigo = new ArrayList();
    DefaultTableModel tablaAmigos;

    File baseDatosUsuarios = new File("baseDeDatosUsuarios.txt");
    FileReader reader;
    String cadena;
    BufferedReader almacenamiento;
    String[] datosAmigo = new String[8];

    /**
     * Creates new form AmigosApp
     */
    public AmigosApp() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Mis amigos");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());

        ImageIcon imagenbotonRegresar = new ImageIcon(this.getClass().getResource("/imagenes/iconos/5.jpg"));
        imagenbotonRegresar = new ImageIcon(imagenbotonRegresar.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_DEFAULT));

        btnRegresar1.setIcon(imagenbotonRegresar);

        ImageIcon imagenbotonAñadir = new ImageIcon(this.getClass().getResource("/imagenes/iconos/6.png"));
        imagenbotonAñadir = new ImageIcon(imagenbotonAñadir.getImage().getScaledInstance(btnAñadir.getWidth(), btnAñadir.getHeight(), java.awt.Image.SCALE_DEFAULT));

        btnAñadir.setIcon(imagenbotonAñadir);

        //para poner el logo 
        ImageIcon imagenFondo = new ImageIcon(this.getClass().getResource("/imagenes/icono2.0.png"));
        imagenFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(pnlImagen1.getWidth(),
                pnlImagen1.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo = new JLabel();
        fondo.setIcon(imagenFondo);

        pnlImagen1.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, pnlImagen1.getWidth(), pnlImagen1.getHeight());

        ImageIcon imagenFondo1 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/8.png"));
        imagenFondo1 = new ImageIcon(imagenFondo1.getImage().getScaledInstance(pnlIconoE.getWidth(),
                pnlIconoE.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo1 = new JLabel();
        fondo1.setIcon(imagenFondo1);

        pnlIconoE.add(fondo1, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo1.setBounds(0, 0, pnlIconoE.getWidth(), pnlIconoE.getHeight());

        ImageIcon imagenFondo2 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/13.1.jpg"));
        imagenFondo2 = new ImageIcon(imagenFondo2.getImage().getScaledInstance(pnlCrearA.getWidth(),
                pnlCrearA.getHeight(), Image.SCALE_SMOOTH));

        JLabel fondo2 = new JLabel();
        fondo2.setIcon(imagenFondo2);

        pnlCrearA.add(fondo2, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo2.setBounds(0, 0, pnlCrearA.getWidth(), pnlCrearA.getHeight());

        String[] titulos = {"Nombre", "Apellido", "Profesión", "Carrera/Area", "Nivel/Materia"};

        tablaAmigos = new DefaultTableModel(null, titulos);
        tbtAmigos.setModel(tablaAmigos);

        try {
            reader = new FileReader(baseDatosUsuarios);
            almacenamiento = new BufferedReader(reader);
            cadena = "";
            while (cadena != null) {
                try {
                    //BDU= variables de la base de datos de usuarios
                    cadena = almacenamiento.readLine();
                    String nombreBDU = cadena;
                    datosAmigo[0] = nombreBDU;

                    cadena = almacenamiento.readLine();
                    String apellidoBDU = cadena;
                    datosAmigo[1] = apellidoBDU;

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
                    datosAmigo[2] = eopBDU;

                    cadena = almacenamiento.readLine();
                    String datoxBDU = cadena;
                    datosAmigo[3] = datoxBDU;

                    cadena = almacenamiento.readLine();
                    String datoyBDU = cadena;
                    datosAmigo[4] = datoyBDU;

                    //dato inutil para dejar espacio entre usuario y usuario
                    cadena = almacenamiento.readLine();
                    String espacioBD = cadena;

                } catch (IOException ex) {
                    Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtAmigos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAñadirUsuario = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnRegresar1 = new javax.swing.JButton();
        pnlImagen1 = new javax.swing.JPanel();
        pnlIconoE = new javax.swing.JPanel();
        pnlCrearA = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 133, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        tbtAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbtAmigos);

        jLabel1.setText("Ingrese el nombre del usuario a agregar");

        jLabel2.setText("Usuario:");

        btnAñadir.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(252, 150, 38));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 60));

        btnRegresar1.setBorder(null);
        btnRegresar1.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImagen1Layout = new javax.swing.GroupLayout(pnlImagen1);
        pnlImagen1.setLayout(pnlImagen1Layout);
        pnlImagen1Layout.setHorizontalGroup(
            pnlImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlImagen1Layout.setVerticalGroup(
            pnlImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        pnlCrearA.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout pnlCrearALayout = new javax.swing.GroupLayout(pnlCrearA);
        pnlCrearA.setLayout(pnlCrearALayout);
        pnlCrearALayout.setHorizontalGroup(
            pnlCrearALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pnlCrearALayout.setVerticalGroup(
            pnlCrearALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(pnlImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIconoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCrearA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlIconoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCrearA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(txtAñadirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAñadirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
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

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String usuarioAmigo = this.txtAñadirUsuario.getText();
        try {
            reader = new FileReader(baseDatosUsuarios);
            almacenamiento = new BufferedReader(reader);
            cadena = "";
            while (cadena != null) {
                try {
                    //BDU= variables de la base de datos de usuarios
                    cadena = almacenamiento.readLine();
                    String nombreBDU = cadena;
                    datosAmigo[0] = nombreBDU;

                    cadena = almacenamiento.readLine();
                    String apellidoBDU = cadena;
                    datosAmigo[1] = apellidoBDU;

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
                    datosAmigo[2] = eopBDU;

                    cadena = almacenamiento.readLine();
                    String datoxBDU = cadena;
                    datosAmigo[3] = datoxBDU;

                    cadena = almacenamiento.readLine();
                    String datoyBDU = cadena;
                    datosAmigo[4] = datoyBDU;

                    //dato inutil para dejar espacio entre usuario y usuario
                    cadena = almacenamiento.readLine();
                    String espacioBD = cadena;

                    if (usuarioAmigo.equals(usuarioBDU)) {
                        if (usuarioAmigo.equals(InicioSesionApp.txtUsuarioIS.getText())) {
                            JOptionPane.showMessageDialog(rootPane, "No puede agregarse a sí mismo",
                    "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Usuario agregado.");
                            cadena = null;
                            tablaAmigos.addRow(datosAmigo);
                        }
                    } else {
                        txtAñadirUsuario.setText("");
                    }

                } catch (IOException ex) {
                    Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(AmigosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmigosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmigosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmigosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmigosApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCrearA;
    private javax.swing.JPanel pnlIconoE;
    private javax.swing.JPanel pnlImagen1;
    private javax.swing.JTable tbtAmigos;
    private javax.swing.JTextField txtAñadirUsuario;
    // End of variables declaration//GEN-END:variables
}
