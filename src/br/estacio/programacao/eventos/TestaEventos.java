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
    private JButton but;
    private JLabel texto;
    private JPanel painel;
    private int cont;

    public TestaEventos(String title){
        super(title);
        this.setTitle(title);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        cont = 0;
        but = new JButton("Clique aqui");
        texto = new JLabel("Quantidade: ");
        painel = new JPanel();
        painel.setLayout(new FlowLayout());
        
        but.addActionListener(this);
        
        painel.add(but);
        painel.add(texto);
        
        
        
        this.setLayout(new GridLayout(2, 2));
        this.setSize(200, 200);
        this.setVisible(true);
        this.add(painel);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        cont++;
        texto.setText("Quantidade: "+cont);
    }
    
    public static void main (String[] args){
        TestaEventos teste = new TestaEventos("Teste");
    }
}
