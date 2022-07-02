package Clases;

import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class EntradaUniversidad extends JPanel{

    File fileU = new File("D:\\git-PROYECTO MANGUITO\\Imagenes\\unsch_entrada.jpg");
    BufferedImage bufferedImageU = ImageIO.read(fileU);
    Image imageU = bufferedImageU.getScaledInstance(1200,700, Image.SCALE_DEFAULT);
    ImageIcon imageIcon = new ImageIcon(imageU);
    JLabel ImagenEntrada = new JLabel(imageIcon);

    public EntradaUniversidad() throws IOException {
        add(ImagenEntrada);
    }
    public void CargarImagenEntrada(){
        JFrame ventanaU = new JFrame("Entrada de la UNSCH");
        ventanaU.add(ImagenEntrada);
        ventanaU.setSize(1200, 700);
        ventanaU.setLocationRelativeTo(null);
        ventanaU.setVisible(true);
        ventanaU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
