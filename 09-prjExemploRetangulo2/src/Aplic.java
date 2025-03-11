
import fatec.poo.model.Retangulo;
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
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\n DADOS DO RETANGULO:");
        System.out.println("Base: " + objRet.getBase());
        System.out.println("Altura: " + objRet.getAltura());
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
    }
    
}
