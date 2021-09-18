/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.funcionario;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
public class FormAlterarFuncionario extends javax.swing.JFrame {

    
    ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
            /**
             * Creates new form FormAlterarFuncionario
             */

    public FormAlterarFuncionario() {
        initComponents();
        jComboBoxCARGO.setSelectedIndex(-1);
        jComboBoxHBILITACAO.setSelectedIndex(-1);
         jComboBoxSEXO.setSelectedIndex(-1);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNOME = new javax.swing.JTextField();
        jComboBoxSEXO = new javax.swing.JComboBox();
        jFormattedTextFieldNASCIMENTO = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jComboBoxHBILITACAO = new javax.swing.JComboBox();
        jComboBoxCARGO = new javax.swing.JComboBox();
        jFormattedTextFieldCELULAR = new javax.swing.JFormattedTextField();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jTextFieldENDERECO = new javax.swing.JTextField();
        jTextFieldSALARIO = new javax.swing.JTextField();
        jButtonALTERAR = new javax.swing.JButton();
        jButtonEXCLUIR = new javax.swing.JButton();
        jButtonBUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLISTAR = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCODIGO = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("NOME:");

        jLabel2.setText("CPF:");

        jLabel3.setText("SEXO:");

        jLabel4.setText("NASCIMENTO:");

        jLabel5.setText("RG:");

        jLabel6.setText("HABILITAÇÃO:");

        jLabel7.setText("FUNÇÃO:");

        jLabel8.setText("CELULAR:");

        jLabel9.setText("E-MAIL:");

        jLabel10.setText("ENDEREÇO:");

        jLabel11.setText("SALARIO:");

        jComboBoxSEXO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        try {
            jFormattedTextFieldNASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxHBILITACAO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB" }));
        jComboBoxHBILITACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHBILITACAOActionPerformed(evt);
            }
        });

        jComboBoxCARGO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTREGADOR", "ATENDENTE", "SERVIÇOS GERAIS", "GERENTE" }));
        jComboBoxCARGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCARGOActionPerformed(evt);
            }
        });

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

        jButtonBUSCAR.setText("BUSCAR");
        jButtonBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUSCARActionPerformed(evt);
            }
        });

        jTableLISTAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "CELULAR", "CPF", "RG", "NASCIMENTO", "FUNÇÃO"
            }
        ));
        jTableLISTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLISTARMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLISTAR);

        jLabel12.setText("CODIGO:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Editar dado dos Funcionários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButtonBUSCAR))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldNASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxHBILITACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButtonALTERAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEXCLUIR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldSALARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(14, 14, 14)
                                        .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldNASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxHBILITACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonALTERAR)
                    .addComponent(jButtonEXCLUIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCARGO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextFieldCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBUSCAR)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldSALARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARActionPerformed
        // TODO add your handling code here:

        try {
            Funcionario filtro = new Funcionario();

            DadosFuncionario dados = new DadosFuncionario();
            this.listaFuncionarios = dados.listar(filtro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CODIGO", "NOME", "CELULAR", "CPF", "RG", "NASCIMENTO","FUNÇÃO"});
            for (Funcionario funcionario : this.listaFuncionarios) {

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = funcionario.getDataNacimento();
                String s = df.format(date);

                modelo.addRow(new Object[]{funcionario.getIdFuncionario(),funcionario.getNome(),funcionario.getCelular(),funcionario.getCpf(),funcionario.getRg(),funcionario.getDataNacimento(),funcionario.getCargo(),funcionario.getHabilitacao(),funcionario.getEmail(),funcionario.getEndereco(),funcionario.getSalario(),funcionario.getSexo()});
            }
            jTableLISTAR.setModel(modelo);
            //JOptionPane.showMessageDialog(this, "Aluno cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButtonBUSCARActionPerformed

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
        // TODO add your handling code here:

        try {
            Funcionario f = new Funcionario();

            f.setIdFuncionario(Integer.parseInt(jTextFieldCODIGO.getText()));

            DadosFuncionario dados = new DadosFuncionario();
            dados.removerFuncionario(f);
            JOptionPane.showMessageDialog(this, "Funcionario excluido");

            jTextFieldNOME.setText("");
            jComboBoxSEXO.setToolTipText("");

            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");

            jComboBoxCARGO.setToolTipText("");
            jFormattedTextFieldCELULAR.setText("");
            jTextFieldEMAIL.setText("");
            jTextFieldENDERECO.setText("");
            jTextFieldSALARIO.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jTableLISTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLISTARMouseClicked
        // TODO add your handling code here:
        
       


        int linha = jTableLISTAR.getSelectedRow();
        Funcionario func = this.listaFuncionarios.get(linha);
        
           DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = func.getDataNacimento();
                String s = df.format(date);
        
        jTextFieldCODIGO.setText(func.getIdFuncionario()+"");
        jTextFieldNOME.setText(func.getNome());
        jFormattedTextFieldCELULAR.setText(func.getCelular());
        jFormattedTextFieldCPF.setText(func.getCpf());
        jFormattedTextFieldRG.setText(func.getRg());
        jFormattedTextFieldNASCIMENTO.setText(s);
        jTextFieldEMAIL.setText(func.getEmail());
        jTextFieldENDERECO.setText(func.getEndereco());
        jTextFieldSALARIO.setText(func.getSalario()+"");
       

        for (int i = 0; i < jComboBoxCARGO.getModel().getSize(); i++) {
            if (func.getCargo().equals(jComboBoxCARGO.getModel().getElementAt(i))) {
                jComboBoxCARGO.setSelectedIndex(i);
                break;
            }

        }
        
         for (int i = 0; i < jComboBoxHBILITACAO.getModel().getSize(); i++) {
            if (func.getHabilitacao().equals(jComboBoxHBILITACAO.getModel().getElementAt(i))) {
                jComboBoxHBILITACAO.setSelectedIndex(i);
                break;
            }

        }
         
          for (int i = 0; i < jComboBoxSEXO.getModel().getSize(); i++) {
            if (func.getSexo().equals(jComboBoxSEXO.getModel().getElementAt(i))) {
                jComboBoxSEXO.setSelectedIndex(i);
                break;
            }

        }
          


    }//GEN-LAST:event_jTableLISTARMouseClicked

    private void jButtonALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTERARActionPerformed
        // TODO add your handling code here:

        try {
            Funcionario f = new Funcionario();

            String dataString = jFormattedTextFieldNASCIMENTO.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime());

            if (jTextFieldCODIGO.getText().matches("[0-9]+") == false) {
                JOptionPane.showMessageDialog(this, "Informe apenas números para o codigo");
                return;
            }
            f.setNome(jTextFieldNOME.getText());
            f.setSexo(jComboBoxSEXO.getSelectedItem().toString());
            f.setDataNacimento(data);
            f.setCpf(jFormattedTextFieldCPF.getText());
            f.setRg(jFormattedTextFieldRG.getText());
            f.setHabilitacao(jComboBoxHBILITACAO.getSelectedItem().toString());
            f.setCargo(jComboBoxCARGO.getSelectedItem().toString());
            f.setCelular(jFormattedTextFieldCELULAR.getText());
            f.setEmail(jTextFieldEMAIL.getText());
            f.setEndereco(jTextFieldENDERECO.getText());
            f.setSalario(Double.parseDouble(jTextFieldSALARIO.getText()));

            NegocioFuncionario dados = new NegocioFuncionario();
            dados.atualizarFuncionario(f);
            JOptionPane.showMessageDialog(this, "Funcionario alterado");

            jTextFieldNOME.setText("");
            jComboBoxSEXO.setToolTipText("");
            jFormattedTextFieldNASCIMENTO.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");
            jComboBoxHBILITACAO.setToolTipText("");
            jComboBoxCARGO.setToolTipText("");
            jFormattedTextFieldCELULAR.setText("");
            jTextFieldEMAIL.setText("");
            jTextFieldENDERECO.setText("");
            jTextFieldSALARIO.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_jButtonALTERARActionPerformed

    private void jComboBoxCARGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCARGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCARGOActionPerformed

    private void jComboBoxHBILITACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHBILITACAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHBILITACAOActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlterarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALTERAR;
    private javax.swing.JButton jButtonBUSCAR;
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JComboBox jComboBoxCARGO;
    private javax.swing.JComboBox jComboBoxHBILITACAO;
    private javax.swing.JComboBox jComboBoxSEXO;
    private javax.swing.JFormattedTextField jFormattedTextFieldCELULAR;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldNASCIMENTO;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLISTAR;
    private javax.swing.JTextField jTextFieldCODIGO;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldENDERECO;
    private javax.swing.JTextField jTextFieldNOME;
    private javax.swing.JTextField jTextFieldSALARIO;
    // End of variables declaration//GEN-END:variables
}
