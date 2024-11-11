package pacInterface;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pacDAO.TurmasDAO;

public class TelaTurmas extends javax.swing.JFrame {

    public static int opcao;
    
    public TelaTurmas() {
        initComponents();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSelecionar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        cbbOpcoes = new javax.swing.JComboBox<>();
        btOpcoes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Turmas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSelecionar.setBackground(new java.awt.Color(255, 255, 255));
        btSelecionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSelecionar.setForeground(new java.awt.Color(0, 153, 51));
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/accept.png"))); // NOI18N
        btSelecionar.setText("Selecionar");
        btSelecionar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSelecionar.setIconTextGap(10);
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, 30));

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
        getContentPane().add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        cbbOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        getContentPane().add(cbbOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, 30));

        btOpcoes.setBackground(new java.awt.Color(255, 255, 255));
        btOpcoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOpcoes.setForeground(new java.awt.Color(0, 153, 51));
        btOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/eye.png"))); // NOI18N
        btOpcoes.setText("Ver opções");
        btOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOpcoes.setIconTextGap(10);
        btOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(btOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/logop.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        try {
            TurmasDAO dao = new TurmasDAO();
            dao.removeTudoTurmas();
            
            switch (cbbOpcoes.getSelectedIndex()) {
                case 0:
                    dao.AdicionaTurma1();
                    
                    break;
                case 1:
                    dao.AdicionaTurma2();
                    
                    break;
                default:
                    dao.AdicionaTurma3();
                    
                    break;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaTurmas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void btOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcoesActionPerformed
        new OpcoesTurmas().setVisible(true);
    }//GEN-LAST:event_btOpcoesActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTurmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btOpcoes;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JComboBox<String> cbbOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
