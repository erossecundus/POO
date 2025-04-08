package fatec.poo.model;

/**
 *
 * @author eros
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    
    // apontando para Pessoa
    private Pessoa pessoa;
    

    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
