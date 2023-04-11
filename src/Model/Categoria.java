/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 182120044
 */
public class Categoria {

    public String termo;
    public String descricao;
    public int categoria;

    public Categoria() {
    }

    public Categoria(String termo, String descricao, int categoria) {
        this.termo = termo;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categorias{" + "termo=" + termo + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }

}
