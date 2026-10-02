/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JPanel;
import meupaint.geometria.Forma;


/**
 *
 * @author guilh
 */
public class PainelDesenho extends JPanel{
    
    private ArrayList<Forma> formas = new ArrayList<>();
    private Forma formaTemp;
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D g2D = (Graphics2D) g.create();
        
        g2D.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        
        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, getWidth(), getHeight());
        
        // Para cada linha no array de linhas
        for (Forma forma : formas) {
            forma.desenhar(g2D);
        }

        if (formaTemp != null) {
            formaTemp.desenhar(g2D);
        }
        
        g2D.dispose();
    }

    public void addForma(Forma forma) {
        formas.add(forma);
    }

    public void setFormaTemp(Forma formaTemp) {
        this.formaTemp = formaTemp;
    }
}
