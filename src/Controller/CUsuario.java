/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author 182120044
 */
public class CUsuario {

    ArrayList<Usuario> usuarios = new ArrayList();

    public void addUsuario(Usuario c) {
        this.usuarios.add(c);
    }

    public void removeUsuario(Usuario c) {
        this.usuarios.remove(c);

    }

}
