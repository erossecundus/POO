
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Professor extends Pessoa {
    private String regfunc;
    private int titularidade;
    private int areaAtuacao;
    
    // ligando professor com turma
    private Turma[] turmas;
    private int qtdTurma;

    public Professor(String regfunc, String nome) {
        super(nome);
        this.regfunc = regfunc;
        turmas = new Turma[10];
    }

    public String getRegfunc() {
        return regfunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }
    
    public void setAreaAtuação(String areaAtuacao) {
        this.areaAtuacao = this.areaAtuacao;
    }
    
    public void addTurma(Turma turma) {
        this.turmas[qtdTurma] = turma;
    }
}
