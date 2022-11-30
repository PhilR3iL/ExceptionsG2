package exo11;

public class EntierNaturel {
  private int i;

  public EntierNaturel(int i) throws MauvaiseConstanteException {
    if (i < 0)
      throw new MauvaiseConstanteException(i);
    this.i = i;
  }

  public int getI() {
    return i;
  }

  @Override
  public String toString() {
    return Integer.toString(i);
  }

}
