
package pacDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pacBancoDados.Conexao;
import pacLogica.Turmas;

public class TurmasDAO {
    private Connection conexao;
    
    public TurmasDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
    
    public void AdicionaTurma1() throws SQLException{  
        String sql = "insert into turmas (nome) values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);        
       
        stmt.setString(1, "1º A");
        stmt.execute();           
               
        stmt.setString(1, "1º B");                    
        stmt.execute();           
                
        stmt.setString(1, "1º C");                   
        stmt.execute();     
        
        stmt.setString(1, "1º D");
        stmt.execute();           
               
        stmt.setString(1, "2º A");                    
        stmt.execute();           
                
        stmt.setString(1, "2º B");                   
        stmt.execute();
        
        stmt.setString(1, "2º C");
        stmt.execute();           
               
        stmt.setString(1, "3º A");                    
        stmt.execute();           
                
        stmt.setString(1, "3º B");                   
        stmt.execute();
        
        stmt.setString(1, "3º C");                   
        stmt.execute();
                        
        stmt.close();
        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
    }
    
    public void AdicionaTurma2() throws SQLException{  
        String sql = "insert into turmas (nome) values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);        
       
        stmt.setString(1, "1º A");
        stmt.execute();           
               
        stmt.setString(1, "1º B");                    
        stmt.execute();           
                
        stmt.setString(1, "1º C");                   
        stmt.execute();                
               
        stmt.setString(1, "2º A");                    
        stmt.execute();           
                
        stmt.setString(1, "2º B");                   
        stmt.execute();
        
        stmt.setString(1, "2º C");
        stmt.execute();           
        
        stmt.setString(1, "2º D");
        stmt.execute();
               
        stmt.setString(1, "3º A");                    
        stmt.execute();           
                
        stmt.setString(1, "3º B");                   
        stmt.execute();
        
        stmt.setString(1, "3º C");                   
        stmt.execute();
                        
        stmt.close();
        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
    }
    
    public void AdicionaTurma3() throws SQLException{  
        String sql = "insert into turmas (nome) values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);        
       
        stmt.setString(1, "1º A");
        stmt.execute();           
               
        stmt.setString(1, "1º B");                    
        stmt.execute();           
                
        stmt.setString(1, "1º C");                   
        stmt.execute();                
               
        stmt.setString(1, "2º A");                    
        stmt.execute();           
                
        stmt.setString(1, "2º B");                   
        stmt.execute();
        
        stmt.setString(1, "2º C");
        stmt.execute();           
               
        stmt.setString(1, "3º A");                    
        stmt.execute();           
                
        stmt.setString(1, "3º B");                   
        stmt.execute();
        
        stmt.setString(1, "3º C");                   
        stmt.execute();
        
        stmt.setString(1, "3º D");
        stmt.execute();
                        
        stmt.close();
        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
    }
    
    
    
    public void removeTudoTurmas() throws SQLException{
        String sql = "truncate table turmas";        
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.execute();
        stmt.close();
    }
}  
    
