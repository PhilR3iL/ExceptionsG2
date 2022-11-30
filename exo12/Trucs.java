package exo12;

public class Trucs {
  public double inverse(double x) {
    double y = 1 / x;
    return Double.isFinite(y) ? y : 0;
  }

  public double inverse(int x) {
    double y = 0;
    try {
      y = 1 / x;
    } catch (ArithmeticException e) {
      y = 0;
    }
    return y;
  }
}