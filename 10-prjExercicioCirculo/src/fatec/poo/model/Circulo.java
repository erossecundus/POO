
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
        return (Math.PI * Math.pow(raio, 2));
    }
    public double calcPerimetro(){
        return (Math.PI * 2 * raio);
    }
    public double calcDiametro(){
        return (2 * raio);
    }
}
