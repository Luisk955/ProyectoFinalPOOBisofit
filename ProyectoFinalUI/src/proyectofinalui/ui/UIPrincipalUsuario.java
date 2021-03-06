package proyectofinalui.ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalui.gestor.GestorUsuario;

public class UIPrincipalUsuario extends javax.swing.JFrame {

    /**
     * Creates new form UIPrincipalUsuario
     */
    private int usuarioActivo;
    private int cantGrupos;

    public UIPrincipalUsuario() {
        initComponents();
    }

    public UIPrincipalUsuario(int id) throws Exception {
        initComponents();
        usuarioActivo = id;
        cantGrupos = new GestorUsuario().revGrupo(usuarioActivo);
        if (cantGrupos > 0) {
            llenarTabla();
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

        btnLigas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCronograma3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCronograma1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCronograma2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCronograma4 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCronograma8 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCronograma5 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCronograma6 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCronograma7 = new javax.swing.JTable();
        btnGenerarPrediccion1 = new javax.swing.JButton();
        btnGenerarPrediccion2 = new javax.swing.JButton();
        btnGenerarPrediccion3 = new javax.swing.JButton();
        btnGenerarPrediccion4 = new javax.swing.JButton();
        btnGenerarPrediccion5 = new javax.swing.JButton();
        btnGenerarPrediccion6 = new javax.swing.JButton();
        btnGenerarPrediccion7 = new javax.swing.JButton();
        btnGenerarPrediccion8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLigas.setText("Ligas");
        btnLigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel10.setText("Cronograma de Grupo 2");

        tblCronograma3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane3.setViewportView(tblCronograma3);
        if (tblCronograma3.getColumnModel().getColumnCount() > 0) {
            tblCronograma3.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel11.setText("Cronograma de Grupo 1");

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel12.setText("Cronograma de Grupo 3");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel13.setText("Cronograma de Grupo 5");

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel14.setText("Cronograma de Grupo 4");

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel15.setText("Cronograma de Grupo 8");

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel16.setText("Cronograma de Grupo 7");

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel17.setText("Cronograma de Grupo 6");

        tblCronograma1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane4.setViewportView(tblCronograma1);
        if (tblCronograma1.getColumnModel().getColumnCount() > 0) {
            tblCronograma1.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane5.setViewportView(tblCronograma2);
        if (tblCronograma2.getColumnModel().getColumnCount() > 0) {
            tblCronograma2.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane6.setViewportView(tblCronograma4);
        if (tblCronograma4.getColumnModel().getColumnCount() > 0) {
            tblCronograma4.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane7.setViewportView(tblCronograma8);
        if (tblCronograma8.getColumnModel().getColumnCount() > 0) {
            tblCronograma8.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane8.setViewportView(tblCronograma5);
        if (tblCronograma5.getColumnModel().getColumnCount() > 0) {
            tblCronograma5.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane9.setViewportView(tblCronograma6);
        if (tblCronograma6.getColumnModel().getColumnCount() > 0) {
            tblCronograma6.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        tblCronograma7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "vs", ""
            }
        ));
        jScrollPane10.setViewportView(tblCronograma7);
        if (tblCronograma7.getColumnModel().getColumnCount() > 0) {
            tblCronograma7.getColumnModel().getColumn(1).setMaxWidth(30);
        }

        btnGenerarPrediccion1.setText("Predecir resultado");
        btnGenerarPrediccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion1ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion2.setText("Predecir resultado");
        btnGenerarPrediccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion2ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion3.setText("Predecir resultado");
        btnGenerarPrediccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion3ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion4.setText("Predecir resultado");
        btnGenerarPrediccion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion4ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion5.setText("Predecir resultado");
        btnGenerarPrediccion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion5ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion6.setText("Predecir resultado");
        btnGenerarPrediccion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion6ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion7.setText("Predecir resultado");
        btnGenerarPrediccion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion7ActionPerformed(evt);
            }
        });

        btnGenerarPrediccion8.setText("Predecir resultado");
        btnGenerarPrediccion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPrediccion8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnLigas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(btnGenerarPrediccion1))
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnGenerarPrediccion5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnGenerarPrediccion2)
                                                    .addComponent(jLabel17))
                                                .addGap(73, 73, 73))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnGenerarPrediccion3)
                                                .addComponent(jLabel16))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnGenerarPrediccion6)
                                        .addGap(151, 151, 151)
                                        .addComponent(btnGenerarPrediccion7)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(btnGenerarPrediccion4)
                                .addContainerGap(78, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerarPrediccion8)
                                .addGap(76, 76, 76))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnLigas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerarPrediccion1)
                            .addComponent(btnGenerarPrediccion3)
                            .addComponent(btnGenerarPrediccion4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerarPrediccion6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGenerarPrediccion7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGenerarPrediccion5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGenerarPrediccion8)))
                                .addContainerGap(27, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerarPrediccion2)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigasActionPerformed
        // TODO add your handling code here:
        irALigasUsuario();
    }//GEN-LAST:event_btnLigasActionPerformed

    private void btnGenerarPrediccion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion5ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(5, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion5ActionPerformed

    private void btnGenerarPrediccion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion6ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(6, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion6ActionPerformed

    private void btnGenerarPrediccion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion7ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(7, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion7ActionPerformed

    private void btnGenerarPrediccion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion8ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(8, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion8ActionPerformed

    private void btnGenerarPrediccion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion4ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(4, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion4ActionPerformed

    private void btnGenerarPrediccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion2ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(2, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion2ActionPerformed

    private void btnGenerarPrediccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion1ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(1, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion1ActionPerformed

    private void btnGenerarPrediccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPrediccion3ActionPerformed
        // TODO add your handling code here:
        UIPrediccion ui = new UIPrediccion(3, usuarioActivo);
        ui.setVisible(true);
    }//GEN-LAST:event_btnGenerarPrediccion3ActionPerformed

    private void llenarTabla() {
        try {
            for (int i = 0; i < 7; i++) {
                String cronogramaUsuario = new GestorUsuario().getCronograma(usuarioActivo, i);
                String[] datos;
                String[] datos2;
                String[] datos3 = new String[3];
                datos = cronogramaUsuario.split(":");
                for (String dataTemp : datos) {
                    datos2 = dataTemp.split(",");
                    datos3[0] = datos2[0] + " (" + datos2[1] + ")";
                    datos3[1] = " vs ";
                    datos3[2] = datos2[2] + " (" + datos2[3] + ")";
                    DefaultTableModel modelo;

                    switch (i) {
                        case 0:
                            modelo = (DefaultTableModel) tblCronograma1.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 1:
                            modelo = (DefaultTableModel) tblCronograma2.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 2:
                            modelo = (DefaultTableModel) tblCronograma3.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 3:
                            modelo = (DefaultTableModel) tblCronograma4.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 4:
                            modelo = (DefaultTableModel) tblCronograma5.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 5:
                            modelo = (DefaultTableModel) tblCronograma6.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 6:
                            modelo = (DefaultTableModel) tblCronograma7.getModel();
                            modelo.addRow(datos3);
                            break;
                        case 7:
                            modelo = (DefaultTableModel) tblCronograma8.getModel();
                            modelo.addRow(datos3);
                            break;
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void irALigasUsuario() {
        UILigasUsuario ui = new UILigasUsuario(usuarioActivo);
        ui.setVisible(true);
        this.setVisible(false);
    }

    private void regresar() {
        UIPrincipalAdmin ui = new UIPrincipalAdmin();
        ui.setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(UIPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPrediccion1;
    private javax.swing.JButton btnGenerarPrediccion2;
    private javax.swing.JButton btnGenerarPrediccion3;
    private javax.swing.JButton btnGenerarPrediccion4;
    private javax.swing.JButton btnGenerarPrediccion5;
    private javax.swing.JButton btnGenerarPrediccion6;
    private javax.swing.JButton btnGenerarPrediccion7;
    private javax.swing.JButton btnGenerarPrediccion8;
    private javax.swing.JButton btnLigas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JScrollPane jScrollPane10;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTable tblCronograma1;
    public javax.swing.JTable tblCronograma2;
    public javax.swing.JTable tblCronograma3;
    public javax.swing.JTable tblCronograma4;
    public javax.swing.JTable tblCronograma5;
    public javax.swing.JTable tblCronograma6;
    public javax.swing.JTable tblCronograma7;
    public javax.swing.JTable tblCronograma8;
    // End of variables declaration//GEN-END:variables
}
