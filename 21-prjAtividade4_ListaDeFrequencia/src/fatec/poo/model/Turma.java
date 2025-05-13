
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Turma {
    private String sigla;
    private int qtdevagas;
    
    // ligando turma com curso, alunos e professor
    private Curso curso;
    private Aluno[] alunos;
    private int contAlunos;
    private Professor professor;

    
    public Turma(String sigla, int qtdevagas) {
        this.sigla = sigla;
        this.qtdevagas = qtdevagas;
        alunos = new Aluno[10];
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public int getQtdevagas() {
        return qtdevagas;
    }
    
    public void listarAunos() {
        System.out.println("\n\t\t - Lista de Frequência - \n");
        System.out.print("Sigla do Curso: " + curso.getSigla());
        System.out.println("\tNome do Curso: " + curso.getDescricao());
        System.out.println("Sigla Turma: " + sigla);
        System.out.println("Nome do Professor: " + professor.getNome());
        
        System.out.println("\n    - Nome do Aluno -\n");
        for(int i=0;i<contAlunos;i++){
            System.out.println(i+1 + " - " + alunos[i].getNome());
            
        }
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos[contAlunos++] = aluno;    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Professor getProfessor() {
        return professor;
    }
}
