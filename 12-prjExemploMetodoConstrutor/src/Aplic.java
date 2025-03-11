import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double medAlt, medBase;
        String unidade; 
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        //criação do ponteiro,
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
        Retangulo objRet = new Retangulo(unidade);
        
        
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de mensagens
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
       
        System.out.println("\nMedida da altura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da área: " + objRet.calcArea() + " " + objRet.getUnidadeMedida() + "²");
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal() + " " + objRet.getUnidadeMedida());
    }    
}