
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    // Getters and Setters
    public void setRA(int RA){
        this.RA = RA;
    }
    public int getRA(){
        return this.RA;
    }
    
    public void setNtPrv1(double NtPrv1){
        this.NtPrv1 = NtPrv1;
    }
    public double getNtPrv1(){
        return this.NtPrv1;
    }
    public void setNtPrv2(double NtPrv2){
        this.NtPrv2 = NtPrv2;
    }
    public double getNtPrv2(){
        return this.NtPrv2;
    }
    
    public void setNtTrab1(double NtTrab1){
        this.NtTrab1 = NtTrab1;
    }
    public double getNtTrab1(){
        return this.NtTrab1;
    }
    public void setNtTrab2(double NtTrab2){
        this.NtTrab2 = NtTrab2;
    }
    public double getNtTrab2(){
        return this.NtTrab2;
    }
    
    // Metodos
    public double calcMediaProva(){
        return (0.75 * ((this.NtPrv1 + 2 * this.NtPrv2) / 3));
    }
    
    public double calcMediaTrab(){
        return (0.25 * ((this.NtTrab1 + this.NtTrab2) / 2));
    }
    
    public double calcMediaFinal(){
        return (this.calcMediaProva() + this.calcMediaTrab());
    }
    
    public boolean isAprovado(){
        if (this.calcMediaFinal() >= 6)
            return true;
        else{
            return false;
        }
    }
}
