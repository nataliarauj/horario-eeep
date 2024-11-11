
package pacInterface;

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
import pacDAO.ProfessoresDAO;
import pacLogica.Professores;

/**
 *
 * @author KaioLucas
 */
public class TelaProfessores extends javax.swing.JFrame {

        DefaultTableModel tabelaProfessores = new DefaultTableModel(null,
            new String[] { "ID", "Nome", "Endereco","Celular","Telefone", "Email", "RG", "CPF" });
        List<Professores> professores;
        ListSelectionModel lsmProfessores;
    
    public TelaProfessores() {
        
        initComponents();
        desabilitaDados();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ctId = new javax.swing.JTextField();
        ctNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        ctRg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ctCelular = new javax.swing.JTextField();
        ctTelefoneFixo = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btRelatorio = new javax.swing.JButton();
        btExcluirRegistros = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        ctPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProfessores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Professores");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2), "Informações de Contato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        ctId.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Celular:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Telefone Fixo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Email:");

        ctRg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RG:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctRg, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ctId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 260));

        btNovo.setBackground(new java.awt.Color(255, 255, 255));
        btNovo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 110, 30));

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 30));

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 110, 30));

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 110, 30));

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btSair.setForeground(new java.awt.Color(0, 153, 51));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/door_out.png"))); // NOI18N
        btSair.setText("Menu");
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair.setIconTextGap(10);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 110, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/logop.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 80, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btRelatorio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(0, 153, 51));
        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/folder.png"))); // NOI18N
        btRelatorio.setText("Relatório");
        btRelatorio.setEnabled(false);
        btRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btRelatorio.setIconTextGap(5);
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        jPanel2.add(btRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 120, 26));

        btExcluirRegistros.setBackground(new java.awt.Color(255, 255, 255));
        btExcluirRegistros.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btExcluirRegistros.setForeground(new java.awt.Color(0, 153, 51));
        btExcluirRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/server_delete.png"))); // NOI18N
        btExcluirRegistros.setText("Excluir todos os registros");
        btExcluirRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluirRegistros.setIconTextGap(10);
        btExcluirRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRegistrosActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluirRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 240, -1));

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
        jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, -1));
        jPanel2.add(ctPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 880, 50));

        tbProfessores.setModel(tabelaProfessores);
        tbProfessores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        lsmProfessores = tbProfessores.getSelectionModel();
        lsmProfessores.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    linhaSelecionada(tbProfessores);
                }
            }
        });
        jScrollPane2.setViewportView(tbProfessores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 880, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitaDados();               
        limpar();
        ctNome.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(verificaDados()){      
            try {
                cadastroProfessor();
                listarProfessores();
                desabilitaDados();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro em atualizar a lista!");
            }
        }             
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
            try {
                alterarProfessor();
                listarProfessores();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro no botão alterar!");
            }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
            try {
                excluirProfessor();
                listarProfessores();
                        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no botão excluir!");
            }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
        new TelaMenu().setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        /*
        try {
            Connection conexao = getConexao();

            JasperPrint relatorio =  JasperFillManager.fillReport("C://Relatorio/Nematoda.jasper",
                new HashMap(),conexao);

            JasperViewer.viewReport(relatorio, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao emitir relatório!"+e);
        }
        */
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void btExcluirRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRegistrosActionPerformed
            try {
                excluirTudoProfessor();
                listarProfessores();
            } catch (SQLException ex) {
                Logger.getLogger(TelaProfessores.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btExcluirRegistrosActionPerformed
                 
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
            try {
                listarProfessores();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no botão pesquisar!");
            }
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void excluirProfessor() throws SQLException{
            int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente excluir este registro?"
            ,"Confirmação",JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_NO_OPTION){
                ProfessoresDAO dao = new ProfessoresDAO();
                dao.removeProfessor(professores.get(tbProfessores.getSelectedRow()));                            
            }     
    }
    
    public void excluirTudoProfessor() throws SQLException{
            int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente excluir este registro?"
            ,"Confirmação",JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_NO_OPTION){
                ProfessoresDAO dao = new ProfessoresDAO();
                dao.removeTudoProfessor();
            }
    }
    
    public void alterarProfessor() throws SQLException{
        if(tbProfessores.getSelectedRow()!= -1){            
            if(verificaDados()){   
                Professores professor = new Professores();
                ProfessoresDAO dao = new ProfessoresDAO();
                professor.setId(Long.valueOf(ctId.getText()));
                professor.setNome(ctNome.getText());
                professor.setEndereco(ctEndereco.getText());
                professor.setCelular(ctCelular.getText());
                professor.setTelefoneFixo(ctTelefoneFixo.getText());
                professor.setEmail(ctEmail.getText());
                professor.setRg(ctRg.getText());
                professor.setCpf(ctCpf.getText());
                dao.alterarProfessor(professor);
                JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso!");
                }
            }
        }
    
    public void listarProfessores() throws SQLException{
        ProfessoresDAO dao = new ProfessoresDAO();
        professores = dao.getListaProfessor(ctPesquisar.getText()+"%");  
        mostraPesquisa(professores);
    }
    
    public void mostraPesquisa(List<Professores> professores){
        while(tabelaProfessores.getRowCount()>0){
            tabelaProfessores.removeRow(0);
        }
        
        if(professores.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro no banco!");
        }else{
            String[] linha = new String[] {null,null,null,null,null,null,null,null};
            for (int i=0; i<professores.size(); i++) {
                tabelaProfessores.addRow(linha);
                tabelaProfessores.setValueAt(professores.get(i).getId(), i, 0);
                tabelaProfessores.setValueAt(professores.get(i).getNome(), i, 1);
                tabelaProfessores.setValueAt(professores.get(i).getEndereco(), i, 2);
                tabelaProfessores.setValueAt(professores.get(i).getCelular(), i, 3);
                tabelaProfessores.setValueAt(professores.get(i).getTelefoneFixo(), i, 4);
                tabelaProfessores.setValueAt(professores.get(i).getEmail(), i, 5);
                tabelaProfessores.setValueAt(professores.get(i).getRg(), i, 6);
                tabelaProfessores.setValueAt(professores.get(i).getCpf(), i, 7);
            }            
        }   
    }
    
    private void linhaSelecionada(JTable tabela){
        
        if(tbProfessores.getSelectedRow() != -1){
            habilitaDados();
            ctId.setText(String.valueOf(professores.get(tabela.getSelectedRow()).getId()));
            ctNome.setText(professores.get(tabela.getSelectedRow()).getNome());
            ctEndereco.setText(professores.get(tabela.getSelectedRow()).getEndereco());
            ctCelular.setText(professores.get(tabela.getSelectedRow()).getCelular());
            ctTelefoneFixo.setText(professores.get(tabela.getSelectedRow()).getTelefoneFixo());
            ctEmail.setText(professores.get(tabela.getSelectedRow()).getEmail());
            ctRg.setText(professores.get(tabela.getSelectedRow()).getRg());  
            ctCpf.setText(professores.get(tabela.getSelectedRow()).getCpf());  

        } else {
            limpar(); 
        }
    }
     
    public void cadastroProfessor(){
        try {
            Professores professor = new Professores();
            professor.setNome(ctNome.getText());
            professor.setEndereco(ctEndereco.getText());
            professor.setCelular(ctCelular.getText());
            professor.setTelefoneFixo(ctTelefoneFixo.getText());
            professor.setEmail(ctEmail.getText());
            professor.setRg(ctRg.getText());
            professor.setCpf(ctCpf.getText());
            
            ProfessoresDAO dao = new ProfessoresDAO();
            dao.Adiciona(professor);
            
            limpar();
            ctNome.requestFocus();
                      
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados!");
        }    
    }       
    
    public boolean verificaDados(){
        if(!ctNome.getText().equals("") && !ctEndereco.getText().equals("")
        && !ctRg.getText().equals("") && !ctCpf.getText().equals("")){
            return true;    
        } else{
            JOptionPane.showMessageDialog(null,"Campos obrigatórios : \n\n"
            + " • Nome \n" + " • Endereço \n" + " • RG \n" + " • CPF \n" );
            return false;
        }
    }
    
    public void desabilitaDados(){
        ctId.setEditable(false);
        ctNome.setEditable(false);
        ctEmail.setEditable(false);
        ctTelefoneFixo.setEditable(false);
        ctCelular.setEditable(false);
        ctEndereco.setEditable(false);
        ctRg.setEditable(false);
        ctCpf.setEditable(false);
    }
    
    public void habilitaDados(){        
        ctNome.setEditable(true);
        ctEmail.setEditable(true);
        ctTelefoneFixo.setEditable(true);
        ctCelular.setEditable(true);
        ctEndereco.setEditable(true);   
        ctRg.setEditable(true);
        ctCpf.setEditable(true);
    }
    
    public void limpar(){
        ctId.setText(null);
        ctNome.setEditable(true);
        ctNome.setText("");
        ctEndereco.setText("");
        ctCelular.setText("");
        ctTelefoneFixo.setText("");
        ctEmail.setText("");
        ctRg.setText("");
        ctCpf.setText("");      

    }
    

    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessores().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluirRegistros;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ctCelular;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctEndereco;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPesquisar;
    private javax.swing.JTextField ctRg;
    private javax.swing.JTextField ctTelefoneFixo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbProfessores;
    // End of variables declaration//GEN-END:variables
}
