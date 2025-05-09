package br.com.Padaria.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class CrudCliente {
    public void inserirCliente(String nome, Date dtNascimento,String telefone,String endereco){
        String comando = "insert into cliente(nome, dtNascimento, telefone, endereco) values (?,?,?,?)";

        

       
        
}}
