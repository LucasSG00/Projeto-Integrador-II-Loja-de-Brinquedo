/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.VendaController;
import DAO.VendaDAO;
import Model.Venda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus.Caetano
 */
public class ViewRelatorioVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewEstoque
     */
    public ViewRelatorioVenda() {
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

        jPanel1 = new javax.swing.JPanel();
        btnbuscaproduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        txtData = new javax.swing.JFormattedTextField();
        btnbuscaproduto1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtData1 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtData2 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalVendas = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Relatório de Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnbuscaproduto.setText("Buscar");
        btnbuscaproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaprodutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite uma Data:");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        jLabel8.setText("Vendas Realizadas");

        jLabel9.setText("Detalhes da Venda");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnbuscaproduto1.setText("Buscar");
        btnbuscaproduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaproduto1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Digite um Periodo:");

        try {
            txtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("De:");

        jLabel6.setText("Até:");

        try {
            txtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Total de Vendas Realizadas:");

        txtTotalVendas.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnbuscaproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnbuscaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))))
                        .addGap(241, 241, 241))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscaproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscaprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaprodutoActionPerformed
       String data = txtData.getText();
       if(data.equals("  /  /    ")){
           JOptionPane.showMessageDialog(this,"Digite uma Data");
       }
       else{
       ArrayList<Venda> listaVenda = VendaDAO.CarregarVendasRelatorio(data);
       if(listaVenda.size()>0){
        DefaultTableModel tmVenda = new DefaultTableModel()
                {
		@Override
		public boolean isCellEditable(final int row, final int column) {
			return false;
		}
	};
        tmVenda.addColumn("ID VENDA");
        tmVenda.addColumn("DATA");
        tmVenda.addColumn("VALOR PAGO");
        tmVenda.addColumn("CPF CLIENTE");
        tmVenda.addColumn("NOME CLIENTE");
       

        Tabela.setModel(tmVenda);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmVenda.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Venda v : listaVenda) {
            tmVenda.addRow(new Object[]{v.getIdVenda(),v.getData(),v.getValorVenda(), v.getCpfCliente(), v.getNomeCliente()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        Tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        Tabela.getColumnModel().getColumn(3).setPreferredWidth(40);
        Tabela.getColumnModel().getColumn(4).setPreferredWidth(160);
        int totalvendas = Tabela.getRowCount();
        txtTotalVendas.setText(Integer.toString(totalvendas));
        
       } else{
           JOptionPane.showMessageDialog(this,"Nenhuma venda realizada neste dia selecionado");
       }
       }
    }//GEN-LAST:event_btnbuscaprodutoActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
       int cod = (int) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
       ArrayList<Venda> listaVenda = VendaDAO.CarregarItensRelatorio(cod);

        DefaultTableModel tmVenda = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(final int row, final int column) {
			return false;
		}
	};
        tmVenda.addColumn("NOME PRODUTO");
        tmVenda.addColumn("QUANTIDADE");
        
       

        tblProdutos.setModel(tmVenda);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmVenda.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Venda v : listaVenda) {
            tmVenda.addRow(new Object[]{v.getNomeProduto(),v.getQtdItem()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void btnbuscaproduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaproduto1ActionPerformed
        String dedata = txtData1.getText();
        String atedata = txtData2.getText();
        if(dedata.equals("  /  /    ") || atedata.equals("  /  /    ")){
           JOptionPane.showMessageDialog(this,"Digite um periodo para realizar a busca");
        }
        else{
       ArrayList<Venda> listaVenda = VendaDAO.CarregarVendasRelatorioperiodo(dedata, atedata);
         if(listaVenda.size()>0){
        DefaultTableModel tmVenda = new DefaultTableModel()
                 {
		@Override
		public boolean isCellEditable(final int row, final int column) {
			return false;
		}
	};
        tmVenda.addColumn("ID VENDA");
        tmVenda.addColumn("DATA");
        tmVenda.addColumn("VALOR PAGO");
        tmVenda.addColumn("CPF CLIENTE");
        tmVenda.addColumn("NOME CLIENTE");
       

        Tabela.setModel(tmVenda);

        //Removo a coluna ID da View (JTable) mas mantenho na model para armazenar o ID
        // tblMaquina.removeColumn(tblMaquina.getColumnModel().getColumn(0));

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmVenda.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Venda v : listaVenda) {
            tmVenda.addRow(new Object[]{v.getIdVenda(),v.getData(),v.getValorVenda(), v.getCpfCliente(), v.getNomeCliente()});
        }
        //Defino o tamanho para cada coluna
        //tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        Tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        Tabela.getColumnModel().getColumn(3).setPreferredWidth(40);
        Tabela.getColumnModel().getColumn(4).setPreferredWidth(160);
        int totalvendas = Tabela.getRowCount();
        txtTotalVendas.setText(Integer.toString(totalvendas));
    
     }else{
             JOptionPane.showMessageDialog(this,"Nenhuma Venda realizada nessa periodo");
         }}  
    }//GEN-LAST:event_btnbuscaproduto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnbuscaproduto;
    private javax.swing.JButton btnbuscaproduto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JFormattedTextField txtData2;
    private javax.swing.JTextField txtTotalVendas;
    // End of variables declaration//GEN-END:variables
}