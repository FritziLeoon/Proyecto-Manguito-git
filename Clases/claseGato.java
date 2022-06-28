package Clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class claseGato extends JPanel implements KeyListener{
//OBTENEMOS LA IMAGEN
    File file = new File("D:\\git-PROYECTO MANGUITO\\Imagenes\\imagen.jpg");
    BufferedImage bufferedImage = ImageIO.read(file);
    ImageIcon imageIcon = new ImageIcon(bufferedImage);
    JLabel ImagenGato = new JLabel(imageIcon);
    

//Eventos de las teclas para mover al michi y cargar la imágen con el método add()
    public claseGato() throws IOException{
        addKeyListener(this);
        setFocusable(true);
        add(ImagenGato);

    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'w' ||e.getKeyChar() == 'w' || e.getExtendedKeyCode() == KeyEvent.VK_UP) {
        ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY()-10);
        }
        if (e.getKeyChar() == 's' ||e.getKeyChar() == 's' || e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY()+10);
        }
        if (e.getKeyChar() == 'd' ||e.getKeyChar() == 'd' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            ImagenGato.setLocation(ImagenGato.getX()+10, ImagenGato.getY());
        }
        if (e.getKeyChar() == 'a' ||e.getKeyChar() == 'a' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
            ImagenGato.setLocation(ImagenGato.getX()-10, ImagenGato.getY());
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY()-10);
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY()+10);
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            ImagenGato.setLocation(ImagenGato.getX()+10, ImagenGato.getY());
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
            ImagenGato.setLocation(ImagenGato.getX()-10, ImagenGato.getY());
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }


}