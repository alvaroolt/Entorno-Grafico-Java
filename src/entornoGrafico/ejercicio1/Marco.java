package entornoGrafico.ejercicio1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Marco extends JFrame {

  public Marco() {
    
    setTitle("Calculadora de Área y Perímetro");
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

//     setTitle("Calculadora de Área");
//     super("Calculadora de Área");
//
//     setVisible, setSize y setDefaultCloseOperation son estrictamente necesarios
//     para la ejecución del marco
//    setVisible(true);
//    setSize(500, 300);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//     cambia la posición en la que aparece el marco (eje de abscisas)
//    setLocation(400, 200);
//
//     no permite que el usuario modifique el tamaño del marco desde fuera
//    setResizable(false);

  }

}
