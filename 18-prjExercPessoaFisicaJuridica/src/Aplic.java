
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
        // Na solução do professor foi criada variáveis de apoio para receber os dados
        // via scanner e construir Obj. 
        
        
        System.out.print("Entre o valor Base para " + pf.getNome() + " (PF): R$ ");
        pf.setBase(entrada.nextDouble());
        System.out.println("Compras de " + pf.getNome() + ":");
        
        double valor;
        int i = 1;
        do {
            System.out.print("  - Valor da " + i + "a compra:\tR$ ");
            valor = entrada.nextDouble();
            pf.addCompras(valor);
            i++;
        } while (valor != 0);
        // no do professor uso apenas while
        
        System.out.print("\nEntre a Taxa de Incentivo para " + pj.getNome() + " (PJ): ");
        pj.setTaxaIncentivo(entrada.nextDouble());
        System.out.println("Compras de " + pj.getNome() + ":");

        i = 1;
        do {
            System.out.print("  - Valor da " + i + "a compra:\tR$ ");
            valor = entrada.nextDouble();
            pj.addCompras(valor);
            i++;
        } while (valor != 0);
        
        int anoAtual;
        System.out.print("\nEntre o ano atual: ");
        anoAtual = entrada.nextInt();
        
        System.out.println("\n\t- RESUMO (PF) -");
        System.out.println("Cliente:              " + pf.getNome());
        System.out.println("CPF:                  " + pf.getCpf());
        System.out.println("Ano de Inscrição:     " + pf.getAnoInstricao());
        System.out.println("Valor Base:        R$ " + df.format(pf.getBase()));
        System.out.println("Total Compras:     R$ " + df.format(pf.getTotalCompras()));
        System.out.println("Bônus ("+anoAtual+"):         " + df.format(pf.calcBonus(anoAtual)));
        
        System.out.println("\n\t- RESUMO (PJ) -");
        System.out.println("Cliente:              " + pj.getNome());
        System.out.println("CGC:                  " + pj.getCgc());
        System.out.println("Ano de Inscrição:     " + pj.getAnoInstricao());
        System.out.println("Taxa de Incentivo:    " + df.format(pj.getTaxaIncentivo()) + "%");
        System.out.println("Total Compras:     R$ " + df.format(pj.getTotalCompras()));
        System.out.println("Bônus ("+anoAtual+"):         " + df.format(pj.calcBonus(anoAtual)));
    }
    
}
