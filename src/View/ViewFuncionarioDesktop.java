/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Lucas
 */
public class ViewFuncionarioDesktop extends javax.swing.JFrame {

    /**
     * Creates new form ViewFuncionarioDesktop
     */
    public ViewFuncionarioDesktop() {
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

        DesktopFuncionario = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnFnDesktopFile = new javax.swing.JMenu();
        MnFnDesktopSair = new javax.swing.JMenuItem();
        MnFnDesktopNavegador = new javax.swing.JMenu();
        MnFnDesktopAlterar = new javax.swing.JMenuItem();
        MnFnDesktopDeletar = new javax.swing.JMenuItem();
        MnFnDesktopProduto = new javax.swing.JMenu();
        MnFnDesktopCarrinho = new javax.swing.JMenuItem();
        MnFnDesktopCadastrarProduto = new javax.swing.JMenuItem();
        MnFnDesktopEstoque = new javax.swing.JMenuItem();
        MnFnDesktopPesquisar = new javax.swing.JMenuItem();
        MnFnDesktopRelatorio = new javax.swing.JMenu();
        MnFnDesktopRelatorioCliente = new javax.swing.JMenuItem();
        MnFnDesktopRelatorioMensal = new javax.swing.JMenuItem();
        MnFnDesktopSobre = new javax.swing.JMenu();
        MnFnDesktopLoja = new javax.swing.JMenuItem();
        MnFnDesktopCriadores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopFuncionarioLayout = new javax.swing.GroupLayout(DesktopFuncionario);
        DesktopFuncionario.setLayout(DesktopFuncionarioLayout);
        DesktopFuncionarioLayout.setHorizontalGroup(
            DesktopFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        DesktopFuncionarioLayout.setVerticalGroup(
            DesktopFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        MnFnDesktopFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/file-icon.png"))); // NOI18N
        MnFnDesktopFile.setText("Arquivo");

        MnFnDesktopSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MnFnDesktopSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit-icon.png"))); // NOI18N
        MnFnDesktopSair.setText("Sair");
        MnFnDesktopSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopSairActionPerformed(evt);
            }
        });
        MnFnDesktopFile.add(MnFnDesktopSair);

        jMenuBar1.add(MnFnDesktopFile);

        MnFnDesktopNavegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente-icon.png"))); // NOI18N
        MnFnDesktopNavegador.setText("Funcionário");

        MnFnDesktopAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person-edit-icon.png"))); // NOI18N
        MnFnDesktopAlterar.setText("Alterar Cadastro");
        MnFnDesktopAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopAlterarActionPerformed(evt);
            }
        });
        MnFnDesktopNavegador.add(MnFnDesktopAlterar);

        MnFnDesktopDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person-delete-icon.png"))); // NOI18N
        MnFnDesktopDeletar.setText("Deletar Cadastro");
        MnFnDesktopDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopDeletarActionPerformed(evt);
            }
        });
        MnFnDesktopNavegador.add(MnFnDesktopDeletar);

        jMenuBar1.add(MnFnDesktopNavegador);

        MnFnDesktopProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto-icon.png"))); // NOI18N
        MnFnDesktopProduto.setText("Produto");

        MnFnDesktopCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho-icon.png"))); // NOI18N
        MnFnDesktopCarrinho.setText("Meu Carrinho");
        MnFnDesktopCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopCarrinhoActionPerformed(evt);
            }
        });
        MnFnDesktopProduto.add(MnFnDesktopCarrinho);

        MnFnDesktopCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/brinquedo-icon.png"))); // NOI18N
        MnFnDesktopCadastrarProduto.setText("Cadastrar Produto");
        MnFnDesktopCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopCadastrarProdutoActionPerformed(evt);
            }
        });
        MnFnDesktopProduto.add(MnFnDesktopCadastrarProduto);

        MnFnDesktopEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque-icon.png"))); // NOI18N
        MnFnDesktopEstoque.setText("Estoque Produto");
        MnFnDesktopEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopEstoqueActionPerformed(evt);
            }
        });
        MnFnDesktopProduto.add(MnFnDesktopEstoque);

        MnFnDesktopPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar-icon.png"))); // NOI18N
        MnFnDesktopPesquisar.setText("Pesquisar Produto");
        MnFnDesktopProduto.add(MnFnDesktopPesquisar);

        jMenuBar1.add(MnFnDesktopProduto);

        MnFnDesktopRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio-icon.png"))); // NOI18N
        MnFnDesktopRelatorio.setText("Relatório");

        MnFnDesktopRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio-cliente-icon.png"))); // NOI18N
        MnFnDesktopRelatorioCliente.setText("Relatório Cliente");
        MnFnDesktopRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopRelatorioClienteActionPerformed(evt);
            }
        });
        MnFnDesktopRelatorio.add(MnFnDesktopRelatorioCliente);

        MnFnDesktopRelatorioMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio-mensal-icon.png"))); // NOI18N
        MnFnDesktopRelatorioMensal.setText("Relatório Mensal");
        MnFnDesktopRelatorioMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopRelatorioMensalActionPerformed(evt);
            }
        });
        MnFnDesktopRelatorio.add(MnFnDesktopRelatorioMensal);

        jMenuBar1.add(MnFnDesktopRelatorio);

        MnFnDesktopSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/info-icon.png"))); // NOI18N
        MnFnDesktopSobre.setText("Sobre");

        MnFnDesktopLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loja-icon.png"))); // NOI18N
        MnFnDesktopLoja.setText("Sobre a Loja");
        MnFnDesktopSobre.add(MnFnDesktopLoja);

        MnFnDesktopCriadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/team-icon.png"))); // NOI18N
        MnFnDesktopCriadores.setText("Sobre os Criadores");
        MnFnDesktopCriadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFnDesktopCriadoresActionPerformed(evt);
            }
        });
        MnFnDesktopSobre.add(MnFnDesktopCriadores);

        jMenuBar1.add(MnFnDesktopSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopFuncionario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopFuncionario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnFnDesktopSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopSairActionPerformed
        ViewFuncionarioDesktop.this.dispose();
    }//GEN-LAST:event_MnFnDesktopSairActionPerformed

    private void MnFnDesktopAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopAlterarActionPerformed
        ViewFuncionarioAlterar viewFuncionarioAltera = new ViewFuncionarioAlterar();
        DesktopFuncionario.add(viewFuncionarioAltera);
        viewFuncionarioAltera.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopAlterarActionPerformed

    private void MnFnDesktopDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopDeletarActionPerformed
        ViewFuncionarioDeletar viewFuncionarioDeletar = new ViewFuncionarioDeletar();
        DesktopFuncionario.add(viewFuncionarioDeletar);
        viewFuncionarioDeletar.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopDeletarActionPerformed

    private void MnFnDesktopCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopCarrinhoActionPerformed
        ViewMeuCarrinho viewMeuCarrinho = new ViewMeuCarrinho();
        DesktopFuncionario.add(viewMeuCarrinho);
        viewMeuCarrinho.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopCarrinhoActionPerformed

    private void MnFnDesktopCriadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopCriadoresActionPerformed
        new ViewCriadores().setVisible(true);
    }//GEN-LAST:event_MnFnDesktopCriadoresActionPerformed

    private void MnFnDesktopRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopRelatorioClienteActionPerformed
        ViewRelatorioCliente viewRelatorioCliente = new ViewRelatorioCliente();
        DesktopFuncionario.add(viewRelatorioCliente);
        viewRelatorioCliente.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopRelatorioClienteActionPerformed

    private void MnFnDesktopRelatorioMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopRelatorioMensalActionPerformed
        ViewRelatorioMensal viewRelatorioMensal = new ViewRelatorioMensal();
        DesktopFuncionario.add(viewRelatorioMensal);
        viewRelatorioMensal.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopRelatorioMensalActionPerformed

    private void MnFnDesktopEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopEstoqueActionPerformed
        ViewEstoque viewEstoque = new ViewEstoque();
        DesktopFuncionario.add(viewEstoque);
        viewEstoque.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopEstoqueActionPerformed

    private void MnFnDesktopCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFnDesktopCadastrarProdutoActionPerformed
        ViewProdutoCadastra viewProdutoCadastrar = new ViewProdutoCadastra();
        DesktopFuncionario.add(viewProdutoCadastrar);
        viewProdutoCadastrar.setVisible(true);
    }//GEN-LAST:event_MnFnDesktopCadastrarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFuncionarioDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionarioDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionarioDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionarioDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFuncionarioDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopFuncionario;
    private javax.swing.JMenuItem MnFnDesktopAlterar;
    private javax.swing.JMenuItem MnFnDesktopCadastrarProduto;
    private javax.swing.JMenuItem MnFnDesktopCarrinho;
    private javax.swing.JMenuItem MnFnDesktopCriadores;
    private javax.swing.JMenuItem MnFnDesktopDeletar;
    private javax.swing.JMenuItem MnFnDesktopEstoque;
    private javax.swing.JMenu MnFnDesktopFile;
    private javax.swing.JMenuItem MnFnDesktopLoja;
    private javax.swing.JMenu MnFnDesktopNavegador;
    private javax.swing.JMenuItem MnFnDesktopPesquisar;
    private javax.swing.JMenu MnFnDesktopProduto;
    private javax.swing.JMenu MnFnDesktopRelatorio;
    private javax.swing.JMenuItem MnFnDesktopRelatorioCliente;
    private javax.swing.JMenuItem MnFnDesktopRelatorioMensal;
    private javax.swing.JMenuItem MnFnDesktopSair;
    private javax.swing.JMenu MnFnDesktopSobre;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}