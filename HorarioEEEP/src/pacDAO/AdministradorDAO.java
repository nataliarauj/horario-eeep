
package pacDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pacBancoDados.Conexao;
import pacLogica.Administrador;


public class AdministradorDAO {
    
    private Connection conexao;

    public AdministradorDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }
    public boolean Logar(String login, String senha)throws SQLException{
       
        boolean finalResult = false;
        
        try {                   
            String sql = "select login, senha from admin "
                    + "where login = '" + login + "' and "
                    + "senha = '" + senha + "'";
         PreparedStatement stmt = conexao.prepareStatement(sql);                       
            ResultSet rs = stmt.executeQuery();        
            if(rs != null){
                while (rs.next()){                        
                    Administrador a = new Administrador();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));            
                    finalResult = true;
                }
            }             
        } catch (Exception e) {
            e.getMessage();
        }
        return finalResult;
    }
}
