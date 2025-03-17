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
public class Professor extends Pessoa {
    private int regFuncional;
    private double salario;
    
    public Professor(int rf, String n, String dn) {
        super(n, dn);
        regFuncional = rf;
    }
    
    public double getSalario() {
        return salario;
    }
    public int getRegFuncional() {
        return regFuncional;
    }
    public void setSalario(double s) {
        this.salario = s;
    }
}
