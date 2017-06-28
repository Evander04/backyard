/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;


import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
 
/**
 *
 * @author Steven
 */
public class BackGround implements Border {
    public BufferedImage img;
    
    public BackGround(){
        try {
            URL imagePath = new URL(getClass().getResource("../icon32x32/hotel.png").toString());
            img = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(img, (x + (width - img.getWidth())/2),(y + (height - img.getHeight())/2), null);
    }

    @Override
    public Insets getBorderInsets(Component cmpnt) {
       return new Insets(100,100,100,100);
    }

    @Override
    public boolean isBorderOpaque() {
       return isBorderOpaque();
    }
    
}
