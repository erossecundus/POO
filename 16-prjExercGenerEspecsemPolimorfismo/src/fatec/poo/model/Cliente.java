package fatec.poo.model;

/**
 * @author eros
 */
public class Cliente extends Pessoa {
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String c, String n, String t) {
        super(n, t);
        this.cpf = c;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
}
