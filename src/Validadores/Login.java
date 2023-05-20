/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validadores;

import Conexao.DatabaseConnection;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
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
                usuario.setNivelAcesso(resultSet.getInt("idPerfisAcesso"));
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
}
