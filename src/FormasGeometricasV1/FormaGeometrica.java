/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormasGeometricasV1;

/**
 *
 * @author michel
 */
public class FormaGeometrica {
    protected Cor borda, preenchimento;

    public FormaGeometrica(Cor borda, Cor preenchimento) {
        this.borda = borda;
        this.preenchimento = preenchimento;
    }

    public FormaGeometrica(Cor borda) {
        this.borda = borda;
    }

    public FormaGeometrica() {
    }

    public Cor getCorBorda() {
        return borda;
    }

    public void setCorBorda(Cor borda) {
        this.borda = borda;
    }

    public Cor getCorPreenchimento() {
        return preenchimento;
    }

    public void setCorPreenchimento(Cor preenchimento) {
        this.preenchimento = preenchimento;
    }
    
    public double area() {
       return 0;
    };
    
    public double perimetro(){
        return 0;
    }
}
