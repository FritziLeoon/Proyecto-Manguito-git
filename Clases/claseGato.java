package Clases;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class claseGato extends JPanel implements KeyListener{
    private JButton BotonIniciar;

//OBTENEMOS LA IMAGEN DEL GATO
    File file = new File("D:\\git-PROYECTO MANGUITO\\Imagenes\\gato2.png");
    BufferedImage bufferedImage = ImageIO.read(file);
    Image image = bufferedImage.getScaledInstance(200,200, Image.SCALE_DEFAULT);
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel ImagenGato = new JLabel(imageIcon);
//Eventos de las teclas para mover al michi y cargar la imágen con el método add()
    public claseGato() throws IOException{
        addKeyListener(this);
        setFocusable(true);
        add(ImagenGato);
        BotonIniciar = new JButton("Inciarrrrr");
        add(BotonIniciar);

    }

    EntradaUniversidad mostrarUniversidad = new EntradaUniversidad();

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
        if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            mostrarUniversidad.CargarImagenEntrada();
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
        if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            mostrarUniversidad.CargarImagenEntrada();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }


}