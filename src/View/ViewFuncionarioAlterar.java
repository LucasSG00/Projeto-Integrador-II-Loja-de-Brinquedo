/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ViewFuncionarioAlterar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewFuncionarioAlterar
     */
    public ViewFuncionarioAlterar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexoFnAlterar = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFnAlterarNome = new javax.swing.JTextField();
        txtFnAlterarEmail = new javax.swing.JTextField();
        txtFnAlterarTelefone = new javax.swing.JFormattedTextField();
        txtFnAlterarCpf = new javax.swing.JFormattedTextField();
        SexoMasculino = new javax.swing.JRadioButton();
        SexoFeminino = new javax.swing.JRadioButton();
        btnFnAlterarCancelar = new javax.swing.JButton();
        btnFnAlterarSalvar = new javax.swing.JButton();

        setTitle("Funcionário - Alterar");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-icon.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionário - Alterar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Nome *:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Cpf *:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Sexo *:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Email *:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Telefone:");

        txtFnAlterarNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtFnAlterarEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txtFnAlterarTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFnAlterarCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        GrupoSexoFnAlterar.add(SexoMasculino);
        SexoMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoMasculino.setText("Masculino");

        GrupoSexoFnAlterar.add(SexoFeminino);
        SexoFeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoFeminino.setText("Feminino");

        btnFnAlterarCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnFnAlterarCancelar.setText("Cancelar");
        btnFnAlterarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFnAlterarCancelarActionPerformed(evt);
            }
        });

        btnFnAlterarSalvar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnFnAlterarSalvar.setText("Salvar");
        btnFnAlterarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFnAlterarSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnFnAlterarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFnAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFnAlterarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFnAlterarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFnAlterarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(SexoMasculino)
                                        .addGap(43, 43, 43)
                                        .addComponent(SexoFeminino))))))
                    .addComponent(btnFnAlterarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFnAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFnAlterarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SexoMasculino)
                    .addComponent(SexoFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFnAlterarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFnAlterarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFnAlterarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFnAlterarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFnAlterarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFnAlterarCancelarActionPerformed
        /* Irar buscar os dados do banco de dados para fazer repor nos campos */
        txtFnAlterarNome.setText("");
        txtFnAlterarNome.setBackground(Color.WHITE);

        txtFnAlterarCpf.setText("");
        txtFnAlterarCpf.setBackground(Color.white);

        GrupoSexoFnAlterar.clearSelection();

        txtFnAlterarEmail.setText("");
        txtFnAlterarEmail.setBackground(Color.WHITE);

        txtFnAlterarTelefone.setText("");
        txtFnAlterarTelefone.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFnAlterarCancelarActionPerformed

    private void btnFnAlterarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFnAlterarSalvarActionPerformed
        try{
            /* Irar buscar os dados do banco de dados para fazer alteração */
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso");
            ViewFuncionarioAlterar.this.dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no Cadastro, por favor verificar todos os campos");
        }

        /* Fazer implementação com o Banco de Dados */
    }//GEN-LAST:event_btnFnAlterarSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoSexoFnAlterar;
    private javax.swing.JRadioButton SexoFeminino;
    private javax.swing.JRadioButton SexoMasculino;
    private javax.swing.JButton btnFnAlterarCancelar;
    private javax.swing.JButton btnFnAlterarSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtFnAlterarCpf;
    private javax.swing.JTextField txtFnAlterarEmail;
    private javax.swing.JTextField txtFnAlterarNome;
    private javax.swing.JFormattedTextField txtFnAlterarTelefone;
    // End of variables declaration//GEN-END:variables
}
