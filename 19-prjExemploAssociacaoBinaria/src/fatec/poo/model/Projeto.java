package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;
    
    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc++] = f;
    }
    
    public void listarFuncionarios() {
        System.out.println("-------------------------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Início: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t  Nome\t\t  Cargo\t\t  Departamento");
        for(int i = 0; i < numFunc; i++) {
            System.out.println("  " +
                    funcionarios[i].getRegistro() + "\t\t" +
                    funcionarios[i].getNome() + "\t" +
                    funcionarios[i].getCargo() + "\t" +
                    funcionarios[i].getDepartamento().getNome());
        }
        System.out.println("-------------------------------------------------");
    }
}
