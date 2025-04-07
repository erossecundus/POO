package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc++] = f;
    }
    
    public void listarFuncionarios() {
        System.out.println("-------------------------------------------------");
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t  Nome\t\t  Cargo");
        for(int i = 0; i < numFunc; i++) {
            System.out.println("  " +
                    funcionarios[i].getRegistro() + "\t\t" +
                    funcionarios[i].getNome() + "\t" +
                    funcionarios[i].getCargo());
        }
        System.out.println("-------------------------------------------------");
    }

    
    
}
