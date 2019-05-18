package entornoGrafico.ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lamina extends JPanel implements ActionListener {

  private JTextField cuadroTexto1;
  private JTextField cuadroTexto2;

  public Lamina(JTextField cuadroTexto1, JTextField cuadroTexto2) {
    this.cuadroTexto1 = cuadroTexto1;
    this.cuadroTexto2 = cuadroTexto2;
  }

  JButton boton = new JButton("Calcular");
//  JButton botonArea = new JButton("Calcular Área");
//  JButton botonPerimetro = new JButton("Calcular Perímetro");

  public Lamina() {

    add(new JLabel("Alto : "));
    JTextField alto = new JTextField(10);
    add(alto);

    add(new JLabel("Ancho : "));
    JTextField ancho = new JTextField(10);
    add(ancho);

    add(boton);
//    add(botonArea);
//    add(botonPerimetro);

    boton.addActionListener(this);
//    botonArea.addActionListener(this);
//    botonPerimetro.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {

    double altura = Double.parseDouble(cuadroTexto1.getText());
    double anchura = Double.parseDouble(cuadroTexto2.getText());

//    double area = altura * anchura;
//    double perimetro = altura * 2 + anchura * 2;
//
//    JOptionPane.showMessageDialog(null, "Área: " + area + "\nPerímetro: " + perimetro);

    JOptionPane.showMessageDialog(null, "Área: " + AreaYPerimetro.calcularArea(altura, anchura) + "\nPerímetro: "
        + AreaYPerimetro.calcularPerimetro(altura, anchura));

//    Object botonPulsado = e.getSource();
//
//    if (botonPulsado == botonArea) {

//      double altura = Double.parseDouble(cuadroTexto1.getText());
//      double anchura = Double.parseDouble(cuadroTexto2.getText());

//      JOptionPane.showMessageDialog(null, "El Área del rectángulo es " + AreaYPerimetro.calcularArea(altura, anchura));

//    } else if (botonPulsado == botonPerimetro) {

//      double altura = Double.parseDouble(cuadroTexto1.getText());
//      double anchura = Double.parseDouble(cuadroTexto2.getText());

//      JOptionPane.showMessageDialog(null,
//          "El Perímetro del rectángulo es " + AreaYPerimetro.calcularPerimetro(altura, anchura));

  }
}
//}
