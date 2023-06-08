/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validadores;

import Conexao.DatabaseConnection;
import Model.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author 182120044
 */
public class Login {

    public static Usuario autenticar(String nome, String senha) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnection.getConnection();
            String query = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, nome);
            statement.setString(2, senha);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsername(resultSet.getString("nome"));
                usuario.setPassword(resultSet.getString("senha"));
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static String geraSenha(String senha) {
        try {
            MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
            byte mdByteMD5[] = mdMD5.digest(senha.getBytes("UTF-8"));
            StringBuilder hexMDMD5 = new StringBuilder();
            for (byte b : mdByteMD5) {
                hexMDMD5.append(String.format("%02X", 0xFF & b));
            }
            String senhaMD5HashHex = hexMDMD5.toString();
            return senhaMD5HashHex;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
