package br.com.Padaria.view;

import javax.swing.*;
import java.awt.*;

public class Menu {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Padaria");
        janela.setSize(600, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel personalizado com imagem de fundo
        JPanel painelComImagem = new JPanel() {
            Image imagemDeFundo = new ImageIcon("C:\\Users\\BEATRIZDEAZEVEDOCOUR\\Desktop\\projeto POO\\Projeto_POO\\br\\com\\Padaria\\resources\\imagem-fundo-padaria.jpg").getImage(); // troque pelo caminho da sua imagem

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
            }
        };

        painelComImagem.setLayout(null); // você pode mudar isso depois pra outro layout se quiser
        janela.setContentPane(painelComImagem);

        janela.setVisible(true);
    }
}
