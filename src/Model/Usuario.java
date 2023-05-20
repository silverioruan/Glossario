/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 182120044
 */
public class Usuario {

    private String nome;
    private String senha;
    private int nivelAcesso;
    
    public String getUsername() {
        return nome;
    }
    
    public void setUsername(String username) {
        this.nome = username;
    }
    
    public String getPassword() {
        return senha;
    }
    
    public void setPassword(String password) {
        this.senha = password;
    }
    
    public int getNivelAcesso() {
        return nivelAcesso;
    }
    
    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + '}';
    }
    
    
}
