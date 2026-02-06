public class ServicePerimetre {
    public boolean verifierPerimetre(String adresse) {
        System.out.println("  ✓ Vérification du périmètre de livraison: " + adresse);
        if (adresse.toLowerCase().contains("banlieue") || adresse.toLowerCase().contains("campagne")) {
            System.out.println("    ⚠ Adresse hors du périmètre de livraison");
            return false;
        }
        return true;
    }
}
