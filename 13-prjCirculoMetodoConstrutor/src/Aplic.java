import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author eros
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio;
        
        System.out.println("Entre a unidade de medida: ");
        String uniMedida = entrada.next();
        
        System.out.println("Entre com o raio: ");
        raio = entrada.nextDouble();
        
        Circulo circulo = new Circulo(uniMedida);
        circulo.setRaio(raio);
        
        System.out.println("\n CIRCULO DE RAIO = " + raio + " " + circulo.getUnidadeMedida());
        System.out.println("Área = " + circulo.calcArea() + " " + circulo.getUnidadeMedida() + "²");
        System.out.println("Perímetro = " + circulo.calcPerimetro() + " " + circulo.getUnidadeMedida());
        System.out.println("Diâmetro = " + circulo.calcDiametro() + " " + circulo.getUnidadeMedida());
    }
    
}
