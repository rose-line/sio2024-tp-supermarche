package fr.pgah.tp;

public class AchatArticle {
  private Article article;
  private int quantité;

  public AchatArticle(Article article, int quantité) {
    this.article = article;
    this.quantité = quantité;
  }

  public double calculerPrixAvecRemise() {
    double remise = 1.0;
    if (article.estEnPromotion()) {
      remise = 0.5;
    }
    return calculerPrixSansRemise() * remise;
  }

  private double calculerPrixSansRemise() {
    return quantité * article.getPrix();
  }

  public String getLigneFormatée() {
    String nom = article.getNom();
    double prixUnitaire = article.getPrix();
    double prixTotalSansRemise = calculerPrixSansRemise();
    String ligne =
        nom + " : " + prixUnitaire + " x " + quantité + " = " + prixTotalSansRemise + " euros";
    if (article.estEnPromotion()) {
      double prixTotalAvecRemise = calculerPrixAvecRemise();
      ligne += " (remise 50 %) => " + prixTotalAvecRemise + " euros";
    }
    return ligne;
  }
}
