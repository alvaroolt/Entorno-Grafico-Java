package entornoGraficoEjemplos;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame {
  public Ventana1() {
    super("Calculo de Radio");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("Radio :"));
    JTextField radio = new JTextField(20);
    cp.add(radio);
    JButton botonConvertir = new JButton("Convertir");
    cp.add(botonConvertir);
    botonConvertir.addActionListener(new BotonConvertir(radio));
    }

}
