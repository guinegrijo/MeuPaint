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
public class Linha extends Forma {
    
    public Linha(int xInicial, int yInicial, int xFinal, int yFinal, Color corContorno) {
        super(xInicial, yInicial, xFinal, yFinal, corContorno, null);
    }
    
    @Override
    public void desenhar(Graphics2D g2D) {
        g2D = (Graphics2D) g2D.create();
        g2D.setColor(corContorno);
        g2D.drawLine(xInicial, yInicial, xFinal, yFinal);
        g2D.dispose();
    }
}
