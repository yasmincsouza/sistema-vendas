package view;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class telaControleCliente extends javax.swing.JInternalFrame {
    private String Nome;
    private String Celular;
    private String Email;
    
    public telaControleCliente() {
        initComponents();
    }
    
    public void criarCliente(){
        Connection con = connectionFactory.obterConexao();
        PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO cliente (Nome, Celular, Email) VALUES(?,?,?)");

    stmt.setString(1, Nome);
    stmt.setString(2, Celular);
    stmt.setString(3, Email);

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

        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        btnPesquisarCelular = new javax.swing.JButton();
        txtCelular = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField3.setText("jTextField3");

        setClosable(true);
        setTitle("Controle de Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone/Celular");

        jLabel3.setText("E-mail");

        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        btnPesquisarCelular.setText("Pesquisar");
        btnPesquisarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCelularActionPerformed(evt);
            }
        });

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisarNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(165, 165, 165))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCelular)
                                        .addGap(44, 44, 44)))
                                .addComponent(btnPesquisarCelular)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Nome = txtNome.getText();
        Celular = txtCelular.getText();
        Email = txtEmail.getText();
        criarCliente();
        Limpar();
    }//GEN-LAST:event_btnCadastrarActionPerformed
 
    public void excluirCliente(){
    Connection con = connectionFactory.obterConexao();
    PreparedStatement stmt = null;
    try {
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM cliente WHERE celular = ?");
        stmt.setString(1, Celular);
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Apagado!");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao apagar!" + ex);
    }finally{
    connectionFactory.fecharConexao(con, stmt);
    }
}
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um registro para esclusão");
            Limpar();
        }
        else{
            Nome = txtNome.getText();
            excluirCliente();
            Limpar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void Limpar(){
        txtNome.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtNome.requestFocus();
    }
        
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    public void alterarDadosCliente(){
    Connection con = connectionFactory.obterConexao();
    PreparedStatement stmt = null;
    
    try {
        stmt = (PreparedStatement) con.prepareStatement
            ("UPDATE cliente SET Celular = ? , Email = ? WHERE Nome =  ?");
        stmt.setString(1, Celular);
        stmt.setString(2, Email);
        stmt.setString(3, Nome);
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao Salvar!" + ex);
    }finally{
    connectionFactory.fecharConexao(con, stmt);
    }
}   
    
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtNome.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Selecione um registro para alteração dos dados");
          Limpar();
        }
        else
        {
        Nome = txtNome.getText();
        Celular = txtCelular.getText();
        Email = txtEmail.getText();
        alterarDadosCliente();
        Limpar();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    public void consultarNome(){
        Connection con = connectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet resultado = null;

    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente WHERE nome = ?");
        stmt.setString(1, Nome);
        resultado = stmt.executeQuery();
        if (resultado.next()){
            resultado.first();         
            txtNome.setText(resultado.getString(1));
            txtCelular.setText(resultado.getString(2));
            txtEmail.setText(resultado.getString(3));
    } else{
        JOptionPane.showMessageDialog(null, "Consulta não encontrada!");
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Problemas com a execução" + ex);
    }finally{
        connectionFactory.fecharConexao(con, stmt, resultado);
    }
    }
    
    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
        if ("".equals(txtNome.getText())){
            JOptionPane.showMessageDialog(null, "Digite o nome do cliente para consulta!");
            txtNome.requestFocus();
        }else{
            Nome = (txtNome.getText());
            consultarNome();
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed
    }
    
    public void consultarCelular(){
        Connection con = connectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

    try {
        stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente WHERE celular = ?");
        stmt.setString(1, Celular);
        rs = stmt.executeQuery();
        if (rs.next()){
            rs.first();         
            txtNome.setText(rs.getString(1));
            txtCelular.setText(rs.getString(2));
            txtEmail.setText(rs.getString(3));
    } else{
        JOptionPane.showMessageDialog(null, "Consulta não encontrada!");
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Problemas com a execução" + ex);
    }finally{
        connectionFactory.fecharConexao(con, stmt, rs);
    }
 }
        
    private void btnPesquisarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCelularActionPerformed
        if ("".equals(txtCelular.getText())){
            JOptionPane.showMessageDialog(null, "Digite o Celular Para Consulta");
            txtCelular.requestFocus();
        }else{
            Celular = txtCelular.getText();
            consultarCelular();
 }
    }//GEN-LAST:event_btnPesquisarCelularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisarCelular;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
