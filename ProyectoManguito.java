import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import Clases.Casa;
import Clases.EntradaUniversidad;
import Clases.claseGato;

public class ProyectoManguito extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon imagen = new ImageIcon(getClass().getResource("Imagenes\\PantallaPrincipal.png"));
        g.drawImage(imagen.getImage(), 0, 0, 1164, 690, this);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("Imagenes\\gato2.png"));
        g.drawImage(imagen2.getImage(), 100, 100, 300,300, this);
    }

    public static void main(String[] args) throws IOException {
        JFrame ventana = new JFrame("El mundo de Manguito");
        ProyectoManguito objeto = new ProyectoManguito();


        //AGREGAMOS ALGATO Y EL FONDO
        ventana.getContentPane().add(objeto);
        //ventana.getContentPane().add(new claseGato());
        ventana.setSize(1164, 690);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        Casa objCasa = new Casa();
        objCasa.AñadirGato();
    }


}