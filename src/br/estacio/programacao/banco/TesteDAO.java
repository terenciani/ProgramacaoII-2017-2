/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.banco;

import java.util.List;

/**
 *
 * @author Marcelo
 */
public class TesteDAO {
    public static void main(String[] args) {
        Usuario usu     = new Usuario();
        DaoUsuario dao  = new DaoUsuario();
        List<Usuario> lista;
        usu.setNome("Claudir");
        usu.setSobrenome("O interessado");
        
        dao.salvarUsuario(usu);
        
        lista = dao.listarUsuarios();
        
        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
        
        
    }
}

