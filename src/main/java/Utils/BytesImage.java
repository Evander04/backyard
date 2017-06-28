/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Steven
 */
public class BytesImage {

    //******************************GUAERDA LA IMAGEN EN BYTES
    public byte[] savedImage(BufferedImage buffImg){
        try{
            try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream()){
                 ImageIO.write(buffImg, "jpg", baos);
                 baos.flush();
                 return baos.toByteArray();
                }
            }catch (IOException ex){
                Logger.getLogger(BytesImage.class.getName()).log(Level.SEVERE,null,ex);
                return null;
            }
        
    }
    //**********************CONVIERTE BYTES A IMAGEN 
    public WritableImage getImage(byte[] imageData){
        ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
        try{
            BufferedImage buffImg = ImageIO.read(bais);
            return SwingFXUtils.toFXImage(buffImg, null);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
   //******************************LLAMAR EN LA CLASE Q LO VALLA A OCUPAR 
  //  BufferedImage img = SwingFXUtils.fromFXImage("CampoDeLaImagen".getImage(),null);
}
