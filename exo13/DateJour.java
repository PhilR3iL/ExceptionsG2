package exo13;

public class DateJour {
  private int jour, mois, annee;

  private static int[] JOUR_PAR_MOIS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public DateJour(int jour, int mois, int annee) throws DateException{
    if(!estValide(jour, mois, annee))
      throw new DateException(jour, mois, annee);
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
  }

  private static boolean estValide(int jour, int mois, int annee) {
    boolean result = true;
    if (mois < 1 || mois > 12) {
      result = false;
    } else {
      int maxJours = JOUR_PAR_MOIS[mois - 1];
      if (estBissextile(annee) && mois == 1)
        maxJours++;
      if (jour > maxJours || jour < 1)
        result = false;
    }
    return result;
  }

  private static boolean estBissextile(int annee) {
    return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
  }

}