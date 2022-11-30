import exo11.EntierNaturel;
import exo11.MauvaiseConstanteException;

class Main {
  public static void main(String[] args) {
    try {
      System.out.println(new EntierNaturel(2));
      System.out.println(new EntierNaturel(-2));
    } catch (MauvaiseConstanteException e) {
      System.err.println(e);
      System.err.println("La valeur problématique est " + e.getValeur());
    }
  }
}