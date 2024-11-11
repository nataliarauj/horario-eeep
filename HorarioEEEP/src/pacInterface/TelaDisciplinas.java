
package pacInterface;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import pacDAO.DisciplinasDAO;
import pacLogica.Disciplinas;


public class TelaDisciplinas extends javax.swing.JFrame {
;
        DefaultTableModel tabelaDisciplinas = new DefaultTableModel(null,
            new String[] { "ID", "Nome"});
        List<Disciplinas> disciplinas;
        ListSelectionModel lsmDisciplinas;
    
     
    public TelaDisciplinas() {
        initComponents();
        desabilitaDados();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btExcluirRegistros = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        ctPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDisciplinas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Disciplinas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true), "Dados da Disciplina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Nome:");

        ctId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addComponent(ctNome))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 300, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btExcluirRegistros.setBackground(new java.awt.Color(255, 255, 255));
        btExcluirRegistros.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btExcluirRegistros.setForeground(new java.awt.Color(0, 153, 51));
        btExcluirRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/server_delete.png"))); // NOI18N
        btExcluirRegistros.setText("Excluir tudo");
        btExcluirRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluirRegistros.setIconTextGap(10);
        btExcluirRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRegistrosActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluirRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, -1));

        btPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(0, 153, 51));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/magnifier.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPesquisar.setIconTextGap(10);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));
        jPanel2.add(ctPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 470, 50));

        tbDisciplinas.setModel(tabelaDisciplinas);
        tbDisciplinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        lsmDisciplinas = tbDisciplinas.getSelectionModel();
        lsmDisciplinas.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    linhaSelecionada(tbDisciplinas);
                }
            }
        });
        jScrollPane2.setViewportView(tbDisciplinas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 470, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/logop.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 90, -1));

        btNovo.setBackground(new java.awt.Color(255, 255, 255));
        btNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btNovo.setForeground(new java.awt.Color(0, 153, 51));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setIconTextGap(10);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, 30));

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 153, 51));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/accept.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setIconTextGap(10);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 30));

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 153, 51));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setIconTextGap(10);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 110, 30));

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(0, 153, 51));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/pencil.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAlterar.setIconTextGap(10);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 110, 30));

        btMenu.setBackground(new java.awt.Color(255, 255, 255));
        btMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btMenu.setForeground(new java.awt.Color(0, 153, 51));
        btMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/door_out.png"))); // NOI18N
        btMenu.setText("Menu");
        btMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMenu.setIconTextGap(10);
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRegistrosActionPerformed
        try {
                excluirTudoDisciplina();
                listarDisciplinas();
            } catch (SQLException ex) {
                Logger.getLogger(TelaDisciplinas.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btExcluirRegistrosActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
                listarDisciplinas();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no botão pesquisar!");
            }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
      limpar();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(verificaDados()){      
            try {
                cadastroDisciplina();
                listarDisciplinas();
                desabilitaDados();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro em atualizar a lista!");
            }
        }       
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
                excluirDisciplina();
                listarDisciplinas();
                        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no botão excluir!");
            }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
                alterarDisciplina();
                listarDisciplinas();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro no botão alterar!");
            }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    public void cadastroDisciplina(){
        try {
            Disciplinas d1 = new Disciplinas();
            d1.setNome(ctNome.getText());
           
            
            DisciplinasDAO dao = new DisciplinasDAO();
            dao.AdicionaDisciplina(d1);
            
            ctNome.setText("");
            ctNome.requestFocus();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados!");
        }    
    }
    
    public void alterarDisciplina() throws SQLException{
        if(tbDisciplinas.getSelectedRow()!= -1){            
            if(verificaDados()){   
                Disciplinas disciplinas = new Disciplinas();
                DisciplinasDAO dao = new DisciplinasDAO();
                disciplinas.setId(Long.valueOf(ctId.getText()));
                disciplinas.setNome(ctNome.getText());
                
                dao.alterarDisciplina(disciplinas);
                JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso!");
                }
            }
        }
    
    public boolean verificaDados(){
        if(!ctNome.getText().equals("")){
            return true;    
        } else{
            JOptionPane.showMessageDialog(null,"Campos obrigatórios : \n\n"
            + " • Nome");
            return false;
        }
    }
    
    public void excluirDisciplina() throws SQLException{
            int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente excluir este registro?"
            ,"Confirmação",JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_NO_OPTION){
                DisciplinasDAO dao = new DisciplinasDAO();
                dao.removeDisciplina(disciplinas.get(tbDisciplinas.getSelectedRow()));                            
            }     
    }
    
    public void excluirTudoDisciplina() throws SQLException{
            int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente excluir todos os registros?"
            ,"Confirmação",JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_NO_OPTION){
                DisciplinasDAO dao = new DisciplinasDAO();
                dao.removeTudoDisciplina();
            }
    }
    
    public void listarDisciplinas() throws SQLException{
        DisciplinasDAO dao = new DisciplinasDAO();
        disciplinas = dao.getListaDisciplina(ctPesquisar.getText()+"%");  
        mostraPesquisa(disciplinas);
    }
    
    public void mostraPesquisa(List<Disciplinas> disciplinas){
        while(tabelaDisciplinas.getRowCount()>0){
            tabelaDisciplinas.removeRow(0);
        }
        
        if(disciplinas.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro no banco!");
        }else{
            String[] linha = new String[] {null,null};
            for (int i=0; i<disciplinas.size(); i++) {
                tabelaDisciplinas.addRow(linha);
                tabelaDisciplinas.setValueAt(disciplinas.get(i).getId(), i, 0);
                tabelaDisciplinas.setValueAt(disciplinas.get(i).getNome(), i, 1);
            }            
        }          
    }
    
    private void linhaSelecionada(JTable tabela){
        
        if(tbDisciplinas.getSelectedRow() != -1){
            habilitaDados();
            ctId.setText(String.valueOf(disciplinas.get(tabela.getSelectedRow()).getId()));
            ctNome.setText(disciplinas.get(tabela.getSelectedRow()).getNome());
            

        } else {
            limpar(); 
        }
    }
    
    public void limpar(){
        ctNome.setEditable(true);
        ctId.setText(null);
        ctNome.setText("");
    }
        
    public void desabilitaDados(){
        ctId.setEditable(false);
        ctNome.setEditable(false);
    }
    
    public void habilitaDados(){        
        ctNome.setEditable(true);
        
    }
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
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDisciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluirRegistros;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDisciplinas;
    // End of variables declaration//GEN-END:variables
}
