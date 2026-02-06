public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Modes de Livraison ===\n");

        Commande commande1 = new Commande("Jean Dupont", 25.50, 5.0);
        commande1.setStrategieLivraison(new LivraisonStandard());
        commande1.afficherRecapitulatif();

        Commande commande2 = new Commande("Marie Martin", 32.00, 3.5);
        commande2.setStrategieLivraison(new LivraisonExpress());
        commande2.afficherRecapitulatif();

        Commande commande3 = new Commande("Pierre Dubois", 18.50, 0.0);
        commande3.setStrategieLivraison(new ClickAndCollect());
        commande3.afficherRecapitulatif();

        System.out.println("Changement de strategie pour la commande 1");
        
        System.out.println("Avant (Standard):");
        commande1.setStrategieLivraison(new LivraisonStandard());
        System.out.printf("Total: %.2f€%n%n", commande1.calculerTotal());
        
        System.out.println("Apres changement vers Express:");
        commande1.setStrategieLivraison(new LivraisonExpress());
        System.out.printf("Total: %.2f€%n%n", commande1.calculerTotal());

        System.out.println("Le pattern Strategy permet de changer dynamiquement");
        System.out.println("   le comportement de calcul des frais de livraison!");
    }
}
