import javax.swing.JFrame;
import javax.swing.JPanel;
public class Interfaz extends JPanel {
    public static void main(String [] args) {

        JFrame ventana = new JFrame("Gráficosxd");
        Interfaz objIterfaz = new Interfaz();

        ventana.add(objIterfaz);
        ventana.setSize(1200, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
