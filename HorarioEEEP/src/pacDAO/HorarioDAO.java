
package pacDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pacBancoDados.Conexao;
import pacLogica.Horario;


public class HorarioDAO {
    private Connection conexao;
    
    public HorarioDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
    
    public List<Horario> listaTurmas() throws SQLException{
        String sql = "select * from turmas";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario1() throws SQLException{
        String sql = "select * from aulas1";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    } 
    
    public List<Horario> listaHorario2() throws SQLException{
        String sql = "select * from aulas2";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario3() throws SQLException{
        String sql = "select * from aulas3";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario4() throws SQLException{
        String sql = "select * from aulas4";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario5() throws SQLException{
        String sql = "select * from aulas5";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario6() throws SQLException{
        String sql = "select * from aulas6";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario7() throws SQLException{
        String sql = "select * from aulas7";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario8() throws SQLException{
        String sql = "select * from aulas8";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario9() throws SQLException{
        String sql = "select * from aulas9";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Horario> listaHorario10() throws SQLException{
        String sql = "select * from aulas10";     
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();         
        List<Horario> minhaLista = new ArrayList<Horario>();       
        while(rs.next()){
            Horario h1 = new Horario();
            h1.setNome(rs.getString("nome"));           
            minhaLista.add(h1);            
        }      
        rs.close();
        stmt.close();
        return minhaLista;
    }
}
