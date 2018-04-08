/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormasGeometricasV2;

/**
 *
 * @author michel
 */
public abstract class FormaGeometrica {

    protected Cor borda, preenchimento;

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

    public abstract double area();

    public abstract double perimetro();
}
