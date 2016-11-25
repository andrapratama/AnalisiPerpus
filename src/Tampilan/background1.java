/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tampilan;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author FUCK_HIM
 */
public class background1 extends JPanel{
    Image gam;
    public background1(){
        setOpaque(false);
        gam=new ImageIcon(getClass().getResource("background1.jpg")).getImage();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gg=(Graphics2D)g.create();
        gg.drawImage(gam, 0,0,getWidth(),getHeight(), null);
        gg.dispose();
    }


}
