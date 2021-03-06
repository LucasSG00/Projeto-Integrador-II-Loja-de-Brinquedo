/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ViewClienteCadastra extends javax.swing.JDialog {

    /**
     * Creates new form ViewClienteCadastraD
     */
    public ViewClienteCadastra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        GrupoSexoClCadastro = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClCadastroNome = new javax.swing.JTextField();
        txtClCadastroEmail = new javax.swing.JTextField();
        txtClCadastroTelefone = new javax.swing.JFormattedTextField();
        txtClCadastroCpf = new javax.swing.JFormattedTextField();
        SexoMasculino = new javax.swing.JRadioButton();
        SexoFeminino = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClCadastroCancelar = new javax.swing.JButton();
        btnClCadastroSalvar = new javax.swing.JButton();
        txtClCadastroLogin = new javax.swing.JTextField();
        txtClCadastroSenha = new javax.swing.JPasswordField();
        txtClCadastroConfSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnClCadastroFile = new javax.swing.JMenu();
        MnClCadastroSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-icon.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro - Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

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

        txtClCadastroNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClCadastroNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroNomeFocusLost(evt);
            }
        });

        txtClCadastroEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClCadastroEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroEmailFocusLost(evt);
            }
        });

        try {
            txtClCadastroTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtClCadastroCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClCadastroCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroCpfFocusLost(evt);
            }
        });

        GrupoSexoClCadastro.add(SexoMasculino);
        SexoMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoMasculino.setText("Masculino");

        GrupoSexoClCadastro.add(SexoFeminino);
        SexoFeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SexoFeminino.setText("Feminino");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Login *:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Senha *:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Confirmar Senha *:");

        btnClCadastroCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnClCadastroCancelar.setText("Cancelar");
        btnClCadastroCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClCadastroCancelarActionPerformed(evt);
            }
        });

        btnClCadastroSalvar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnClCadastroSalvar.setText("Salvar");
        btnClCadastroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClCadastroSalvarActionPerformed(evt);
            }
        });

        txtClCadastroLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClCadastroLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroLoginFocusLost(evt);
            }
        });

        txtClCadastroSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClCadastroSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroSenhaFocusLost(evt);
            }
        });

        txtClCadastroConfSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClCadastroConfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClCadastroConfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClCadastroConfSenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnClCadastroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnClCadastroSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(SexoMasculino)
                                .addGap(43, 43, 43)
                                .addComponent(SexoFeminino))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClCadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClCadastroConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SexoMasculino)
                    .addComponent(SexoFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtClCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClCadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtClCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtClCadastroConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClCadastroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClCadastroSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        MnClCadastroFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/file-icon.png"))); // NOI18N
        MnClCadastroFile.setText("Arquivo");

        MnClCadastroSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MnClCadastroSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit-icon.png"))); // NOI18N
        MnClCadastroSair.setText("Sair");
        MnClCadastroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnClCadastroSairActionPerformed(evt);
            }
        });
        MnClCadastroFile.add(MnClCadastroSair);

        jMenuBar1.add(MnClCadastroFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnClCadastroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnClCadastroSairActionPerformed
        ViewClienteCadastra.this.dispose();
    }//GEN-LAST:event_MnClCadastroSairActionPerformed

    private void btnClCadastroCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClCadastroCancelarActionPerformed
        txtClCadastroNome.setText("");
        txtClCadastroNome.setBackground(Color.white);
        
        txtClCadastroCpf.setText("");
        txtClCadastroCpf.setBackground(Color.white);
        
        GrupoSexoClCadastro.clearSelection();
        
        txtClCadastroEmail.setText("");
        txtClCadastroEmail.setBackground(Color.white);
        
        txtClCadastroTelefone.setText("");
        txtClCadastroTelefone.setBackground(Color.white);
        
        txtClCadastroLogin.setText("");
        txtClCadastroLogin.setBackground(Color.white);
        
        txtClCadastroSenha.setText("");
        txtClCadastroSenha.setBackground(Color.white);
        
        txtClCadastroConfSenha.setText("");
        txtClCadastroConfSenha.setBackground(Color.white);        
    }//GEN-LAST:event_btnClCadastroCancelarActionPerformed

    private void btnClCadastroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClCadastroSalvarActionPerformed
        try{
            /* Irar no banco de dados para salvar os dados */
            if("".equals(txtClCadastroNome.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Nome' em Branco");            
            }
            if("".equals(txtClCadastroCpf.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'CPF' em Branco");            
            }
            if("".equals(txtClCadastroEmail.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Email' em Branco");            
            }      
            if("".equals(txtClCadastroLogin.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Login' em Branco");            
            }
            if("".equals(txtClCadastroSenha.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Senha' em Branco");            
            }
            if("".equals(txtClCadastroConfSenha.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Confirmar Senha' em Branco");            
            }
            
            if (!txtClCadastroSenha.getText().equals(txtClCadastroConfSenha.getText())) {
                JOptionPane.showMessageDialog(this, "Campo 'Senha' e 'Confirmar Senha' não são iguais");
                txtClCadastroSenha.setBackground(Color.red);
                txtClCadastroConfSenha.setBackground(Color.red);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro no Cadastro, por favor verificar todos os campos");
        }
        
        /* Fazer implementação com o Banco de Dados */
    }//GEN-LAST:event_btnClCadastroSalvarActionPerformed

    private void txtClCadastroNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroNomeFocusLost
        if(txtClCadastroNome.getText().trim().equals("")) {
            txtClCadastroNome.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroNomeFocusLost

    private void txtClCadastroNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroNomeFocusGained
        txtClCadastroNome.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroNomeFocusGained

    private void txtClCadastroCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroCpfFocusGained
        txtClCadastroCpf.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroCpfFocusGained

    private void txtClCadastroCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroCpfFocusLost
        if(txtClCadastroCpf.getText().trim().equals("")) {
            txtClCadastroCpf.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroCpfFocusLost

    private void txtClCadastroEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroEmailFocusGained
        txtClCadastroEmail.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroEmailFocusGained

    private void txtClCadastroEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroEmailFocusLost
        if(txtClCadastroEmail.getText().trim().equals("")) {
            txtClCadastroEmail.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroEmailFocusLost

    private void txtClCadastroLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroLoginFocusGained
        txtClCadastroLogin.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroLoginFocusGained

    private void txtClCadastroLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroLoginFocusLost
        if(txtClCadastroLogin.getText().trim().equals("")) {
            txtClCadastroLogin.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroLoginFocusLost

    private void txtClCadastroSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroSenhaFocusGained
        txtClCadastroSenha.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroSenhaFocusGained

    private void txtClCadastroSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroSenhaFocusLost
        if(txtClCadastroSenha.getText().trim().equals("")) {
            txtClCadastroSenha.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroSenhaFocusLost

    private void txtClCadastroConfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroConfSenhaFocusGained
        txtClCadastroConfSenha.setBackground(Color.white);
    }//GEN-LAST:event_txtClCadastroConfSenhaFocusGained

    private void txtClCadastroConfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClCadastroConfSenhaFocusLost
        if(txtClCadastroConfSenha.getText().trim().equals("")) {
            txtClCadastroConfSenha.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtClCadastroConfSenhaFocusLost

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
            java.util.logging.Logger.getLogger(ViewClienteCadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClienteCadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClienteCadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClienteCadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewClienteCadastra dialog = new ViewClienteCadastra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoSexoClCadastro;
    private javax.swing.JMenu MnClCadastroFile;
    private javax.swing.JMenuItem MnClCadastroSair;
    private javax.swing.JRadioButton SexoFeminino;
    private javax.swing.JRadioButton SexoMasculino;
    private javax.swing.JButton btnClCadastroCancelar;
    private javax.swing.JButton btnClCadastroSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtClCadastroConfSenha;
    private javax.swing.JFormattedTextField txtClCadastroCpf;
    private javax.swing.JTextField txtClCadastroEmail;
    private javax.swing.JTextField txtClCadastroLogin;
    private javax.swing.JTextField txtClCadastroNome;
    private javax.swing.JPasswordField txtClCadastroSenha;
    private javax.swing.JFormattedTextField txtClCadastroTelefone;
    // End of variables declaration//GEN-END:variables
}
