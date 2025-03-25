package fatec.poo.model;

/**
 *
 * @author eros
 */
public class FuncMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
    public FuncMensalista(int r, String n, String dtAdm, double vsm) {
        super(r, n, dtAdm);
        valSalMin = vsm;
    }

    public void setNumSalMin(double nsm) {
        numSalMin = nsm;
    }
    
    @Override
    public double calcSalBruto() {
        return this.numSalMin * this.valSalMin;
    }
    
}
