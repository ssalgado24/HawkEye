/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.Cultural;
import data.Deportiva;
import data.Estudiante;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import logica.aplicacion;

/**
 *
 * @author USUARIO
 */
public class CACultural extends javax.swing.JFrame {

    String nombre = "";
    String descripcion = "";
    String fechaHora = "";
    String clasificacion = "";
    String escenario = "";
    String recomendaciones = "";
    String coordinador = "";
    Cultural nuevaActividadCultural;

    File baseDatosActividades = new File("baseDeDatosActividades.txt");
    FileWriter escribir;
    PrintWriter linea;

    public CACultural() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Actividad Cultural");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.txtNombreCoordinador.setEnabled(false);
        this.jLabel9.setEnabled(false);
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        
        ImageIcon imagenbotonRegresar = new ImageIcon(this.getClass().getResource("/imagenes/iconos/5.jpg"));
        imagenbotonRegresar = new ImageIcon(imagenbotonRegresar.getImage().getScaledInstance(40,40, java.awt.Image.SCALE_DEFAULT));
        
        btnRegresar1.setIcon(imagenbotonRegresar);
        
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
        
        ImageIcon imagenFondo2 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/10.1.jpg"));
        imagenFondo2 = new ImageIcon(imagenFondo2.getImage().getScaledInstance(pnlCrearA.getWidth(),
                pnlCrearA.getHeight(), Image.SCALE_SMOOTH));
        
        JLabel fondo2 = new JLabel();
        fondo2.setIcon(imagenFondo2);
        
        pnlCrearA.add(fondo2, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo2.setBounds(0, 0, pnlCrearA.getWidth(), pnlCrearA.getHeight());
        
        ImageIcon imagenFondo3 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/14.1.jpg"));
        imagenFondo3 = new ImageIcon(imagenFondo3.getImage().getScaledInstance(pnlCrearA1.getWidth(),
                pnlCrearA1.getHeight(), Image.SCALE_SMOOTH));
        
        JLabel fondo3 = new JLabel();
        fondo3.setIcon(imagenFondo3);
        
        pnlCrearA1.add(fondo3, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo3.setBounds(0, 0, pnlCrearA1.getWidth(), pnlCrearA1.getHeight());   
        
        ImageIcon imagenbotonCrear = new ImageIcon(this.getClass().getResource("/imagenes/iconos/7.png"));
        imagenbotonCrear = new ImageIcon(imagenbotonCrear.getImage().getScaledInstance(btnCrear.getWidth(),btnCrear.getHeight(), java.awt.Image.SCALE_DEFAULT));
        
        btnCrear.setIcon(imagenbotonCrear);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRecomendaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEscenario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        btnCrear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCoordinador = new javax.swing.JTextField();
        cbxClasificacion = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnRegresar1 = new javax.swing.JButton();
        pnlImagen1 = new javax.swing.JPanel();
        pnlIconoE = new javax.swing.JPanel();
        pnlCrearA = new javax.swing.JPanel();
        pnlCrearA1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 133, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(427, 390));

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Descripción: ");

        jLabel4.setText("Fecha y Hora: ");

        jLabel5.setText("Recomendaciones: ");

        jLabel6.setText("Clasificación: ");

        jLabel7.setText("Escenario: ");

        jLabel8.setText("Desea ser coordinador de la actividad?");

        rbtSi.setBackground(new java.awt.Color(10, 133, 172));
        buttonGroup1.add(rbtSi);
        rbtSi.setText("Sí");
        rbtSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSiActionPerformed(evt);
            }
        });

        rbtNo.setBackground(new java.awt.Color(10, 133, 172));
        buttonGroup1.add(rbtNo);
        rbtNo.setText("No");
        rbtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNoActionPerformed(evt);
            }
        });

        btnCrear.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre Coordinador:");

        txtNombreCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCoordinadorActionPerformed(evt);
            }
        });

        cbxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las edades", "+18", "+21" }));

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

        pnlCrearA1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout pnlCrearA1Layout = new javax.swing.GroupLayout(pnlCrearA1);
        pnlCrearA1.setLayout(pnlCrearA1Layout);
        pnlCrearA1Layout.setHorizontalGroup(
            pnlCrearA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pnlCrearA1Layout.setVerticalGroup(
            pnlCrearA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCrearA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(pnlCrearA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCrearA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEscenario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtSi)
                                .addGap(18, 18, 18)
                                .addComponent(rbtNo)))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEscenario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbtSi)
                    .addComponent(rbtNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        nombre = this.txtNombre.getText();
        descripcion = "Cultural: " + this.txtDescripcion.getText();
        fechaHora = this.txtFechaHora.getText();
        clasificacion = this.cbxClasificacion.getSelectedItem().toString();;
        escenario = this.txtEscenario.getText();
        recomendaciones = this.txtRecomendaciones.getText();
        if (rbtSi.isSelected()) {
            coordinador = this.txtNombreCoordinador.getText();
        } else {
            coordinador = "Sin coordinador";
        }
        if (nombre.length() > 0 || descripcion.length() > 0 || fechaHora.length() > 0
                || clasificacion.length() > 0 || recomendaciones.length() > 0 || coordinador.length() > 0) {
            nuevaActividadCultural = new Cultural(nombre, descripcion, fechaHora,recomendaciones, clasificacion,
                    escenario, coordinador);
            JOptionPane.showMessageDialog(rootPane, "Actividad creada.");
            try {
                escribir = new FileWriter(baseDatosActividades, true);
                linea = new PrintWriter(escribir);
                linea.println(nombre);                       
                linea.println(descripcion);                       
                linea.println(fechaHora);                       
                linea.println(recomendaciones);                       
                linea.println(clasificacion);                       
                linea.println(escenario);                       
                linea.println(coordinador);  
                linea.println();  
                
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            setVisible(false);
            CrearActividadApp obj1 = new CrearActividadApp();
            obj1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los espacios",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtNombreCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCoordinadorActionPerformed

    }//GEN-LAST:event_txtNombreCoordinadorActionPerformed

    private void rbtSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSiActionPerformed
        this.txtNombreCoordinador.setEnabled(true);
        this.jLabel9.setEnabled(true);
    }//GEN-LAST:event_rbtSiActionPerformed

    private void rbtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNoActionPerformed
        this.txtNombreCoordinador.setEnabled(false);
        this.jLabel9.setEnabled(false);
    }//GEN-LAST:event_rbtNoActionPerformed

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
            java.util.logging.Logger.getLogger(CACultural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CACultural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CACultural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CACultural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CACultural().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxClasificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlCrearA;
    private javax.swing.JPanel pnlCrearA1;
    private javax.swing.JPanel pnlIconoE;
    private javax.swing.JPanel pnlImagen1;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEscenario;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCoordinador;
    private javax.swing.JTextField txtRecomendaciones;
    // End of variables declaration//GEN-END:variables
}