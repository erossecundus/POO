
import fatec.poo.model.FuncComissionado;
import fatec.poo.model.FuncHorista;
import fatec.poo.model.FuncMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author eros
 */
public class Aplic {

    public static void main(String[] args) {
        FuncHorista funcHorista = new FuncHorista(1212, "João Silva", "12/03/2020", 15.54);
        FuncMensalista funcMensalista = new FuncMensalista(1313, "Maria Silva", "13/03/2010", 1804.32);
        FuncComissionado funcComissionado = new FuncComissionado(1414, "Cleiton Silva", "14/03/202", 5);
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        funcHorista.setQtdeHorTrab(90);
        funcHorista.setCargo("Soldador");
        
        funcMensalista.setNumSalMin(2.5);
        funcMensalista.setCargo("Contador");
        
        funcComissionado.setSalBase(2000);
        funcComissionado.setCargo("Vendedor");
        funcComissionado.addVendas(12000);
                
        System.out.println("\t- HORISTA -");
        System.out.println("Funcionário:        " + funcHorista.getRegistro() +
                " - " + funcHorista.getNome() + " - " + funcHorista.getCargo());
        
        System.out.println("Data de admissão:   " + funcHorista.getDtAdmissao());
        System.out.println("Salario Bruto:      " + df.format(funcHorista.calcSalBruto()) );
        System.out.println("Desconto:           " + df.format(funcHorista.calcDescnto()));
        System.out.println("Gratificação:       " + df.format(funcHorista.calcGratificacao()));
        System.out.println("Salario liquido:    " + df.format(funcHorista.calcSalLiquido()));
        
        System.out.println("\n\t- MENSALISTA -");
        System.out.println("Funcionário:        " + funcMensalista.getRegistro() +
                " - " + funcMensalista.getNome() + " - " + funcMensalista.getCargo());
        System.out.println("Data de admissão:   " + funcMensalista.getDtAdmissao());
        System.out.println("Salario Bruto:      " + df.format(funcMensalista.calcSalBruto()));
        System.out.println("Desconto:           " + df.format(funcMensalista.calcDescnto()));
        System.out.println("Salario liquido:    " + df.format(funcMensalista.calcSalLiquido()));
        
        System.out.println("\n\t- FUNCIONARIO COMISSIONADO -");
        System.out.println("Funcionário:        " + funcComissionado.getRegistro() +
                " - " + funcMensalista.getNome() + " - " + funcMensalista.getCargo());
        System.out.println("Data de admissão:   " + funcComissionado.getDtAdmissao());
        System.out.println("Total Vendas:       " + df.format(funcComissionado.getTotalVendas()));
        System.out.println("Taxa de Comissão:   " + df.format(funcComissionado.getTaxaComissao())+ "%");
        System.out.println("Desconto:           " + df.format(funcComissionado.calcDescnto()));
        System.out.println("Salario Bruto:      " + df.format(funcComissionado.calcSalBruto()));
        System.out.println("Gratificação:       " + df.format(funcComissionado.calcGratificacao()));
        System.out.println("Salario liquido:    " + df.format(funcComissionado.calcSalLiquido()));
        // TODO: revisar aqui!!

    }
    
}
