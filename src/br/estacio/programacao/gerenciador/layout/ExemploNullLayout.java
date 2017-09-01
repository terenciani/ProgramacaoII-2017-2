/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.gerenciador.layout;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marcelo
 */
public class ExemploNullLayout extends JFrame {

    private JButton botaoUm, botaoDois, botaoTres;

    public ExemploNullLayout(){
        Container caixaPrincipal = this.getContentPane();
        this.setLayout(null);
        botaoUm = new JButton("Estacio");
        botaoDois = new JButton("Programação II");
        botaoTres = new JButton("2017-2");
        
        botaoUm.setBounds(10, 10, 150, 140);
        botaoDois.setBounds(165, 10, 150, 140);
        botaoTres.setBounds(320, 10, 150, 140);
        
        caixaPrincipal.add(botaoUm);
        caixaPrincipal.add(botaoDois);
        caixaPrincipal.add(botaoTres);
        
        this.setSize(500, 210);
        this.setVisible(true);
    }
}
