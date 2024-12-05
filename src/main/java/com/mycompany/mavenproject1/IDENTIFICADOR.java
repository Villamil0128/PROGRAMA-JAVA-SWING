/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author villamil
 */
public class IDENTIFICADOR extends javax.swing.JFrame {

    /**
     * Creates new form IDENTIFICADOR
     */
    public IDENTIFICADOR() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
       ImgInvierno.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        NumMes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SetMes = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        SetEsta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        ImgInvierno = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ImgCalendario = new javax.swing.JLabel();
        ImgVerano = new javax.swing.JLabel();
        ImgOto = new javax.swing.JLabel();
        ImgPrimavera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umecit-logo(1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Identificador de estaciones del año");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 140, 450, -1));

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 460, 50));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("Numero del Mes:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        NumMes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        NumMes.setBorder(null);
        jPanel1.add(NumMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 380, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 10));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel14.setForeground(java.awt.Color.gray);
        jLabel14.setText("Ingresa el numero del mes");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Mes");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        SetMes.setEditable(false);
        SetMes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SetMes.setBorder(null);
        SetMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SetMesMousePressed(evt);
            }
        });
        SetMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetMesActionPerformed(evt);
            }
        });
        jPanel1.add(SetMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 380, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 380, 10));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText("Estacion del año");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        SetEsta.setEditable(false);
        SetEsta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        SetEsta.setBorder(null);
        SetEsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SetEstaMousePressed(evt);
            }
        });
        jPanel1.add(SetEsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 380, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 380, 10));

        ImgInvierno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invierno(1).png"))); // NOI18N
        ImgInvierno.setText("jLabel1");
        jPanel1.add(ImgInvierno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 130));

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IDENTIFICAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 150, 50));

        ImgCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendario(3).png"))); // NOI18N
        ImgCalendario.setText("jLabel1");
        jPanel1.add(ImgCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 130, 110));

        ImgVerano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verano.png"))); // NOI18N
        ImgVerano.setText("jLabel1");
        jPanel1.add(ImgVerano, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 130));

        ImgOto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otono.png"))); // NOI18N
        ImgOto.setText("jLabel1");
        jPanel1.add(ImgOto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 130));

        ImgPrimavera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primavera.png"))); // NOI18N
        ImgPrimavera.setText("jLabel1");
        jPanel1.add(ImgPrimavera, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetMesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetMesMousePressed

    }//GEN-LAST:event_SetMesMousePressed

    private void SetMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetMesActionPerformed

    private void SetEstaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetEstaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetEstaMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        String mes="";
        String estacion="";
        int numeroMes=0;
        
        numeroMes = Integer.parseInt(NumMes.getText());
        
        
      switch (numeroMes) {
  
  case 1:
    mes = "Enero";
    SetMes.setText(mes); 
    estacion = "Invierno";
    SetEsta.setText(estacion);
    ImgInvierno.setVisible(true);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
  case 2:
    mes = "Febrero";
    SetMes.setText(mes); 
    estacion = "Invierno";
    SetEsta.setText(estacion);
     ImgInvierno.setVisible(true);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
  case 3:
    mes = "Marzo";
    SetMes.setText(mes); 
    SetMes.setText(mes); 
    estacion = "Primavera";
     SetEsta.setText(estacion);
      ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(true);
    break;
  case 4:
    mes = "Abril";
    SetMes.setText(mes); 
    SetMes.setText(mes); 
    estacion = "Primavera";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(true);
    break;
  case 5:
    mes = "Mayo";
    SetMes.setText(mes); 
    estacion = "Primavera";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(true);
    break;
  case 6:
    mes = "Junio";
    SetMes.setText(mes); 
    estacion = "Verano";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(true);
       ImgPrimavera.setVisible(false);
    break;
  case 7:
    mes = "Julio";
    SetMes.setText(mes); 
    estacion = "Verano";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(true);
       ImgPrimavera.setVisible(false);
    break;
  case 8:
    mes = "Agosto";
    SetMes.setText(mes); 
    estacion = "Verano";
     SetEsta.setText(estacion);
    ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(true);
       ImgPrimavera.setVisible(false);
    break;
  case 9:
    mes = "Septiembre";
    SetMes.setText(mes); 
    estacion = "Otoño";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(true);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
  case 10:
    mes = "Octubre";
    SetMes.setText(mes); 
    estacion = "Otoño";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(true);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
  case 11:
    mes = "Noviembre";
    SetMes.setText(mes); 
    estacion = "Otoño";
     SetEsta.setText(estacion);
     ImgInvierno.setVisible(false);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(true);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
  case 12:
    mes = "Diciembre";
    SetMes.setText(mes); 
    estacion = "Invierno";
    SetEsta.setText(estacion);
     ImgInvierno.setVisible(true);
       ImgCalendario.setVisible(false);
       ImgOto.setVisible(false);
       ImgVerano.setVisible(false);
       ImgPrimavera.setVisible(false);
    break;
    
    default:
    JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS \nNumero del mes mal ingresado.");
}
      
     
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(IDENTIFICADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDENTIFICADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDENTIFICADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDENTIFICADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDENTIFICADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgCalendario;
    private javax.swing.JLabel ImgInvierno;
    private javax.swing.JLabel ImgOto;
    private javax.swing.JLabel ImgPrimavera;
    private javax.swing.JLabel ImgVerano;
    private javax.swing.JTextField NumMes;
    private javax.swing.JTextField SetEsta;
    private javax.swing.JTextField SetMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}