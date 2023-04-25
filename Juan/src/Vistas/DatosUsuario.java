/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Andres
 */
public class DatosUsuario extends javax.swing.JFrame {
   DefaultListModel modelo = new DefaultListModel();
   DefaultListModel modelo1 = new DefaultListModel();
   public static DatosUsuario datosUsuario;
    /**
     * Creates new form DatosUsuario
     */
    public DatosUsuario() {
        initComponents();
        jList1.setModel(modelo);
        jList2.setModel(modelo1);
    }
    
    public static DatosUsuario getDatosUsuario(){
        if(datosUsuario==null){
            datosUsuario=new DatosUsuario();
        }
        return datosUsuario;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new java.awt.GridLayout(3, 4));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11);

        jLabel5.setFont(new java.awt.Font("Tilt Warp", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Genero");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jLabel5);

        jLabel7.setFont(new java.awt.Font("Tilt Warp", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("genero musical favorito");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jLabel7);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14);

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel18);

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Helicoptero", "Padilla" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1);

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reggeton", "Trap", "Rock", "Salsa", "Corridos", "Cumbia" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox2);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel1);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel17);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar listado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);

        jPanel4.add(jPanel7);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.GridLayout(3, 2));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tilt Warp", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel3);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tilt Warp", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero musical");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel6);

        jList1.setBackground(new java.awt.Color(153, 153, 153));
        jList1.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jList1);

        jPanel5.add(jScrollPane2);

        jList2.setBackground(new java.awt.Color(153, 153, 153));
        jList2.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jList2);

        jPanel5.add(jScrollPane3);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel13);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel16);

        jPanel2.add(jPanel5);

        jPanel10.add(jPanel2);

        jPanel3.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new java.awt.GridLayout(2, 2));

        jLabel2.setFont(new java.awt.Font("Tilt Warp", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ingresa tu edad");
        jPanel12.add(jLabel2);

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(90);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("10");
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel12.add(jSlider1);
        jPanel12.add(jLabel11);
        jPanel12.add(jLabel10);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(jLabel9);

        jSpinner2.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(50, 0, 90, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        jPanel12.add(jSpinner2);

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Tilt Warp", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Mostrar edad");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6);

        jPanel3.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Documents\\TrabajosApo\\Juan\\Imagenes\\Las-Torres-Gemelas-WTC-Nueva-York-EE-UU (1).jpg")); // NOI18N
        jPanel24.add(jLabel1);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tilt Warp", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos del usuario");
        jPanel24.add(jLabel4);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Documents\\TrabajosApo\\Juan\\Imagenes\\cropped-aviancaavion-99 (1).jpg")); // NOI18N
        jPanel24.add(jLabel8);

        getContentPane().add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tilt Warp", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tilt Warp", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Conoce mas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1);

        getContentPane().add(jPanel15, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        jSlider1.setValue((int) jSpinner2.getValue());
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        jSpinner2.setValue(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, ("Tu edad es "+jSpinner2.getValue()+ " años"));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        System.out.println(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        System.out.println(jComboBox2.getSelectedItem());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modelo.addElement(jComboBox1.getSelectedItem());
        modelo1.addElement(jComboBox2.getSelectedItem());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DatosUsuario datos = DatosUsuario.getDatosUsuario();
        datos.setVisible(false);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "En esta interfaz damos varios ejemplos de usos para listas, opciones y deslizadores ");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
