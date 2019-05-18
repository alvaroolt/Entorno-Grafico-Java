package entornoGrafico.plantillas;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {

  public MarcoCentrado() {

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Toolkit pantalla = Toolkit.getDefaultToolkit();

    // Obtiene el tamaño de la pantalla que ejecuta el programa
    Dimension tamanoPantalla = pantalla.getScreenSize();

    int altoPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;

    // defino el tamaño y posición del marco según el alto y el ancho de la pantalla
    setSize(anchoPantalla / 2, altoPantalla / 2);
    setLocation(anchoPantalla / 4, altoPantalla / 4);

    setResizable(false);
  }

}
