/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Conexao.DatabaseConnection;
import Validadores.Login;
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
public class JFEditarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFEditarUsuario
     */
    public JFEditarUsuario() {
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

        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jtnome = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        novasenha = new javax.swing.JLabel();
        EDITAR = new javax.swing.JButton();
        JLConfirmaSenha10 = new javax.swing.JLabel();
        jtnovasenha = new javax.swing.JPasswordField();
        jtnovonome2 = new javax.swing.JTextField();
        novonome = new javax.swing.JLabel();
        senha1 = new javax.swing.JLabel();
        jtnovocontato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel31.setBackground(new java.awt.Color(153, 0, 255));
        jLabel31.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 255, 51));
        jLabel31.setText("O Oráculo para Pregiçosos");
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jButton24.setText("Voltar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(51, 255, 51));
        nome.setText("Nome:");

        jButton25.setBackground(new java.awt.Color(51, 204, 255));
        jButton25.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jButton25.setText("LIMPAR.exe");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jtnome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtnomeFocusLost(evt);
            }
        });
        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 255, 51));
        jLabel32.setText("Editar Usuário:");

        novasenha.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        novasenha.setForeground(new java.awt.Color(51, 255, 51));
        novasenha.setText("Nova Senha:");

        EDITAR.setBackground(new java.awt.Color(255, 51, 51));
        EDITAR.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        EDITAR.setText("EDITAR.exe");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        JLConfirmaSenha10.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        JLConfirmaSenha10.setForeground(new java.awt.Color(51, 255, 51));

        jtnovonome2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtnovonome2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtnovonome2FocusLost(evt);
            }
        });

        novonome.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        novonome.setForeground(new java.awt.Color(51, 255, 51));
        novonome.setText("Novo Nome:");

        senha1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        senha1.setForeground(new java.awt.Color(51, 255, 51));
        senha1.setText("Novo Contato:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(55, 55, 55))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(JLConfirmaSenha10)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(nome)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(novonome)
                                    .addComponent(novasenha))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senha1))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtnovasenha, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(jtnome))
                            .addComponent(jtnovonome2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtnovocontato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel32)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLConfirmaSenha10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome)
                                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(novonome)
                            .addComponent(jtnovonome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(novasenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtnovasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtnovocontato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        JFMenuUsuario mp = new JFMenuUsuario();
        mp.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        nome.setText("");
        jtnovasenha.setText("");
        jtnovonome2.setText("");
        jtnovocontato.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jtnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtnomeFocusLost
        // TODO add your handling code here:
        String keyword = jtnome.getText();

        DatabaseSearch databaseSearch = new DatabaseSearch();
        List<String> results = databaseSearch.searchByKeyword2(keyword);

        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado.");
        } else {
            JOptionPane.showMessageDialog(this,"Resultados encontrados:");
            
            
        }
    }//GEN-LAST:event_jtnomeFocusLost

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        // Informações da tabela e das colunas
        String tableName = "usuarios";
        String nomeColumn = "nome";
        String senhaColumn = "descricao";
        String contatoColumn = "contato";
        String usuarioColumn = "usuario";

        // Novos valores para as colunas
        String novoNome = jtnome.getText();
        char[] senha = jtnovasenha.getPassword();
        String novaSenha = Login.geraSenha(new String(senha));
        String novoContato = jtnovocontato.getText();
        //String novoUsuario = jtnovousuario.getText();

        try {

            // Conectar ao banco de dados
            Connection con = DatabaseConnection.getConnection();
            int id = 0;
            String sql1 = "SELECT * from usuarios where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1, novoNome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getInt("idusuarios");
            }
            // Construir a consulta SQL para atualizar as colunas
            String sql = "UPDATE usuarios set senha = ?, nome = ?, contato = ? where idusuarios = ?";
            //String sql = "SELECT nome, descricao, sinonimo FROM terminologias WHERE id = ?";
            // Criar a declaração preparada (PreparedStatement)
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(2, novoNome);

            // Definir os valores para as colunas
            statement.setInt(4, id);
            statement.setString(1, novaSenha);
            statement.setString(3, novoContato);
            // Executar a atualização
            int rowsAffected = statement.executeUpdate();

            // Verificar se a atualização foi bem-sucedida
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "As colunas foram atualizadas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Nenhuma linha foi atualizada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_EDITARActionPerformed

    private void jtnovonome2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtnovonome2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnovonome2FocusLost

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

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
            java.util.logging.Logger.getLogger(JFEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDITAR;
    private javax.swing.JLabel JLConfirmaSenha10;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JTextField jtnome;
    private javax.swing.JPasswordField jtnovasenha;
    private javax.swing.JTextField jtnovocontato;
    private javax.swing.JTextField jtnovonome2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel novasenha;
    private javax.swing.JLabel novonome;
    private javax.swing.JLabel senha1;
    // End of variables declaration//GEN-END:variables
}
