package fr.pgah.tp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Caisse {
  private int numéro;
  private double total;

  public Caisse(int numéro, double montantInitial) {
    this.numéro = numéro;
    this.total = montantInitial;
  }

  public void totalCaisse() {
    System.out.printf("La caisse numéro %d a encaissé %.2f euros aujourd'hui\n", numéro, total);
  }

  public void scanner(Caddie caddie) {
    System.out.println("=========================================");
    System.out.println(dateDuJourFormatée());
    System.out.println("Caisse numéro " + numéro);
    System.out.println();
    int nbAchat = caddie.getNbAchats();
    double montantCaddie = 0;
    for (int i = 0; i < nbAchat; i++) {
      AchatArticle achat = caddie.getAchat(i);
      double prix = achat.calculerPrixAvecRemise();
      System.out.println(achat.getLigneFormatée());
      montantCaddie += prix;
    }
    System.out.println();
    System.out.println("Montant à payer : " + montantCaddie + " euros");
    System.out.println("=========================================\n");
    // Le total de caisse de la journée est mis à jour
    // à chaque appel de 'scanner'
    total += montantCaddie;
  }

  private String dateDuJourFormatée() {
    Date dateCourante = new Date();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
    String dateFormatée = formatDate.format(dateCourante);
    return dateFormatée;
  }
}
