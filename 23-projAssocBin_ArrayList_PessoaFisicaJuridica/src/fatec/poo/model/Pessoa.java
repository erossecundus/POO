package fatec.poo.model;

/**
 *
 * @author eros
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    // apontando para pedidos
    private PedidoCompra[] pedidoCompra;
    private int qtdCompras;
    
    public Pessoa (String n, int ai) {
        this.nome = n;
        this.anoInscricao = ai;
        pedidoCompra = new PedidoCompra[10];
    }
            
    public abstract double calcBonus(int b);
    
    public void addPedidoCompra(PedidoCompra pc) {
        pedidoCompra[qtdCompras++] = pc;
        totalCompras += pc.getValor();
    }
    
    public String getNome() {
        return nome;
    }
    public int getAnoInstricao() {
        return anoInscricao;
    }
    public double getTotalCompras() {
        return totalCompras;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }
    
}
