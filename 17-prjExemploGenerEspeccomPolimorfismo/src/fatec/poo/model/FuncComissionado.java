/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author eros
 */
public class FuncComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncComissionado(int r, String n, String dtAdm, double txc) {
        super(r, n, dtAdm);
        taxaComissao = txc;
    }
    
    public void setSalBase(double sb) {
        salBase = sb;
    }
    public double getSalBase() {
        return salBase;
    }
    
    public double getTotalVendas() {
        return totalVendas;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public void addVendas(double v) {
        totalVendas += v;
    }
    

    @Override
    public double calcSalBruto() {
        return salBase + taxaComissao/100 * totalVendas;
    }
    
    public double calcGratificacao() {
        if(totalVendas <= 5000) {
            return 0;
        } else {
            if (totalVendas <= 10000) {
                return calcSalBruto() * 0.03;
            } else {
                return calcSalBruto() * 0.05;
            }
            
        }
    }
    
    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
    
}
