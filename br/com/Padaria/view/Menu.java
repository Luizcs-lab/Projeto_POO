package br.com.Padaria.view;

import javax.swing.*;
import java.awt.*;

public class Menu {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Padaria");
        janela.setSize(600, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField campo = new JTextField();
        campo.setSize(100,100);
       
        janela.add(campo);
        // Painel personalizado com imagem de fundo
        JPanel painelComImagem = new JPanel() {
            Image imagemDeFundo = new ImageIcon("C:\\Users\\CESARLUIZDASILVA\\Desktop\\Projeto-POO\\Projeto_POO\\resources\\imagem-fundo-padaria.jpg").getImage(); // troque pelo caminho da sua imagem

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
            }
        }; 
        // Label para o título
       JLabel label = new JLabel("Padaria Pão Quente");
       label.setBounds(200, 50, 300, 30); // posição (x, y, largura, altura)
       label.setFont(new Font("Arial", Font.BOLD, 20));
       painelComImagem.add(label);
       
       // Campo de texto para o nome de usuário
       JTextField campoUsuario = new JTextField();
       campoUsuario.setBounds(200, 150, 200, 30); // ajustar posição e tamanho
       painelComImagem.add(campoUsuario);

       // Campo de senha
       JPasswordField campoSenha = new JPasswordField();
       campoSenha.setBounds(200, 200, 200, 30); // ajustar posição e tamanho
       painelComImagem.add(campoSenha);

       // Botão de login
       JButton botaoLogin = new JButton("Login");
       botaoLogin.setBounds(250, 250, 100, 30);
       painelComImagem.add(botaoLogin);

        painelComImagem.setLayout(null); // você pode mudar isso depois pra outro layout se quiser
        janela.setContentPane(painelComImagem);

        JTextField caixausuario = new JTextField();
        caixausuario.setSize(30, 30);
        caixausuario.setVisible(true);

        janela.setVisible(true);
        /*TER NO MENU UM LOGIN DO FUNCIONÁRIO COM NOME E SENHA PARA INSERIR EM CAMPOS, 
        EM NOSSO PROGRAMA PODERIA TER UMA TABELA PARA FUNCIONÁRIOS, PEDIDOS, CLIENTES E PRODUTOS FORNECEDORES */
    }
}