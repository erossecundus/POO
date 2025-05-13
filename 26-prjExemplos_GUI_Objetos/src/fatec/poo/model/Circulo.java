package fatec.poo.model;
/**
 *
 * @author eros
 */
public class Circulo {
    private double raio;
    private String unidadeMedida;
    
    public Circulo(String uniMed){
        this.unidadeMedida = uniMed;
    }    
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return raio;
    }
    public String getUnidadeMedida(){
        return unidadeMedida;
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
