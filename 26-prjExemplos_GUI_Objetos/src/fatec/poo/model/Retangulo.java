package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Retangulo {
    private double altura;
    private double base;
    private String unidadeMedida;
    
    public Retangulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    public void setBase(double b){
        base = b;
    }
    
    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }
    
    public double calcArea(){
        return (altura * base);
    }
    public double calcPerimetro(){
        return (2*(altura + base));
    }
    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}