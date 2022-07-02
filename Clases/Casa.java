package Clases;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casa extends JPanel {

    public void AñadirGato() throws IOException {
        JFrame ventanaU = new JFrame("Habitacion de Manguito");
        ventanaU.add(new claseGato());
        ventanaU.setSize(1200, 700);
        ventanaU.setLocationRelativeTo(null);
        ventanaU.setVisible(true);
        ventanaU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}