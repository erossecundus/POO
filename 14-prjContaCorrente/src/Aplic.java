
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author eros
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double saldoInicial;

        System.out.println("Entre o numero da conta:");
        num = entrada.nextInt();
        System.out.println("Entre o saldo inicial:");
        saldoInicial = entrada.nextDouble();
        
        ContaCorrente conta = new ContaCorrente(num, saldoInicial);
        
        int op;
        double saque;
        
        do{
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nNumero da Conta: " + conta.getNumero());
                    System.out.println("\nValor a ser depositado: ");
                    conta.depositar(entrada.nextDouble());
                    System.out.println("Saldo atualizado: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("\nNumero da Conta: " + conta.getNumero());
                    System.out.println("Saldo disponível: " + conta.getSaldo());
                    System.out.println("\nValor a ser sacado: ");
                    saque = entrada.nextDouble();
                    if (saque > conta.getSaldo()){
                        System.out.println("\tSaldo Insuficiente!");
                    }else{
                        conta.sacar(saque);
                        System.out.println("Saldo atualizado: " + conta.getSaldo());
                    }
                    break;
                case 3:
                    System.out.println("\nNumero da Conta: " + conta.getNumero());
                    System.out.println("Saldo: " + conta.getSaldo());
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
