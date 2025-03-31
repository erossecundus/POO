package fatec.poo.model;

/**
 *
 * @author eros
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa (String n, int ai) {
        this.nome = n;
        this.anoInscricao = ai;
    }
            
    public abstract double calcBonus(int b);
    
    public void addCompras(double c) {
        totalCompras += c ;
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
}
