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

    private Cor borda, preenchimento;

    public FormaGeometrica(Cor borda, Cor preenchimento) {
        this.borda = borda;
        this.preenchimento = preenchimento;
    }

    public FormaGeometrica() {
        borda = new Cor();
        preenchimento = new Cor(255, 255, 255, 255);
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
    }

    public double perimetro() {
        return 0;
    }
    
    public boolean isIn(Ponto p) {
        return false;
    }
    
    public String toString() {
        String s = "Forma: Eu sou um Circulo\n";
        s += "Cor da Borda (a,r,g,b): (" + borda.getAlpha() + "," + borda.getRed() + "," + borda.getGreen() + "," + borda.getBlue() + ")\n";
        s += "Cor de Preenchimento: (" + preenchimento.getAlpha() + "," + preenchimento.getRed() + "," + preenchimento.getGreen() + "," + preenchimento.getBlue() + ")\n";
        return s;
    }
}
