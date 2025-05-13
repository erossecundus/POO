
import fatec.poo.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eros
 */
public class Aplic {


    public static void main(String[] args) {
        
        Curso curso = new Curso("ADS", "Análise e Desenvolvimento de Sistemas", "600");
        Professor professor = new Professor("1010", "Carlos");
        Turma turma = new Turma("2025a", 40);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        
        Scanner entrada = new Scanner(System.in);
        
        turma.setCurso(curso);
        professor.addTurma(turma);

        String ra;
        String nome;
        for(int i=0; i<2; i++) {

            System.out.println("\nAluno " + (i+1));
            System.out.print("Entre o RA : ");
            ra = entrada.next();
            System.out.print("Entre o nome: ");
            nome = entrada.next();
            alunos.add(new Aluno(ra, nome));
            
            turma.addAluno(alunos.get(i));
        }
        
        turma.listarAunos();
    }
    
}
