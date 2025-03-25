package fatec.poo.model;

/**
 *
 * @author eros
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    public void setCargo(String c) {
        cargo = c;
    }
    
    public int getRegistro() {
        return registro;
    }
    public String getNome() {
        return nome;
    }
    public String getDtAdmissao() {
        return dtAdmissao;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    // Método Abstrato - Aprsenta apenas a assinatura
    // Deve ser implementado nas subclasses
    abstract public double calcSalBruto();
    
    public double calcDescnto() {
        return (0.1 * calcSalBruto());
    }
    
    public double calcSalLiquido() {
        return (calcSalBruto() - calcDescnto());
    }
    
}
