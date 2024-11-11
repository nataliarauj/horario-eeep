package pacDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pacBancoDados.Conexao;
import pacInterface.TelaAulas;
import pacLogica.Aulas;


public class AulasDAO {
    
    private Connection conexao;
    TelaAulas comps = new TelaAulas();
    
    public AulasDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
    
    public void adicionarAula1(){
        try{
        String sql = "insert into aulas1(nome) values (?)";                                       
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);     
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula2(){
        try{        
        String sql = "insert into aulas2(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula3(){
        try{        
        String sql = "insert into aulas3(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula4(){
        try{        
        String sql = "insert into aulas4(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula5(){
        try{        
        String sql = "insert into aulas5(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula6(){
        try{        
        String sql = "insert into aulas6(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula7(){
        try{        
        String sql = "insert into aulas7(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula8(){
        try{        
        String sql = "insert into aulas8(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula9(){
        try{        
        String sql = "insert into aulas9(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    public void adicionarAula10(){
        try{        
        String sql = "insert into aulas10(nome) values (?)";   
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.setString(1, (String) comps.nome);       
        stmt.execute();
        stmt.close();      
        JOptionPane.showMessageDialog(null, "Salvo!");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Falha!");
        }
    }
    
    
    
}
