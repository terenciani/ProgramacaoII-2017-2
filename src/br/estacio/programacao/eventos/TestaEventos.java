/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.eventos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Marcelo
 */
public class TestaEventos extends JFrame implements ActionListener {
    private JButton botaoUm, botaoDois;
    private JLabel textoUm, textoDois;
    private JPanel painel;
    private int contUm, contDois;

    public TestaEventos(String title){
        super(title);
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        contUm = 0;
        contDois = 0;
        botaoUm = new JButton("Clique aqui 1");
        botaoDois = new JButton("Clique aqui 2");
        textoUm = new JLabel("Quantidade de cliques em 1: ");
        textoDois = new JLabel("Quantidade de cliques em 2: ");
        painel = new JPanel();
        painel.setLayout(new FlowLayout());
        
        botaoUm.addActionListener(this);
        botaoDois.addActionListener(this);
        
        painel.add(botaoUm);
        painel.add(botaoDois);
        painel.add(textoUm);
        painel.add(textoDois);
        
        
        this.setLayout(new GridLayout(2, 2));
        this.setSize(400, 400);
        this.setVisible(true);
        this.add(painel);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== botaoUm){
            contUm++;
            textoUm.setText("Quantidade de cliques em 1: "+contUm);
        }else{
            contDois++;
            textoDois.setText("Quantidade de cliques em 2: "+contDois);
        }
    }
    
    public static void main (String[] args){
        TestaEventos teste = new TestaEventos("Teste");
    }
}
