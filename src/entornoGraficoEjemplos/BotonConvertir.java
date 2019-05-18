package entornoGraficoEjemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotonConvertir implements ActionListener {
  private JTextField cuadroTexto;
  
  public BotonConvertir(JTextField cuadroTexto) {
    this.cuadroTexto = cuadroTexto;
  }

  public void actionPerformed(ActionEvent e) {
    int radio = Integer.parseInt(cuadroTexto.getText());
    int area = (int)(Math.PI * Math.pow(radio, 2));
    JOptionPane.showMessageDialog(null, "El �rea del circulo es: " +
    area);
  }
 }