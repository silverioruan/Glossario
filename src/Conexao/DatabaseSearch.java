/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RF Informática
 */
public class DatabaseSearch {
    public List<String> searchByKeyword(String keyword) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<String> results = new ArrayList<>();
        
        try {
            connection = DatabaseConnection.getConnection();
            String query = "SELECT * FROM tabela WHERE coluna LIKE ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, "%" + keyword + "%");
            
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                String result = resultSet.getString("coluna");
                results.add(result);
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
        
        return results;
    }
    
}
