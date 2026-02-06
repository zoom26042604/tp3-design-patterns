import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Système de Commande ===\n");

        CommandeValidationFacade facade = new CommandeValidationFacade();

        System.out.println("COMMANDE 1");
        List<String> ingredients1 = Arrays.asList("pain", "steak", "salade", "tomate");
        boolean resultat1 = facade.validerCommande(
            "Jean Dupont",
            ingredients1,
            45,
            "12 rue de Paris, Centre-ville"
        );
        System.out.println("Resultat: " + (resultat1 ? "ACCEPTEE" : "REFUSEE"));

        System.out.println("\nCOMMANDE 2");
        List<String> ingredients2 = Arrays.asList("pain", "truffe", "foie gras");
        boolean resultat2 = facade.validerCommande(
            "Marie Martin",
            ingredients2,
            60,
            "45 avenue Victor Hugo"
        );
        System.out.println("Resultat: " + (resultat2 ? "ACCEPTEE" : "REFUSEE"));

        System.out.println("\nCOMMANDE 3");
        List<String> ingredients3 = Arrays.asList("pain", "poulet", "sauce BBQ");
        boolean resultat3 = facade.validerCommande(
            "Pierre Dubois",
            ingredients3,
            15,
            "8 boulevard des Capucines"
        );
        System.out.println("Resultat: " + (resultat3 ? "ACCEPTEE" : "REFUSEE"));

        System.out.println("\nCOMMANDE 4");
        List<String> ingredients4 = Arrays.asList("pain", "jambon", "fromage");
        boolean resultat4 = facade.validerCommande(
            "Sophie Leroy",
            ingredients4,
            30,
            "Route de la campagne, Banlieue lointaine"
        );
        System.out.println("Resultat: " + (resultat4 ? "ACCEPTEE" : "REFUSEE"));

        System.out.println("\nLe pattern Facade simplifie l'utilisation");
        System.out.println("   de multiples services avec une seule méthode!");
    }
}
