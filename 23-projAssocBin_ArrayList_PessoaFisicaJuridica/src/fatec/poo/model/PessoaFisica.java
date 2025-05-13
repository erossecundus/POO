package fatec.poo.model;

/**
 *
 * @author eros
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;
    
    public PessoaFisica(String cpf, String n, int ai) {
        super(n, ai);
        this.cpf = cpf;
    }

    @Override
    public double calcBonus(int a) {
        if(getTotalCompras() > 12000) {
            return (a - getAnoInstricao()) * this.base;
        } else {
            return 0;
        }
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setBase(double b) {
        base = b;
    }
    public double getBase() {
        return base;
    }
}
