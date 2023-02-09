package fr.pgah.tp;

import java.util.ArrayList;

public class Caddie {
  private ArrayList<AchatArticle> listeAchats;

  public Caddie() {
    listeAchats = new ArrayList<>();
  }

  public void remplir(Article article, int quantite) {
    AchatArticle achat = new AchatArticle(article, quantite);
    listeAchats.add(achat);
  }

  public AchatArticle getAchat(int index) {
    return listeAchats.get(index);
  }

  public int getNbAchats() {
    return listeAchats.size();
  }
}
