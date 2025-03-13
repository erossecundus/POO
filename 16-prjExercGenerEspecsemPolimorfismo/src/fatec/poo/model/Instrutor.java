package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Instrutor extends Pessoa {
    private int id;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String t) {
        super(n, t);
        this.id = i;
    }
    
    public void setAreaAtuacao(String a) {
        this.areaAtuacao = a;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }
}
