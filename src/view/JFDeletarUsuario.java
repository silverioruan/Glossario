/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Conexao.DatabaseConnection;
import glossarioDAO.DatabaseSearch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author loren
 */
public class JFDeletarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFDeletarUsuario
     */
    public JFDeletarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jbvoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextPane();
        jbPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("O Oráculo para Pregiçosos");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Deletar Usuário");

        jtnome.setFont(new java.awt.Font("OCR A Extended", 3, 18)); // NOI18N
        jtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtnomeKeyTyped(evt);
            }
        });

        jbvoltar.setBackground(new java.awt.Color(102, 255, 102));
        jbvoltar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jbvoltar.setText("Voltar");
        jbvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbvoltarMouseClicked(evt);
            }
        });
        jbvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarActionPerformed(evt);
            }
        });

        descricao.setEditable(false);
        descricao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(descricao);

        jbPesquisar.setBackground(new java.awt.Color(102, 255, 102));
        jbPesquisar.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        jbPesquisar.setText("PESQUISAR.exe");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        jbPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbPesquisarKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jButton1.setText("DELETAR.exe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtnomeKeyTyped
        // TODO add your handling code here:

        //        if(evt.getKeyCode()==10){
            //            jbPesquisar.doClick();
            //        }
    }//GEN-LAST:event_jtnomeKeyTyped

    private void jbvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbvoltarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbvoltarMouseClicked

    private void jbvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarActionPerformed
        // TODO add your handling code here:
        JFmenuPrincipal mp = new JFmenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbvoltarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
        String keyword = jtnome.getText();

        DatabaseSearch databaseSearch = new DatabaseSearch();
        List<String> results = databaseSearch.searchByKeyword2(keyword);

        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado.");
        } else {
            //JOptionPane.showMessageDialog(this,"Resultados encontrados:");
            descricao.setText("");
            for (String result : results) {
                descricao.setText(descricao.getText() + "\n---\n" + result);
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbPesquisarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String novoUsuario = jtnome.getText();

        try {

            // Conectar ao banco de dados
            Connection con = DatabaseConnection.getConnection();
            int id = 0;
            String sql1 = "SELECT * from usuarios where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1, novoUsuario);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getInt("idusuarios");
            }

            Object[] btnMSG = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(this, "Deseja realmente deletar?",".: Deletar :.",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG[0]);
        if (resp == 0) {
                String sql = "DELETE FROM usuarios WHERE nome = ? ";

                // Criar a declaração preparada (PreparedStatement)
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, novoUsuario);

                // Executar a atualização
                int rowsAffected = statement.executeUpdate();
                JOptionPane.showMessageDialog(this, "As colunas foram atualizadas com sucesso!");
               




            } else {
                JOptionPane.showMessageDialog(this, "Ok, delete cancelado pelo usuário!");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDeletarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbvoltar;
    private javax.swing.JTextField jtnome;
    // End of variables declaration//GEN-END:variables
}
