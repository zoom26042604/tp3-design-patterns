import java.util.List;

public class CommandeValidationFacade {
    private ServiceConnexion serviceConnexion;
    private ServiceIngredients serviceIngredients;
    private ServiceTemps serviceTemps;
    private ServiceLivreur serviceLivreur;
    private ServicePerimetre servicePerimetre;

    public CommandeValidationFacade() {
        this.serviceConnexion = new ServiceConnexion();
        this.serviceIngredients = new ServiceIngredients();
        this.serviceTemps = new ServiceTemps();
        this.serviceLivreur = new ServiceLivreur();
        this.servicePerimetre = new ServicePerimetre();
    }

    public boolean validerCommande(String utilisateur, List<String> ingredients, 
                                   int minutesAvantFermeture, String adresse) {
        System.out.println("Validation de la commande pour " + utilisateur + "...\n");

        if (!serviceConnexion.verifierConnexion(utilisateur)) {
            System.out.println("Echec: utilisateur non connecte\n");
            return false;
        }

        if (!serviceIngredients.verifierDisponibilite(ingredients)) {
            System.out.println("Echec: ingredients manquants\n");
            return false;
        }

        if (!serviceTemps.verifierTempsPreparation(minutesAvantFermeture)) {
            System.out.println("Echec: temps insuffisant\n");
            return false;
        }

        if (!serviceLivreur.verifierDisponibiliteLivreur()) {
            System.out.println("Echec: aucun livreur disponible\n");
            return false;
        }

        if (!servicePerimetre.verifierPerimetre(adresse)) {
            System.out.println("Echec: adresse hors perimetre\n");
            return false;
        }

        System.out.println("Commande validee avec succes!\n");
        return true;
    }
}
