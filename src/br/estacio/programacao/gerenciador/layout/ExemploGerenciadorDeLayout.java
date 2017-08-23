/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.gerenciador.layout;

import javax.swing.JFrame;

/**
 *
 * @author Marcelo
 */
public class ExemploGerenciadorDeLayout {

    public static void main(String[] args) {
        JFrame janela = new JFrame("JFrame Manual");
        //janela.setBounds(100, 100, 300, 300);
        
        janela.setSize(300, 300);
        janela.setLocation(100, 100);
        
        
        // Opção que não faz nada ao clicar no X - equivalente à 0
        // janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        // Somente torna o elemento invisivel - equivalente à 1
        // janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        // Desaloca o frame fechado da memoria
        //janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // fecha toda a aplicação
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
