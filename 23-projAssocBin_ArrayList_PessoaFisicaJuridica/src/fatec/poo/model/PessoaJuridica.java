package fatec.poo.model;

/**
 *
 * @author eros
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String cgc, String n, int ai) {
        super(n, ai);
        this.cgc = cgc;
    }
    
    @Override
    public double calcBonus(int a) {
        return getTotalCompras() * taxaIncentivo/100 * (a - getAnoInstricao());
    }
    
    public void setTaxaIncentivo(double ti) {
        this.taxaIncentivo = ti;
    }
    public String getCgc() {
        return this.cgc;
    }
    public double getTaxaIncentivo() {
        return this.taxaIncentivo;
    }
    
}
