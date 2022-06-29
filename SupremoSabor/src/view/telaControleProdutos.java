
package view;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class telaControleProdutos extends javax.swing.JInternalFrame {
    private int Codigo;
    private String Descricao;
    private Double ValorUnitario;
    private int Validade;
    
    public telaControleProdutos() {
        initComponents();
    }
    public void criarProduto(){
        Connection con = connectionFactory.obterConexao();
        PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produto (Codigo, Descricao, ValorUnitario,Validade) VALUES(?,?,?,?)");

    stmt.setInt(1, Codigo);
    stmt.setString(2, Descricao);
    stmt.setDouble(3, ValorUnitario);
    stmt.setInt(4, Validade);

    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao Salvar!" + ex);
    }finally{
        connectionFactory.fecharConexao(con, stmt);
    }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisaCodigo = new javax.swing.JButton();
        btnPesquisaDescricao = new javax.swing.JButton();
        txtValidadeDias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Supremo Sabor - Controle de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel1.setText("Código");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Unitário");

        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Validade em dias");

        btnPesquisaCodigo.setText("Pesquisar");
        btnPesquisaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCodigoActionPerformed(evt);
            }
        });

        btnPesquisaDescricao.setText("Pesquisar");
        btnPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtValidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisaCodigo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisaDescricao)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnCadastar.setText("Cadastrar");
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    public void excluirProduto(){
    Connection con = connectionFactory.obterConexao();
    PreparedStatement stmt = null;
    try {
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM produto WHERE codigo = ?");
        stmt.setInt(1, Codigo);
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Apagado!");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao apagar!" + ex);
    }finally{
    connectionFactory.fecharConexao(con, stmt);
    }
}

    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um registro para esclusão");
            Limpar();
        }
        else
        {
        Codigo = Integer.parseInt(txtCodigo.getText());
        excluirProduto();
        Limpar();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
        Codigo = Integer.parseInt(txtCodigo.getText());
        Descricao = txtDescricao.getText();
        ValorUnitario = Double.parseDouble(txtValorUnitario.getText());       
        Validade = Integer.parseInt(txtValidadeDias.getText());

        criarProduto();
        Limpar();
    }//GEN-LAST:event_btnCadastarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed
    
    public void consultarCodigoProduto(){
        Connection con = connectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet resultado = null;

    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produto WHERE codigo = ?");
        stmt.setInt(1, Codigo);
        resultado = stmt.executeQuery();
        if (resultado.next()){
            resultado.first();         
            txtDescricao.setText(resultado.getString(2));
            txtValorUnitario.setText(resultado.getString(3));
            txtValidadeDias.setText(resultado.getString(4));
    } else{
        JOptionPane.showMessageDialog(null, "Consulta não encontrada!");
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Problemas com a execução" + ex);
    }finally{
        connectionFactory.fecharConexao(con, stmt, resultado);
    }
    }

    private void btnPesquisaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCodigoActionPerformed
        if ("".equals(txtCodigo.getText())){
            JOptionPane.showMessageDialog(null, "Digite o Código do Produto Para Consulta");
            txtCodigo.requestFocus();
        }else{
            Codigo = Integer.parseInt(txtCodigo.getText());
            consultarCodigoProduto();
 }

    }//GEN-LAST:event_btnPesquisaCodigoActionPerformed

    public void consultarDescricao(){
    Connection con = connectionFactory.obterConexao();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produto WHERE Descricao = ?");
        stmt.setString(1, Descricao);
        rs = stmt.executeQuery();
        if (rs.next()){
            rs.first();         
            txtCodigo.setText(rs.getString(1));
            txtValorUnitario.setText(rs.getString(3));
            txtValidadeDias.setText(rs.getString(4));
    } else{
        JOptionPane.showMessageDialog(null, "Consulta não encontrada!");
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Problemas com a execução" + ex);
    }finally{
        connectionFactory.fecharConexao(con, stmt, rs);
    }
 }
    
    private void btnPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDescricaoActionPerformed
        if ("".equals(txtDescricao.getText())){
            JOptionPane.showMessageDialog(null, "Digite a Descrição Para Consulta");
            txtDescricao.requestFocus();
        }else{
            Descricao = (txtDescricao.getText());
            consultarDescricao();
 }

    }//GEN-LAST:event_btnPesquisaDescricaoActionPerformed

    public void alterarDadosProduto(){
    Connection con = connectionFactory.obterConexao();
    PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement
            ("UPDATE produto SET  Descricao = ? , ValorUnitario = ?, Validade = ? WHERE Codigo =  ?");
        stmt.setString(1, Descricao);
        stmt.setDouble(2, ValorUnitario);
        stmt.setInt(3, Validade);
        stmt.setInt(4, Codigo);
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao Salvar!" + ex);
    }finally{
    connectionFactory.fecharConexao(con, stmt);
    }
}

    
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigo.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Selecione um registro para alteração dos dados");
          Limpar();
        }
        else
        {
        Codigo = Integer.parseInt(txtCodigo.getText());
        Descricao = txtDescricao.getText();
        ValorUnitario = Double.parseDouble(txtValorUnitario.getText());
        Validade = Integer.parseInt(txtValidadeDias.getText());
        alterarDadosProduto();
        Limpar();
        }

    }//GEN-LAST:event_btnAlterarActionPerformed
    public void Limpar(){
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtValorUnitario.setText("");
        txtValidadeDias.setText("");

        txtCodigo.requestFocus();
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisaCodigo;
    private javax.swing.JButton btnPesquisaDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValidadeDias;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
