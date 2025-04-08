
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author eros
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica pf = new PessoaFisica("234.345.456-67", "Ana Maria", 2014);
        PessoaJuridica pj = new PessoaJuridica("23.234.345", "Salgados Dois Irmãos", 2018);

        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        // entrada de dados de PF e PJ
        System.out.print("Entre o valor Base para " + pf.getNome() + " (PF): R$ ");
        pf.setBase(entrada.nextDouble());
        System.out.print("\nEntre a Taxa de Incentivo para " + pj.getNome() + " (PJ): ");
        pj.setTaxaIncentivo(entrada.nextDouble());
        
        System.out.println("-----\nCompras:");
        
        int op;
        int i = 1;
        do {
            System.out.print("Entre o número do " + i + "o pedido: ");
            cadPedidos[i] = new PedidoCompra(entrada.nextInt());
            System.out.print("  - Valor da compra:\tR$ ");
            cadPedidos[i].setValor(entrada.nextDouble());
            System.out.print("  - Data do pedido: ");
            cadPedidos[i].setDataPedido(entrada.next());
            System.out.print("  - Pessoa Física (1) ou Jurídica (2)? ");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    cadPedidos[i].setPessoa(pf);
                    pf.addPedidoCompra(cadPedidos[i]);
                    break;
                case 2:
                    cadPedidos[i].setPessoa(pj);
                    pj.addPedidoCompra(cadPedidos[i]);
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
            System.out.println("");
            i++;
        } while (i <= 2);
                
        int anoAtual;
        System.out.print("\nEntre o ano atual: ");
        anoAtual = entrada.nextInt();
        
        System.out.println("\n\t- RESUMO (PF) -");
        System.out.println("CPF:                    " + pf.getCpf());
        System.out.println("Cliente:                " + pf.getNome());
        System.out.println("Numero de Pedidos:      " + pf.getQtdCompras());
        System.out.println("Valor Total Compras: R$ " + df.format(pf.getTotalCompras()));
        System.out.println("Bônus ("+anoAtual+"):           " + df.format(pf.calcBonus(anoAtual)));
        
        System.out.println("\n\t- RESUMO (PJ) -");
        System.out.println("CGC:                    " + pj.getCgc());
        System.out.println("Cliente:                " + pj.getNome());
        System.out.println("Numero de Pedidos:      " + pj.getQtdCompras());
        System.out.println("Valor Total Compras: R$ " + df.format(pj.getTotalCompras()));
        System.out.println("Bônus ("+anoAtual+"):           " + df.format(pj.calcBonus(anoAtual)));
    }
    
}
