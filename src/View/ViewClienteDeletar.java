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
public class ViewClienteDeletar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewClienteDeletar
     */
    public ViewClienteDeletar() {
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

        GrupoSexoClDeletar = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        txtClDeletarNome = new javax.swing.JTextField();
        txtClDeletarEmail = new javax.swing.JTextField();
        txtClDeletarTelefone = new javax.swing.JFormattedTextField();
        txtClDeletarCpf = new javax.swing.JFormattedTextField();
        SexoMasculino = new javax.swing.JRadioButton();
        SexoFeminino = new javax.swing.JRadioButton();
        btnClDeletarCancelar = new javax.swing.JButton();
        btnClDeletarSalvar = new javax.swing.JButton();
        ConfirmacaoDeletar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cliente - Deletar");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-icon.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente - Alterar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        Nome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Nome.setText("Nome *:");

        Cpf.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Cpf.setText("Cpf *:");

        Sexo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Sexo.setText("Sexo *:");

        Email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Email.setText("Email *:");

        Telefone.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Telefone.setText("Telefone:");

        txtClDeletarNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtClDeletarEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txtClDeletarTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtClDeletarCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        GrupoSexoClDeletar.add(SexoMasculino);
        SexoMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoMasculino.setText("Masculino");

        GrupoSexoClDeletar.add(SexoFeminino);
        SexoFeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoFeminino.setText("Feminino");

        btnClDeletarCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnClDeletarCancelar.setText("Cancelar");
        btnClDeletarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClDeletarCancelarActionPerformed(evt);
            }
        });

        btnClDeletarSalvar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnClDeletarSalvar.setText("Deletar");
        btnClDeletarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClDeletarSalvarActionPerformed(evt);
            }
        });

        ConfirmacaoDeletar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ConfirmacaoDeletar.setText("*Realmente desejar Deletar?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmacaoDeletar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Email)
                                .addComponent(Sexo)
                                .addComponent(Cpf)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefone)
                                    .addComponent(Nome, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(SexoMasculino)
                                    .addGap(43, 43, 43)
                                    .addComponent(SexoFeminino))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClDeletarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClDeletarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClDeletarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClDeletarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnClDeletarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClDeletarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(txtClDeletarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(txtClDeletarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(SexoMasculino)
                    .addComponent(SexoFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(txtClDeletarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(txtClDeletarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ConfirmacaoDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClDeletarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClDeletarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClDeletarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClDeletarCancelarActionPerformed
        txtClDeletarNome.setText("");
        txtClDeletarNome.setBackground(Color.WHITE);

        txtClDeletarCpf.setText("");
        txtClDeletarCpf.setBackground(Color.white);

        GrupoSexoClDeletar.clearSelection();

        txtClDeletarEmail.setText("");
        txtClDeletarEmail.setBackground(Color.WHITE);

        txtClDeletarTelefone.setText("");
        txtClDeletarTelefone.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnClDeletarCancelarActionPerformed

    private void btnClDeletarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClDeletarSalvarActionPerformed
        try{
            JOptionPane.showMessageDialog(this, "Deletado com Sucesso");
            ViewClienteDeletar.this.dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no Cadastro, por favor verificar todos os campos");
        }

        /* Fazer implementação com o Banco de Dados */
    }//GEN-LAST:event_btnClDeletarSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmacaoDeletar;
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Email;
    private javax.swing.ButtonGroup GrupoSexoClDeletar;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Sexo;
    private javax.swing.JRadioButton SexoFeminino;
    private javax.swing.JRadioButton SexoMasculino;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton btnClDeletarCancelar;
    private javax.swing.JButton btnClDeletarSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtClDeletarCpf;
    private javax.swing.JTextField txtClDeletarEmail;
    private javax.swing.JTextField txtClDeletarNome;
    private javax.swing.JFormattedTextField txtClDeletarTelefone;
    // End of variables declaration//GEN-END:variables
}
