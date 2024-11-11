
package pacDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import pacBancoDados.Conexao;
import pacLogica.Disciplinas;

/**
 *
 * @author KaioLucas
 */
public class DisciplinasDAO {
    private Connection conexao;
    
    
    public DisciplinasDAO() throws SQLException{
        this.conexao = Conexao.getConexao();
    }
    
    public void AdicionaDisciplina(Disciplinas d1) throws SQLException{  

        String sql = "insert into disciplinas (nome)"
                + " values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);        

        stmt.setString(1, d1.getNome());
        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
    }
    
    public void alterarDisciplina(Disciplinas d1) throws SQLException{
        String sql = "update disciplinas set nome=? where id=?";    
        
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        
        stmt.setString(1, d1.getNome());
        stmt.setLong(2, d1.getId());

        stmt.execute();
        stmt.close();
    }
    
    public void removeDisciplina(Disciplinas disciplina) throws SQLException{
        String sql = "delete from disciplinas where id=?";        
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1,disciplina.getId());
        stmt.execute();
        stmt.close();
    }
    
   
    public void removeTudoDisciplina() throws SQLException{
        String sql = "truncate table disciplinas";        
        PreparedStatement stmt = conexao.prepareStatement(sql);        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null,"Todos os registros foram deletados.");
    }
    
    public List<Disciplinas> getListaDisciplina(String nome) throws SQLException{
        String sql = "select * from disciplinas where nome like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();   
        
        List<Disciplinas> minhaLista = new ArrayList<Disciplinas>();
        
        while(rs.next()){
            Disciplinas d1 = new Disciplinas();
            d1.setId(Long.valueOf(rs.getString("id")));
            d1.setNome(rs.getString("nome"));
            
            minhaLista.add(d1);            
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
}
    


