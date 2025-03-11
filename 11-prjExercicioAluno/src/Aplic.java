
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author eros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre o RA do aluno: ");
        aluno.setRA(entrada.nextInt());
        System.out.println("Entre a nota da primeira prova: ");
        aluno.setNtPrv1(entrada.nextDouble());
        System.out.println("Entre a nota da segunda prova: ");
        aluno.setNtPrv2(entrada.nextDouble());
        System.out.println("Entre a nota da primeiro trabalho: ");
        aluno.setNtTrab1(entrada.nextDouble());
        System.out.println("Entre a nota da segundo trabalho: ");
        aluno.setNtTrab2(entrada.nextDouble());
        
        int op = 0;
        
        do{
            System.out.println("\n1 - Exibir Nota das Provas/ Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/ Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.println("\n\n\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\n\nRA do Aluno: " + aluno.getRA());
                    System.out.println("Nota da primeira prova: " + aluno.getNtPrv1());
                    System.out.println("Nota da segunda prova: " + aluno.getNtPrv2());
                    System.out.println("Nota da primeiro trabalho: " + aluno.getNtTrab1());
                    System.out.println("Nota da segundo trabalho: " + aluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\n\nRA do Aluno: " + aluno.getRA());
                    System.out.println("Média dos trabalhos: " + aluno.calcMediaTrab());
                    System.out.println("Média das provas: " + aluno.calcMediaProva());
                    break;
                case 3:
                    System.out.println("\n\nRA do Aluno: " + aluno.getRA());
                    System.out.println("Média Final: " + aluno.calcMediaFinal());
                    if (aluno.isAprovado()){
                        System.out.println("Aprovado!");
                    }else{
                        System.out.println("Reprovado!");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
                    
            }
        }while(op != 4);
    }
    
}
