/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.gerenciador.layout;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marcelo
 */
public class ExemploPanelLayout extends JFrame{
    private JPanel painelSul;
    private JButton botaoPainelLeste;
    private JButton botaoPainelLeste2;
    public ExemploPanelLayout(){
        painelSul = new JPanel();
        botaoPainelLeste = new JButton("Botao Painel Leste");
        botaoPainelLeste2 = new JButton("Botao Painel Leste2");
        
        FlowLayout layout = new FlowLayout();
        painelSul.setLayout(layout);
        painelSul.add(botaoPainelLeste);
        painelSul.add(botaoPainelLeste2);
        
        this.add(painelSul, BorderLayout.EAST);
        this.setSize(200, 200);
        this.setVisible(true);
        
    }
    
    
    
}
