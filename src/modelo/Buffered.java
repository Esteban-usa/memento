package modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Buffered {
    
    public static BufferedImage imageLoader(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ruta incorrecta de la imagen");
        }
        return null;
    }
}
