package entornoGrafico.ejercicio4;

public class Cajero {

  static int cont500e = 0;
  static int cont200e = 0;
  static int cont100e = 0;
  static int cont50e = 0;
  static int cont20e = 0;
  static int cont10e = 0;
  static int cont5e = 0;
  static int cont2e = 0;
  static int cont1e = 0;
  static int cont50cent = 0;
  static int cont20cent = 0;
  static int cont10cent = 0;
  static int cont5cent = 0;
  static int cont2cent = 0;
  static int cont1cent = 0;

  public static void desglosarDinero(double dinero) {
    while (dinero >= 500) {
      cont500e++;
      dinero -= 500;
    }
    while (dinero >= 200) {
      cont200e++;
      dinero -= 200;
    }
    while (dinero >= 100) {
      cont100e++;
      dinero -= 100;
    }
    while (dinero >= 50) {
      cont50e++;
      dinero -= 50;
    }
    while (dinero >= 20) {
      cont20e++;
      dinero -= 20;
    }
    while (dinero >= 10) {
      cont10e++;
      dinero -= 10;
    }
    while (dinero >= 5) {
      cont5e++;
      dinero -= 5;
    }
    while (dinero >= 2) {
      cont2e++;
      dinero -= 2;
    }
    while (dinero >= 1) {
      cont1e++;
      dinero -= 1;
    }
    while (dinero >= 0.50) {
      cont50cent++;
      dinero -= 0.50;
    }
    while (dinero >= 0.20) {
      cont20cent++;
      dinero -= 0.20;
    }
    while (dinero >= 0.10) {
      cont10cent++;
      dinero -= 0.10;
    }
    while (dinero >= 0.05) {
      cont5cent++;
      dinero -= 0.05;
    }
    while (dinero >= 0.02) {
      cont2cent++;
      dinero -= 0.02;
    }

    while (dinero > 0.01) {
      cont1cent++;
      dinero -= 2;
    }
  }

  /**
   * @return the cont500e
   */
  public static int getCont500e() {
    return cont500e;
  }

  /**
   * @return the cont200e
   */
  public static int getCont200e() {
    return cont200e;
  }

  /**
   * @return the cont100e
   */
  public static int getCont100e() {
    return cont100e;
  }

  /**
   * @return the cont50e
   */
  public static int getCont50e() {
    return cont50e;
  }

  /**
   * @return the cont20e
   */
  public static int getCont20e() {
    return cont20e;
  }

  /**
   * @return the cont10e
   */
  public static int getCont10e() {
    return cont10e;
  }

  /**
   * @return the cont5e
   */
  public static int getCont5e() {
    return cont5e;
  }

  /**
   * @return the cont2e
   */
  public static int getCont2e() {
    return cont2e;
  }

  /**
   * @return the cont1e
   */
  public static int getCont1e() {
    return cont1e;
  }

  /**
   * @return the cont50cent
   */
  public static int getCont50cent() {
    return cont50cent;
  }

  /**
   * @return the cont20cent
   */
  public static int getCont20cent() {
    return cont20cent;
  }

  /**
   * @return the cont10cent
   */
  public static int getCont10cent() {
    return cont10cent;
  }

  /**
   * @return the cont5cent
   */
  public static int getCont5cent() {
    return cont5cent;
  }

  /**
   * @return the cont2cent
   */
  public static int getCont2cent() {
    return cont2cent;
  }

  /**
   * @return the cont1cent
   */
  public static int getCont1cent() {
    return cont1cent;
  }

}
