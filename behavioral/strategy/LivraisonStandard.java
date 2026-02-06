public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFraisLivraison(double prixPlats, double distance) {
        double frais = 2.0 + (distance * 0.50);
        return frais;
    }

    @Override
    public String getDescription() {
        return "Livraison Standard (30-45 min) - 2€ + 0.50€/km";
    }
}
