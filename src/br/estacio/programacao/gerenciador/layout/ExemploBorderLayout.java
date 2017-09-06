/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.gerenciador.layout;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marcelo
 */
public class ExemploBorderLayout extends JFrame {

    private JButton botaoSul;
    private JButton botaoNorte;
    private JButton botaoLeste;
    private JButton botaoOeste;
    private JButton botaoCentro;

    private BorderLayout layout;

    public ExemploBorderLayout() {
        botaoSul = new JButton("Botão ao Sul");
        botaoNorte = new JButton("Botão ao Norte");
        botaoCentro = new JButton("Botão ao Centro");
        botaoLeste = new JButton("Botão ao Leste");
        botaoOeste = new JButton("Botão ao Oeste");
        layout = new BorderLayout();

        this.setLayout(layout);

        this.add(botaoSul, BorderLayout.SOUTH);
        this.add(botaoCentro, BorderLayout.CENTER);
        this.add(botaoLeste, BorderLayout.EAST);
        this.add(botaoOeste, BorderLayout.WEST);
        this.add(botaoNorte, BorderLayout.NORTH);

        this.setSize(500, 210);
        this.setVisible(true);

        //layout.add(botaoSul, BorderLayout.);
    }

}
