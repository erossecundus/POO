
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Curso {
    private String sigla;
    private String descricao;
    private String cargaHoraria;
    
    public Curso (String sigla, String descricao, String cargaHoraria) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }
    
    
}
