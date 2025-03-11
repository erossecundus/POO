
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
        
        System.out.println("Entre com o raio: ");
        raio = entrada.nextDouble();
        
        Circulo circulo = new Circulo();
        circulo.setRaio(raio);
        
        System.out.println("\n CIRCULO DE RAIO = " + raio);
        System.out.println("Área = " + circulo.calcArea());
        System.out.println("Perímetro = " + circulo.calcPerimetro());
        System.out.println("Diâmetro = " + circulo.calcDiametro());
    }
    
}
