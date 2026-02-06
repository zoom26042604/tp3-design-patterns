public class TPE {
    private static TPE instance;
    
    private double chiffreAffairesJournalier;
    private int numeroJour;

    private TPE() {
        this.chiffreAffairesJournalier = 0.0;
        this.numeroJour = 1;
    }

    public static synchronized TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public synchronized void enregistrerTransaction(String nomCaissier, double montant) {
        chiffreAffairesJournalier += montant;
        System.out.println(nomCaissier + " enregistre une transaction de " + montant + "€");
        System.out.println("Chiffre d'affaires actuel: " + chiffreAffairesJournalier + "€");
    }

    public double getChiffreAffairesJournalier() {
        return chiffreAffairesJournalier;
    }

    public int getNumeroJour() {
        return numeroJour;
    }

    public void nouvelleJournee() {
        System.out.println("\nFin du jour " + numeroJour);
        System.out.println("Chiffre d'affaires total: " + chiffreAffairesJournalier + "€");
        System.out.println("Réinitialisation du TPE pour le jour " + (numeroJour + 1) + "\n");
        
        chiffreAffairesJournalier = 0.0;
        numeroJour++;
    }

    public void afficherRapport() {
        System.out.println("\nRapport du jour " + numeroJour);
        System.out.println("Chiffre d'affaires: " + chiffreAffairesJournalier + "€");
    }
}
