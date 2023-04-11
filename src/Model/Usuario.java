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

    private int iduser;
    private String nome;
    private String contato;
    private String senha;

    public Usuario() {

    }

    public Usuario(int iduser, String nome, String contato, String senha) {
        this.iduser = iduser;
        this.nome = nome;
        this.contato = contato;
        this.senha = senha;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "usuarios{" + "iduser=" + iduser + ", nome=" + nome + ", contato=" + contato + ", senha=" + senha + '}';
    }

}
