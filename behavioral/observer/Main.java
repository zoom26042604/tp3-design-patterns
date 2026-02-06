public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Système de Suivi de Commandes ===\n");

        StatutCommande commande = new StatutCommande("#12345");

        Client client = new Client("Jean Dupont");
        Cuisinier cuisinier = new Cuisinier("Chef Marcel");
        Livreur livreur = new Livreur("Paul");

        System.out.println("Configuration des notifications:");
        commande.ajouterObserver(client);
        commande.ajouterObserver(cuisinier);
        commande.ajouterObserver(livreur);

        System.out.println();
        
        commande.changerStatut("Confirmee");
        
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        
        commande.changerStatut("En préparation");
        
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        
        commande.changerStatut("Prête");
        
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        
        commande.changerStatut("En livraison");
        
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        
        commande.changerStatut("Livree");

        System.out.println("\nLe pattern Observer permet de notifier automatiquement");
        System.out.println("tous les observateurs lors d'un changement de statut!");
    }
}
