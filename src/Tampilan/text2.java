/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tampilan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author FUCK_HIM
 */
public class text2 extends JTextField{

    private Color col;

    public text2() {
        setOpaque(false);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),50);

        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setKlik(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                setKlik(false);
            }

        });
    }

    private Paint paint1;
    private Paint paint2;
    private boolean klik;

    public boolean isKlik() {
        return klik;
    }

    public void setKlik(boolean klik) {
        this.klik = klik;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr=(Graphics2D) g.create();
        gr.setColor(col);

        if(isKlik()){
            col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),100);
            gr.setColor(col);
        }else{
            col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),60);
            gr.setColor(col);
        }

        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        gr.dispose();
    }






}
