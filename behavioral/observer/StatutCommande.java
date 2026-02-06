import java.util.ArrayList;
import java.util.List;

public class StatutCommande {
    private List<Observer> observers = new ArrayList<>();
    private String numeroCommande;
    private String statut;

    public StatutCommande(String numeroCommande) {
        this.numeroCommande = numeroCommande;
        this.statut = "En attente";
    }

    public void ajouterObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Nouvel observateur ajoute pour la commande " + numeroCommande);
    }

    public void retirerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changerStatut(String nouveauStatut) {
        this.statut = nouveauStatut;
        System.out.println("\nCommande " + numeroCommande + " - Nouveau statut: " + statut);
        notifierObservers();
    }

    private void notifierObservers() {
        String message = "Commande " + numeroCommande + " : " + statut;
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public String getNumeroCommande() {
        return numeroCommande;
    }

    public String getStatut() {
        return statut;
    }
}
