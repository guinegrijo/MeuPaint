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
public class Elipse extends Forma{
   
    public Elipse(int xInicial, int yInicial, int xFinal, int yFinal, Color corContorno, Color corPreenchimento) {
        super(xInicial, yInicial, xFinal, yFinal, corContorno, corPreenchimento);
    }
    
    @Override
    public void desenhar(Graphics2D g2D) {
        g2D = (Graphics2D) g2D.create();
        
        int xInicialDesenho = xInicial < xFinal ?  xInicial : xFinal;
        int yInicialDesenho = yInicial < yFinal ? yInicial : yFinal;
        
        int xFinalDesenho = xInicial > xFinal ?  xInicial : xFinal;
        int yFinalDesenho = yInicial > yFinal ? yInicial : yFinal;
        
        g2D.setColor(corPreenchimento);
        // Os parâmetros são x, y, largura, altura
        g2D.fillOval(xInicialDesenho, yInicialDesenho, xFinalDesenho - xInicialDesenho, yFinalDesenho - yInicialDesenho);
        
        g2D.setColor(corContorno);
        // Os parâmetros são x, y, largura, altura
        g2D.drawOval(xInicialDesenho, yInicialDesenho, xFinalDesenho - xInicialDesenho, yFinalDesenho - yInicialDesenho);
        
        g2D.dispose();
    }
}
