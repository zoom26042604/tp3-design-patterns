public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Système TPE ===\n");

        TPE tpeCaissier1 = TPE.getInstance();
        TPE tpeCaissier2 = TPE.getInstance();
        TPE tpeCaissier3 = TPE.getInstance();

        System.out.println("Vérification du Singleton:");
        System.out.println("Caissier 1 et 2 utilisent le même TPE? " + (tpeCaissier1 == tpeCaissier2));
        System.out.println("Caissier 2 et 3 utilisent le même TPE? " + (tpeCaissier2 == tpeCaissier3));
        System.out.println();

        System.out.println("=== Jour 1 ===");
        tpeCaissier1.enregistrerTransaction("Alice", 25.50);
        tpeCaissier2.enregistrerTransaction("Bob", 18.00);
        tpeCaissier1.enregistrerTransaction("Alice", 32.00);
        tpeCaissier3.enregistrerTransaction("Charlie", 27.50);
        tpeCaissier2.enregistrerTransaction("Bob", 15.00);
        tpeCaissier3.enregistrerTransaction("Charlie", 40.00);

        tpeCaissier1.afficherRapport();

        System.out.println("\nVérification des montants:");
        System.out.println("TPE Caissier 1: " + tpeCaissier1.getChiffreAffairesJournalier() + "€");
        System.out.println("TPE Caissier 2: " + tpeCaissier2.getChiffreAffairesJournalier() + "€");
        System.out.println("TPE Caissier 3: " + tpeCaissier3.getChiffreAffairesJournalier() + "€");

        tpeCaissier1.nouvelleJournee();

        System.out.println("=== Jour 2 ===");
        tpeCaissier1.enregistrerTransaction("Alice", 22.00);
        tpeCaissier2.enregistrerTransaction("Bob", 19.50);
        tpeCaissier3.enregistrerTransaction("Charlie", 35.00);

        tpeCaissier1.afficherRapport();
        
        System.out.println("\nLe pattern Singleton garantit qu'une seule instance du TPE existe!");
    }
}
