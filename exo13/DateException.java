package exo13;

public class DateException extends Exception {

  public DateException(int jour, int mois, int annee) {
    super("La date du " + jour + "/" + mois + "/" + annee + " n'est pas correcte !");
  }

}