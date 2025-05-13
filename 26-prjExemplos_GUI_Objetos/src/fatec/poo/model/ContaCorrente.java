package fatec.poo.model;

/**
 *
 * @author eros
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    private double valInicial;
    
    public ContaCorrente (int num, double valInicial){
        this.numero = num;
        this.valInicial = valInicial;
    }
    
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
