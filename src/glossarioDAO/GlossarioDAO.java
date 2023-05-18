/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package glossarioDAO;

import Conexao.DatabaseConnection;
import static Conexao.DatabaseConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 182120050
 */
public class GlossarioDAO {
    public void deletarTermo(String terminologias){
        try {
            Connection con= DatabaseConnection.getConnection();
            String sql = "delete from terminologias where nome = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, terminologias);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar termo.\n" + e.getMessage());
        }
    }//fim deletarCarro
    
}
