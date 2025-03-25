package fatec.poo.model;

/**
 *
 * @author eros
 */
public class FuncHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncHorista(int r, String n, String dtAdm, double vht) {
        super(r, n, dtAdm);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht) {
        qtdeHorTrab = qht;
    }
    
    public double calcGratificacao() {
        return calcSalBruto() * 0.075;
    }

    // Aplicaçãodo polimorfismo
    @Override
    public double calcSalBruto() {
        return (valHorTrab * qtdeHorTrab);
    }
    
    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido() - calcDescnto());
    }
    
}
