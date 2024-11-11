package pacInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pacBancoDados.Conexao;
import pacDAO.AulasDAO;

public class TelaAulas extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int x;
    public static String nome;
    
    
    public TelaAulas() throws SQLException{
        initComponents();     
        con = Conexao.getConexao();
        this.cbbDisciplinas();
        this.cbbTurmasAulas();
    }
    
    public void cbbDisciplinas() throws SQLException{      
        String sql = "select * from disciplinas";     
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();              
                cbbDisciplinas.removeAllItems();
            while(rs.next()){
                cbbDisciplinas.addItem(rs.getString("nome"));        
            }
        }catch (SQLException ex){      
        }
    }
    
    public void cbbTurmasAulas() throws SQLException{     
        String sql = "select * from turmas";     
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();               
                cbbTurmas.removeAllItems();
                cbbAulas.removeAllItems();
            while(rs.next()){
                cbbTurmas.addItem(rs.getString("nome"));  
                cbbAulas.addItem(rs.getString("nome"));
            }
        }catch (SQLException ex){       
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        cbbTurmas = new javax.swing.JComboBox<>();
        cbbDisciplinas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbbAulas = new javax.swing.JComboBox<>();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAulas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Aulas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        btAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAdicionar.setForeground(new java.awt.Color(0, 153, 0));
        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/add.png"))); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 30));

        cbbTurmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbbTurmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 30));

        cbbDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDisciplinasActionPerformed(evt);
            }
        });
        jPanel2.add(cbbDisciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 219, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Turma");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Disciplina");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 70, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 529, 65));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbbAulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbAulas.setEnabled(false);
        jPanel3.add(cbbAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        btPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(0, 153, 0));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/magnifier.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setEnabled(false);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 30));

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 153, 51));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setIconTextGap(10);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 30));

        btMenu.setBackground(new java.awt.Color(255, 255, 255));
        btMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btMenu.setForeground(new java.awt.Color(0, 153, 51));
        btMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/door_out.png"))); // NOI18N
        btMenu.setText("Menu");
        btMenu.setIconTextGap(10);
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 529, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/logop.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        jScrollPane2.setViewportView(tbAulas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 410, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        x = cbbDisciplinas.getSelectedIndex();
        nome = cbbDisciplinas.getItemAt(x);      
        try{
            AulasDAO dao = new AulasDAO();           
            switch(cbbTurmas.getSelectedIndex()){
                case 0:
                    dao.adicionarAula1();
                    break;
                case 1:
                    dao.adicionarAula2();
                    break;
                case 2:
                    dao.adicionarAula3();
                    break;
                case 3:
                    dao.adicionarAula4();
                    break;    
                case 4:
                    dao.adicionarAula5();
                    break;
                case 5:
                    dao.adicionarAula6();
                    break;
                case 6:
                    dao.adicionarAula7();
                    break;
                case 7:
                    dao.adicionarAula8();
                    break;
                case 8:
                    dao.adicionarAula9();
                    break;
                case 9:
                    dao.adicionarAula10();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Erro no index");            
            }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro");
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       
    }//GEN-LAST:event_btExcluirActionPerformed

    private void cbbDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDisciplinasActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    
   
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new TelaAulas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaAulas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btPesquisar;
    public javax.swing.JComboBox<String> cbbAulas;
    public javax.swing.JComboBox<String> cbbDisciplinas;
    public javax.swing.JComboBox<String> cbbTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbAulas;
    // End of variables declaration//GEN-END:variables
}
