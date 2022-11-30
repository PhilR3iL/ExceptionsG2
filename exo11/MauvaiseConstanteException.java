package exo11;

public class MauvaiseConstanteException extends Exception {
  private int valeurProblematique;

  public MauvaiseConstanteException(int valeurProblematique) {
    this("Pas un entier naturel !", valeurProblematique);
  }

  public MauvaiseConstanteException(String message, int valeurProblematique) {
    super(message);
    this.valeurProblematique = valeurProblematique;
  }

  public int getValeur(){
    return valeurProblematique;
  }
}
