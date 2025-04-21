package br.com.Padaria.model;

public class Entrega {
    Cliente cliente;
    Funcionario funcionario;
    Pedido pedido;
    String status;

    
    public Entrega(Cliente cliente, Funcionario funcionario, Pedido pedido, String status) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.pedido = pedido;
        this.status = status;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
