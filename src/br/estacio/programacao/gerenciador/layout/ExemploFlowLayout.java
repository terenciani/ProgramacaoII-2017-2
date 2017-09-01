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
public class ExemploFlowLayout extends JFrame {

    private JButton botaoUm, botaoDois, botaoTres;

    public ExemploFlowLayout(){
        Container caixaPrincipal = this.getContentPane();
        FlowLayout flowLayout = new FlowLayout();
        
        //flowLayout.setAlignment(FlowLayout.CENTER);
        //flowLayout.setAlignment(FlowLayout.LEFT);
        flowLayout.setAlignment(FlowLayout.RIGHT);
        
        this.setLayout(flowLayout);
        botaoUm = new JButton("Estacio");
        botaoDois = new JButton("Programação II");
        botaoTres = new JButton("2017-2");
        
       
        
        caixaPrincipal.add(botaoUm);
        caixaPrincipal.add(botaoDois);
        caixaPrincipal.add(botaoTres);
        
        this.setSize(500, 210);
        this.setVisible(true);
    }
}
