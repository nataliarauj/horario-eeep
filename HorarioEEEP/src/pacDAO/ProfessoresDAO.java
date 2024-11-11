
package pacDAO;

import pacBancoDados.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pacLogica.Professores;

public class ProfessoresDAO {
    
    private Connection conexao;
    
    public ProfessoresDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
    
    
    public void Adiciona(Professores p1) throws SQLException{  

        String sql = "insert into professores (nome, endereco, "
                + "celular, telefoneFixo, email, rg, cpf)"
                + " values (?,?,?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);        

        stmt.setString(1, p1.getNome());
        stmt.setString(2, p1.getEndereco());
        stmt.setString(3, p1.getCelular());
        stmt.setString(4, p1.getTelefoneFixo());
        stmt.setString(5, p1.getEmail());
        stmt.setString(6, p1.getRg());
        stmt.setString(7, p1.getCpf());
        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
    } 
   
    
    public List<Professores> getListaProfessor(String nome) throws SQLException{
        String sql = "select * from professores where nome like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();   
        
        List<Professores> minhaLista = new ArrayList<Professores>();
        
        while(rs.next()){
            Professores p1 = new Professores();
            p1.setId(Long.valueOf(rs.getString("id")));
            p1.setNome(rs.getString("nome"));
            p1.setEndereco(rs.getString("endereco"));
            p1.setCelular(rs.getString("celular"));
            p1.setTelefoneFixo(rs.getString("telefoneFixo"));
            p1.setEmail(rs.getString("email"));
            p1.setRg(rs.getString("rg"));
            p1.setCpf(rs.getString("cpf"));
            minhaLista.add(p1);            
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    
    
    
    public void alterarProfessor(Professores p1) throws SQLException{
        String sql = "update professores set nome=?, endereco=?, "
                + "celular=?,telefoneFixo=?, email=?, rg=?, cpf=? "
                + "where id=?";    
        
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        
        stmt.setString(1, p1.getNome());
        stmt.setString(2, p1.getEndereco());
        stmt.setString(3, p1.getCelular());
        stmt.setString(4, p1.getTelefoneFixo());
        stmt.setString(5, p1.getEmail());
        stmt.setString(6, p1.getRg());
        stmt.setString(7, p1.getCpf());
        stmt.setLong(8, p1.getId());

        stmt.execute();
        stmt.close();
    }
    
    
    
    public void removeProfessor(Professores professor) throws SQLException{
        String sql = "delete from professores where id=?";        
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1,professor.getId());
        stmt.execute();
        stmt.close();
    }
    
   
    public void removeTudoProfessor() throws SQLException{
        String sql = "truncate table professores";        
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null,"Todos os registros foram deletados.");
    }
    

}
