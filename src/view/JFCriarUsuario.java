/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Conexao.DatabaseConnection;
import Validadores.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author loren
 */
public class JFCriarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFCriarUsuario
     */
    public JFCriarUsuario() {
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
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        JtSinonimo1 = new javax.swing.JTextField();
        nome1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        descricao1 = new javax.swing.JTextField();
        Criar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();
        JLLogin = new javax.swing.JLabel();
        JBLimpar = new javax.swing.JButton();
        JTusuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JLSenha = new javax.swing.JLabel();
        JBCriar = new javax.swing.JButton();
        JPSenha = new javax.swing.JPasswordField();
        JLNome = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        JLContato = new javax.swing.JLabel();
        JTContato = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(153, 0, 255));
        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 51));
        jLabel6.setText("O Oráculo para Pregiçosos");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("Nome:");

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jButton6.setText("LIMPAR.exe");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        JtSinonimo1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        nome1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome1FocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 51));
        jLabel8.setText("Criar Termo:");

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 51));
        jLabel9.setText("Descrição");

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 51));
        jLabel10.setText("Sinonimo:");

        descricao1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        Criar1.setBackground(new java.awt.Color(102, 255, 102));
        Criar1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        Criar1.setText("CRIAR.exe");
        Criar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Criar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JtSinonimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addComponent(jButton6))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(324, 324, 324)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Criar1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtSinonimo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(descricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Criar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(153, 0, 255));
        jLabel11.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 51));
        jLabel11.setText("O Oráculo para Pregiçosos");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBVoltar.setBackground(new java.awt.Color(102, 255, 102));
        JBVoltar.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JLLogin.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        JLLogin.setForeground(new java.awt.Color(51, 255, 51));
        JLLogin.setText("Usuário:");

        JBLimpar.setBackground(new java.awt.Color(51, 204, 255));
        JBLimpar.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        JBLimpar.setText("LIMPAR.exe");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JTusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JTusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTusuarioFocusLost(evt);
            }
        });
        JTusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTusuarioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 51));
        jLabel13.setText("Criar Usuário:");

        JLSenha.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        JLSenha.setForeground(new java.awt.Color(51, 255, 51));
        JLSenha.setText("Senha:");

        JBCriar.setBackground(new java.awt.Color(102, 255, 102));
        JBCriar.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        JBCriar.setText("CRIAR.exe");
        JBCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCriarActionPerformed(evt);
            }
        });

        JLNome.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        JLNome.setForeground(new java.awt.Color(51, 255, 51));
        JLNome.setText("Nome:");

        JTNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JTNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTNomeFocusLost(evt);
            }
        });

        JLContato.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        JLContato.setForeground(new java.awt.Color(51, 255, 51));
        JLContato.setText("Contato:");

        JTContato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JTContato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTContatoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLSenha)
                        .addGap(18, 18, 18)
                        .addComponent(JPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLNome)
                            .addComponent(JLContato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTContato, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLLogin)
                        .addGap(18, 18, 18)
                        .addComponent(JTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBLimpar)))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel13)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLLogin))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLContato))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nome1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome1FocusLost
        // TODO add your handling code here:
        String novoNome = JTNome.getText();

        try {

            Connection con = DatabaseConnection.getConnection();
            int id = 0;
            String sql1 = "SELECT * from terminologias where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1, novoNome);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                JTNome.setText(rs.getString("nome"));
                JPSenha.setText(rs.getString("sinonimo"));
                JTContato.setText(rs.getString("descricao"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_nome1FocusLost

    private void Criar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Criar1ActionPerformed
       
    }//GEN-LAST:event_Criar1ActionPerformed

    private void JBCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCriarActionPerformed
 String tableName = "usuarios";
        String nomeColumn = "nome";
        String senhaColumn = "descricao";
        String contatoColumn = "contato";
        String usuarioColumn = "usuario";

        // Novos valores para as colunas
        String novoNome = JTNome.getText();
        char[] senha = JPSenha.getPassword();
        String novaSenha = Login.geraSenha(new String(senha));
        String novoContato = JTContato.getText();
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
            String sql = "INSERT INTO usuarios set senha = ?, nome = ?, contato = ? where idusuarios = ?";
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
    }//GEN-LAST:event_JBCriarActionPerformed

    private void JTusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTusuarioFocusLost
        // TODO add your handling code here:
        String novoNome = JTusuario.getText();

        try {

            Connection con = DatabaseConnection.getConnection();
            int id = 0;
            String sql1 = "SELECT * from usuarios where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1, novoNome);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                JTNome.setText(rs.getString("nome"));
                JPSenha.setText(rs.getString("sinonimo"));
                JTContato.setText(rs.getString("descricao"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JTusuarioFocusLost

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        JTusuario.setText("");
        JTContato.setText("");
        JPSenha.setText("");
        JTNome.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        JFMenuUsuario mp = new JFMenuUsuario();
        mp.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JTNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTNomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeFocusLost

    private void JTContatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTContatoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTContatoFocusLost

    private void JTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFCriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCriarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Criar1;
    private javax.swing.JButton JBCriar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLContato;
    private javax.swing.JLabel JLLogin;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLSenha;
    private javax.swing.JPasswordField JPSenha;
    private javax.swing.JTextField JTContato;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTusuario;
    private javax.swing.JTextField JtSinonimo1;
    private javax.swing.JTextField descricao1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome1;
    // End of variables declaration//GEN-END:variables
}
