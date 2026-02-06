public class ServiceTemps {
    public boolean verifierTempsPreparation(int minutesAvantFermeture) {
        System.out.println("  ✓ Vérification du temps de préparation (" + minutesAvantFermeture + " min avant fermeture)");
        if (minutesAvantFermeture < 20) {
            System.out.println("    ⚠ Temps insuffisant pour préparer la commande");
            return false;
        }
        return true;
    }
}
