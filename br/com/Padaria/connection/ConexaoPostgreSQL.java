package br.com.Padaria.connection;

import java.sql.*;

public class ConexaoPostgreSQL {
//Alterar os atributos para se conectar com o banco postgres
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";

    public static void main(String[] args) {
        try {
            // 1. Carrega o driver JDBC (se necessário)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Cria a conexão
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            if (conexao != null) {
                System.out.println("Conexão com o MySQL estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao estabelecer conexão com o MySQL.");
            }

            // 3. Realiza operações (exemplo de consulta)
            Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM sua_tabela");

            while (resultSet.next()) {
                // Processa os resultados
                System.out.println(resultSet.getString("id") + " - " + resultSet.getString("nome"));
            }

            // 4. Fecha a conexão (importante!)
            conexao.close();
            statement.close();
            resultSet.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}