public class Commande {
    private String client;
    private double prixPlats;
    private double distance;
    private StrategieLivraison strategieLivraison;

    public Commande(String client, double prixPlats, double distance) {
        this.client = client;
        this.prixPlats = prixPlats;
        this.distance = distance;
    }

    public void setStrategieLivraison(StrategieLivraison strategie) {
        this.strategieLivraison = strategie;
    }

    public double calculerTotal() {
        if (strategieLivraison == null) {
            throw new IllegalStateException("Stratégie de livraison non définie");
        }
        double fraisLivraison = strategieLivraison.calculerFraisLivraison(prixPlats, distance);
        return prixPlats + fraisLivraison;
    }

    public void afficherRecapitulatif() {
        if (strategieLivraison == null) {
            System.out.println("Strategie de livraison non definie");
            return;
        }

        System.out.println("Commande de " + client);
        System.out.printf("Prix des plats: %.2f€%n", prixPlats);
        System.out.printf("Distance: %.1f km%n", distance);
        System.out.println("Mode de livraison: " + strategieLivraison.getDescription());
        
        double fraisLivraison = strategieLivraison.calculerFraisLivraison(prixPlats, distance);
        System.out.printf("Frais de livraison: %.2f€%n", fraisLivraison);
        System.out.printf("TOTAL: %.2f€%n", calculerTotal());
        System.out.println();
    }

    public String getClient() {
        return client;
    }

    public double getPrixPlats() {
        return prixPlats;
    }

    public double getDistance() {
        return distance;
    }
}
