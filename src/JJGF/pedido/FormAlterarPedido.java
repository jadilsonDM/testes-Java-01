/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.pedido;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import javax.swing.JOptionPane;
  import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jadil
 */
public class FormAlterarPedido extends javax.swing.JFrame {

     ArrayList<Pedido> ListaPedido = new ArrayList<>();
    /**
     * Creates new form FormAlterarPedido
     */
    public FormAlterarPedido() {
        initComponents();
        jTextFieldPEDIDO.setEditable(false);
          jComboBoxFORPAG.setSelectedIndex(-1);
           jComboBoxSTATOS.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPEDIDO = new javax.swing.JTextField();
        jTextFieldCLIENTE = new javax.swing.JTextField();
        jTextFieldFUNCIONARIO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldDATA = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLOCAL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldREFERENCIA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxFORPAG = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxSTATOS = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOBS = new javax.swing.JTextField();
        jButtonALTERAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();
        jButtonBUSCAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLISTApEDIDOS = new javax.swing.JTable();
        jTextFieldCARDAPIO = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("PEDIDO:");

        jLabel2.setText("CLIENTE:");

        jLabel3.setText("CARDAPIO:");

        jLabel4.setText("FUNCIONARIO:");

        jTextFieldCLIENTE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCLIENTEKeyTyped(evt);
            }
        });

        jLabel5.setText("DATA:");

        try {
            jFormattedTextFieldDATA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("LOCAL:");

        jLabel7.setText("REFERENCIA:");

        jLabel8.setText("FORM/PAG:");

        jComboBoxFORPAG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cartão", "dinheiro", "cheque" }));

        jLabel9.setText("STATOS:");

        jComboBoxSTATOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A CAMINHO", "OK" }));

        jLabel10.setText("OBS:");

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

        jButtonBUSCAR.setText("BUSCAR");
        jButtonBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUSCARActionPerformed(evt);
            }
        });

        jTableLISTApEDIDOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PEDIDO", "CLIENTE", "CARDAPIO", "FUNCIONARIO", "DATA", "LOCAL", "REFERENCIA", "PAGAMENTO", "STATOS", "OBSERVAÇÃO"
            }
        ));
        jTableLISTApEDIDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLISTApEDIDOSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableLISTApEDIDOS);
        if (jTableLISTApEDIDOS.getColumnModel().getColumnCount() > 0) {
            jTableLISTApEDIDOS.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBUSCAR)
                .addGap(343, 343, 343))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLOCAL, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldREFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSTATOS, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFORPAG, 0, 224, Short.MAX_VALUE)
                                .addGap(348, 348, 348))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCLIENTE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonALTERAR)
                                        .addGap(47, 47, 47))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCARDAPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEXCLUIR, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldFUNCIONARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonALTERAR)
                            .addComponent(jButtonEXCLUIR))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFUNCIONARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCARDAPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jFormattedTextFieldDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxFORPAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldLOCAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldREFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxSTATOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldOBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonBUSCAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARActionPerformed
        // TODO add your handling code here:
        
        try {
            Pedido filtro = new Pedido();
           
            
            DadosPedido dados = new DadosPedido();
          this.ListaPedido = dados.listar(filtro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"PEDIDO","CLIENTE","CARDAPIO","FUCIONARIO","DATA","LOCAL","REFERENCIA","PAGAMENTO","STATOS","OBSERVAÇÃO"});
           for (Pedido pedido : this.ListaPedido) {

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = (Date) pedido.getData_pedido();
                String s = df.format(date);
                
                modelo.addRow(new Object[]{pedido.getId_pedido(),pedido.getCliente().getIdCliente(),pedido.getCardapio().getId_cardapio(),pedido.getFuncionario().getIdFuncionario(),pedido.getData_pedido(),pedido.getLocal_entrega(),pedido.getPontoReferencia(),pedido.getForma_pagamento(),pedido.getStatos_pedido(),pedido.getObservacao()});
            }
            jTableLISTApEDIDOS.setModel(modelo);
            //JOptionPane.showMessageDialog(this, "Aluno cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonBUSCARActionPerformed

    private void jButtonALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTERARActionPerformed
        // TODO add your handling code here:
         try {
            Pedido p = new Pedido();
            
             String dataString = jFormattedTextFieldDATA.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime());
            
            if (jTextFieldPEDIDO.getText().matches("[0-9]+") == false) {
                JOptionPane.showMessageDialog(this, "Informe apenas números para a pedido");
                return;
            }
            p.setData_pedido(data);
            p.setForma_pagamento(jComboBoxFORPAG.getSelectedItem().toString());
            p.setLocal_entrega(jTextFieldLOCAL.getText());
            p.setObservacao(jTextFieldOBS.getText());
            p.setPontoReferencia(jTextFieldREFERENCIA.getText());
            p.setStatos_pedido(jComboBoxSTATOS.getSelectedItem().toString());
            p.getFuncionario().setIdFuncionario(Integer.parseInt(jTextFieldFUNCIONARIO.getText()));
            p.getCliente().setIdCliente(Integer.parseInt(jTextFieldCLIENTE.getText()));
            p.getCardapio().setId_cardapio(Integer.parseInt(jTextFieldCARDAPIO.getText()));
            p.setId_pedido(Integer.parseInt(jTextFieldPEDIDO.getText()));
            
            NegocioPedido dados = new NegocioPedido();
            dados.atualizarPedido(p);
            JOptionPane.showMessageDialog(this, "Pedido alterado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButtonALTERARActionPerformed

    private void jTableLISTApEDIDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLISTApEDIDOSMouseClicked
        // TODO add your handling code here:
        
         int linha = jTableLISTApEDIDOS.getSelectedRow();
        Pedido ped = this.ListaPedido.get(linha);
        
           DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = (Date) ped.getData_pedido();
                String s = df.format(date);
                
                
                
        jTextFieldPEDIDO.setText(ped.getId_pedido()+"");
        jTextFieldCLIENTE.setText(ped.getCliente().getIdCliente()+"");
        jTextFieldCARDAPIO.setText(ped.getCardapio().getId_cardapio()+"");
        jTextFieldFUNCIONARIO.setText(ped.getFuncionario().getIdFuncionario()+"");
        jFormattedTextFieldDATA.setText(s);
        jTextFieldLOCAL.setText(ped.getLocal_entrega());
        jTextFieldREFERENCIA.setText(ped.getPontoReferencia());
       
        jTextFieldOBS.setText(ped.getObservacao());       
        
         for (int i = 0; i < jComboBoxFORPAG.getModel().getSize(); i++) {
            if (ped.getForma_pagamento().equals(jComboBoxFORPAG.getModel().getElementAt(i))) {
                jComboBoxFORPAG.setSelectedIndex(i);
                break;
            }
         }   
        for (int i = 0; i < jComboBoxSTATOS.getModel().getSize(); i++) {
          if (ped.getStatos_pedido().equals(jComboBoxSTATOS.getModel().getElementAt(i))) {
                jComboBoxSTATOS.setSelectedIndex(i);
                break;
            
            
        }   
        }
    }//GEN-LAST:event_jTableLISTApEDIDOSMouseClicked

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
        // TODO add your handling code here:
        
         try {
            Pedido p = new Pedido();
         
            p.setId_pedido(Integer.parseInt(jTextFieldPEDIDO.getText()));
         
            
            DadosPedido dados = new DadosPedido();
            dados.removerPedido(p);
            JOptionPane.showMessageDialog(this, "Pedido excluido");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jTextFieldCLIENTEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCLIENTEKeyTyped
        // TODO add your handling code here:
         char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
    }//GEN-LAST:event_jTextFieldCLIENTEKeyTyped
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
            java.util.logging.Logger.getLogger(FormAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlterarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALTERAR;
    private javax.swing.JButton jButtonBUSCAR;
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JComboBox jComboBoxFORPAG;
    private javax.swing.JComboBox jComboBoxSTATOS;
    private javax.swing.JFormattedTextField jFormattedTextFieldDATA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLISTApEDIDOS;
    private javax.swing.JTextField jTextFieldCARDAPIO;
    private javax.swing.JTextField jTextFieldCLIENTE;
    private javax.swing.JTextField jTextFieldFUNCIONARIO;
    private javax.swing.JTextField jTextFieldLOCAL;
    private javax.swing.JTextField jTextFieldOBS;
    private javax.swing.JTextField jTextFieldPEDIDO;
    private javax.swing.JTextField jTextFieldREFERENCIA;
    // End of variables declaration//GEN-END:variables
}