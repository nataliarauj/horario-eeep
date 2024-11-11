
package pacBancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    
        private static final String driver = "com.mysql.jdbc.Driver";
        private static final String url = "jdbc:mysql://localhost/escola";
        private static final String usuario = "root";
        private static final String senha = "";
                
    
    public static Connection getConexao() throws SQLException {
        
        try {
            
            Class.forName(driver);           
            
             return DriverManager.getConnection(
                
                     url, usuario, senha
             );

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }

    }
    
    public static void closeConexao(Connection con){
    
        if(con != null){
  
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error");
            }
        }
    }
    
    public static void closeConexao(Connection con, PreparedStatement stmt){
    
        if(stmt != null){
  
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error");
            }
        }
        closeConexao(con);
    }
    
    public static void closeConexao(Connection con, PreparedStatement stmt, ResultSet rs){
    
        if(rs != null){
  
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error");
            }
        }
        closeConexao(con, stmt);
        
    }
  
    
}
