/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.cliente;
  import java.util.ArrayList;
  import javax.swing.JOptionPane;
  import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jadil
 */
public class FormAlterarCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormAlterarCliente
     */
    public FormAlterarCliente() {
        initComponents();
        jTextFieldCODIGO.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonLISTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCLIENTE = new javax.swing.JTable();
        jTextFieldNOME = new javax.swing.JTextField();
        jFormattedTextFieldCELULAR = new javax.swing.JFormattedTextField();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jButtonALTERAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCODIGO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("NOME:");

        jLabel2.setText("CELULAR:");

        jLabel3.setText("E-MAIL:");

        jButtonLISTAR.setText("LISTAR");
        jButtonLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLISTARActionPerformed(evt);
            }
        });

        jTableCLIENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "CELULAR", "E-MAIL"
            }
        ));
        jTableCLIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCLIENTEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCLIENTE);

        try {
            jFormattedTextFieldCELULAR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonALTERAR.setText("ALTERAR");
        jButtonALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonALTERARActionPerformed(evt);
            }
        });

        jButtonEXCLUIR.setText("EXCLUIR");
        jButtonEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXCLUIRActionPerformed(evt);
            }
        });

        jLabel4.setText("CODIGO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Editar Dados Do Cliente.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jButtonLISTAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextFieldCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldNOME))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(268, 268, 268)))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonALTERAR)
                                    .addComponent(jButtonEXCLUIR))))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonALTERAR)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEXCLUIR))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButtonLISTAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLISTARActionPerformed
        // TODO add your handling code here:
        try {
            Cliente filtro = new Cliente();
           
            
            DadosCliente dados = new DadosCliente();
            ArrayList<Cliente> lista = dados.listar(filtro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CODIGO","NOME","CELULAR","E-MAIL"});
            for (Cliente cliente : lista) {
                modelo.addRow(new Object[]{cliente.getIdCliente(),cliente.getNomeCliente(),cliente.getCelular(),cliente.getEmail()});
            }
            jTableCLIENTE.setModel(modelo);
            //JOptionPane.showMessageDialog(this, "Aluno cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonLISTARActionPerformed

    private void jButtonALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTERARActionPerformed
        // TODO add your handling code here:
        
         try {
            Cliente c = new Cliente();
         
            c.setIdCliente(Integer.parseInt(jTextFieldCODIGO.getText()));
            c.setNomeCliente(jTextFieldNOME.getText());
            c.setCelular(jFormattedTextFieldCELULAR.getText());
            c.setEmail(jTextFieldEMAIL.getText());
           
            
            NegocioCliente dados = new NegocioCliente();
            dados.atualizarCLiente(c);
            JOptionPane.showMessageDialog(this, "Cliente alterado");
            
            jTextFieldCODIGO.setText("");
            jTextFieldNOME.setText("");
            jFormattedTextFieldCELULAR.setText("");
            jTextFieldEMAIL.setText("");
            
                    
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonALTERARActionPerformed

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
        // TODO add your handling code here:
        
         try {
            Cliente c = new Cliente();
         
            c.setIdCliente(Integer.parseInt(jTextFieldCODIGO.getText()));
         
            
            NegocioCliente dados = new NegocioCliente();
            dados.removerCLiente(c);
            JOptionPane.showMessageDialog(this, "Cardapio excluido");
            
              jTextFieldCODIGO.setText("");
            jTextFieldNOME.setText("");
            jFormattedTextFieldCELULAR.setText("");
            jTextFieldEMAIL.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jTableCLIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCLIENTEMouseClicked
        // TODO add your handling code here:
        
         int linha = jTableCLIENTE.getSelectedRow();
        jTextFieldCODIGO.setText(jTableCLIENTE.getValueAt(linha, 0).toString());
        jTextFieldNOME.setText(jTableCLIENTE.getValueAt(linha, 1).toString());
        jFormattedTextFieldCELULAR.setText(jTableCLIENTE.getValueAt(linha, 2).toString());
        jTextFieldEMAIL.setText(jTableCLIENTE.getValueAt(linha, 3).toString());
        
    }//GEN-LAST:event_jTableCLIENTEMouseClicked

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
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALTERAR;
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JButton jButtonLISTAR;
    private javax.swing.JFormattedTextField jFormattedTextFieldCELULAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCLIENTE;
    private javax.swing.JTextField jTextFieldCODIGO;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldNOME;
    // End of variables declaration//GEN-END:variables
}
