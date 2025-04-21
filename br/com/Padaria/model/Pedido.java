package br.com.Padaria.model;

import java.util.Date;

public class Pedido {
    int numeroPedido;
    Funcionario funcionario;
    double valorTotal;
    Date dataPedido;
    
    public Pedido(int numeroPedido, Funcionario funcionario, double valorTotal, Date dataPedido) {
        this.numeroPedido = numeroPedido;
        this.funcionario = funcionario;
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
}
