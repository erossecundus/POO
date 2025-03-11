
import fatec.poo.model.Retangulo;


/**
 *
 * @author eros
 */
public class Aplic {

    public static void main(String[] args) {
        // Definição do ponteiro para o objeto
        Retangulo objRet, objRet1;
        
        // Instanciação (alocação) de um obj
        // a partir de uma classe
        // ("atribui o endereço ao ponteiro")
        objRet = new Retangulo();
        objRet1 = new Retangulo();
        
        // Passagem de mensagens
        objRet.setAltura(3.0);
        objRet.setBase(4.0);
        
        System.out.println("RETANGULO 1");
        System.out.println("Base: " + objRet.getBase());
        System.out.println("Altura: " + objRet.getAltura());
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
        
        objRet1.setAltura(7);
        objRet1.setBase(5);
        
        System.out.println("\nRETANGULO 2");
        System.out.println("Base: " + objRet1.getBase());
        System.out.println("Altura: " + objRet1.getAltura());
        System.out.println("Medida da Área: " + objRet1.calcArea());
        System.out.println("Medida do Perímetro: " + objRet1.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet1.calcDiagonal());
    }
    
}
