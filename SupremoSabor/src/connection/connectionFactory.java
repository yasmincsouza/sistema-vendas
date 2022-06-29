package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connectionFactory {
    //Adicionando conexão
    public static Connection obterConexao(){
    try {
            return(Connection)DriverManager.getConnection("jdbc:mysql://localhost/supremosabordb","root","");
        }
    catch(SQLException excecao) {
        JOptionPane.showMessageDialog(null, "Erro de Conexão");
         throw new RuntimeException(excecao);
        }
    }   
    //Encerrando conexão
    public static void fecharConexao(Connection con){
    try {
         if (con!= null){
           con.close();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao fechar Conexão");
        Logger.getLogger(connectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }   
 }
    //Criando a sobrecarga
    public static void fecharConexao(Connection con, PreparedStatement stmt){
    fecharConexao(con);
    try {
         if (stmt!= null){
             stmt.close();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao fechar Conexão");
        Logger.getLogger(connectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs){
    fecharConexao(con, stmt);
    try {
        if (rs!= null){
            rs.close();
        }
    } catch (SQLException ex) {
        Logger.getLogger(connectionFactory.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
    
    
    
}
