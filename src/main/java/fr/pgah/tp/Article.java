package fr.pgah.tp;

public class Article {
  private String nom;
  private double prix;
  private boolean enPromotion;

  public Article(String nom, double prix, boolean enPromotion) {
    this.nom = nom;
    this.prix = prix;
    this.enPromotion = enPromotion;
  }

  public String getNom() {
    return nom;
  }

  public double getPrix() {
    return prix;
  }

  public boolean estEnPromotion() {
    return enPromotion;
  }
}
