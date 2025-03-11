package fatec.poo.model;

/**
 *
 * @author eros
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente (int num, double saldo){
        this.numero = num;
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
