public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast Analytics - Adaptateur CSV ===\n");

        String cheminFichier = "ventes.csv";
        System.out.println("Chargement du fichier: " + cheminFichier);
        
        try {
            LecteurCSV lecteurCSV = new LecteurCSV(cheminFichier);
            System.out.println("Fichier charge avec succes (" + lecteurCSV.getNbLignes() + " lignes)\n");

            AnalyseurVentes analyseur = new CSVAdapter(lecteurCSV);

            BurgerAnalytics analytics = new BurgerAnalytics(analyseur);

            System.out.println("Rapport des ventes:");
            analytics.genererRapport();

            System.out.println("\nLe pattern Adapter permet d'utiliser le LecteurCSV");
            System.out.println("   avec l'interface AnalyseurVentes attendue par BurgerAnalytics!");

        } catch (Exception e) {
            System.err.println("Erreur lors du traitement: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
