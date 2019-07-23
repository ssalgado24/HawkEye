/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import data.*;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import logica.aplicacion;

/**
 *
 * @author USUARIO
 */
public class UnirseActividadApp extends javax.swing.JFrame {

    File baseDatosActividades = new File("baseDeDatosActividades.txt");
    FileReader reader;
    String cadena;
    BufferedReader almacenamiento;
    Deportiva Deportiva;

    ArrayList<String> aDeportiva = new ArrayList<>();
    DefaultListModel listaActividades = new DefaultListModel<>();

    public UnirseActividadApp() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Unirse a una Actividad");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ImageIcon imagenbotonRegresar = new ImageIcon(this.getClass().getResource("/imagenes/iconos/5.jpg"));
        imagenbotonRegresar = new ImageIcon(imagenbotonRegresar.getImage().getScaledInstance(40,40, java.awt.Image.SCALE_DEFAULT));
        
        btnRegresar1.setIcon(imagenbotonRegresar);
        
        ImageIcon imagenbotonBuscar = new ImageIcon(this.getClass().getResource("/imagenes/iconos/16.jpg"));
        imagenbotonBuscar = new ImageIcon(imagenbotonBuscar.getImage().getScaledInstance(btnVerDatos.getWidth(),btnVerDatos.getHeight(), java.awt.Image.SCALE_DEFAULT));
        
        btnVerDatos.setIcon(imagenbotonBuscar);
        
        ImageIcon imagenbotonAñadir = new ImageIcon(this.getClass().getResource("/imagenes/iconos/6.png"));
        imagenbotonAñadir = new ImageIcon(imagenbotonAñadir.getImage().getScaledInstance(btnAgregar.getWidth(),btnAgregar.getHeight(), java.awt.Image.SCALE_DEFAULT));
        
        btnAgregar.setIcon(imagenbotonAñadir);
        
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
        
        ImageIcon imagenFondo2 = new ImageIcon(this.getClass().getResource("/imagenes/iconos/11.1.jpg"));
        imagenFondo2 = new ImageIcon(imagenFondo2.getImage().getScaledInstance(pnlCrearA.getWidth(),
                pnlCrearA.getHeight(), Image.SCALE_SMOOTH));
        
        JLabel fondo2 = new JLabel();
        fondo2.setIcon(imagenFondo2);
        
        pnlCrearA.add(fondo2, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo2.setBounds(0, 0, pnlCrearA.getWidth(), pnlCrearA.getHeight());
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        try {
            reader = new FileReader(baseDatosActividades);
            almacenamiento = new BufferedReader(reader);
            cadena = "";
            while (cadena != null) {
                try {
                    //BDA= variables de la base de datos de Actividades
                    cadena = almacenamiento.readLine();
                    String nombreBDA = cadena;
                    aDeportiva.add(nombreBDA);

                    cadena = almacenamiento.readLine();
                    String descripcionBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String fechaHoraBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String recomendacionesBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String claodepBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String escenarioBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String coordinadorBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String espacioXBDA = cadena;

                } catch (IOException ex) {
                    Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = 0; i < aDeportiva.size(); i++) {
                listaActividades.addElement(aDeportiva.get(i));
                lstListaA.setModel(listaActividades);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstListaA = new javax.swing.JList<>();
        btnVerDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDatos = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnRegresar1 = new javax.swing.JButton();
        pnlImagen1 = new javax.swing.JPanel();
        pnlIconoE = new javax.swing.JPanel();
        pnlCrearA = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 133, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.setToolTipText("");

        jLabel1.setText("Seleccione una actividad");

        lstListaA.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstListaA.setToolTipText("");
        lstListaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListaAMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstListaA);

        btnVerDatos.setBorder(null);
        btnVerDatos.setPreferredSize(new java.awt.Dimension(60, 60));
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        txtaDatos.setColumns(20);
        txtaDatos.setRows(5);
        jScrollPane1.setViewportView(txtaDatos);

        btnAgregar.setBorder(null);
        btnAgregar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        String dato = lstListaA.getSelectedValue().toString();
        try {
            reader = new FileReader(baseDatosActividades);
            almacenamiento = new BufferedReader(reader);
            cadena = "";
            while (cadena != null) {
                try {
                    //BDA= variables de la base de datos de Actividades
                    cadena = almacenamiento.readLine();
                    String nombreBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String descripcionBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String fechaHoraBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String recomendacionesBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String claodepBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String escenarioBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String coordinadorBDA = cadena;

                    cadena = almacenamiento.readLine();
                    String espacioXBDA = cadena;
                    
                    if(dato.equals(nombreBDA)){
                        txtaDatos.setText(" Actividad: " + nombreBDA + 
                                "\n Descripciòn : " + descripcionBDA + "\n  Fecha y Hora : " + fechaHoraBDA
                                + "\n Recomendaciones : " + recomendacionesBDA + "\n Clasificación/Deporte : " +claodepBDA 
                                + "\n Escenario : " + escenarioBDA + "\n Coordinador : " + coordinadorBDA);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void lstListaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListaAMouseClicked

    }//GEN-LAST:event_lstListaAMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String dato = lstListaA.getSelectedValue().toString();        
        JOptionPane.showMessageDialog(rootPane, "Actividad agregada.");
        setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(UnirseActividadApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnirseActividadApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnirseActividadApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnirseActividadApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnirseActividadApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JList<String> lstListaA;
    private javax.swing.JPanel pnlCrearA;
    private javax.swing.JPanel pnlIconoE;
    private javax.swing.JPanel pnlImagen1;
    private javax.swing.JTextArea txtaDatos;
    // End of variables declaration//GEN-END:variables
}
