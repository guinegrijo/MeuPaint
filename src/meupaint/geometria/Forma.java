/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint.geometria;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author guilh
 */
public abstract class Forma {
    
    protected int xInicial;
    protected int yInicial;
    protected int xFinal;
    protected int yFinal;
    protected Color corContorno;
    protected Color corPreenchimento;
    
    public Forma(int xInicial, int yInicial, int xFinal, int yFinal, Color corContorno, Color corPreenchimento) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.corContorno = corContorno;
        this.corPreenchimento = corPreenchimento;
    }
    
    public abstract void desenhar(Graphics2D g2D);
    
    public void setXInicial(int xInicial) {
        this.xInicial = xInicial;
    }
    
    public void setYInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public void setXFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public void setYFinal(int yFinal) {
        this.yFinal = yFinal;
    }

    public void setCorContorno(Color corContorno) {
        this.corContorno = corContorno;
    }

    public void setCorPreenchimento(Color corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }
    
    
}
